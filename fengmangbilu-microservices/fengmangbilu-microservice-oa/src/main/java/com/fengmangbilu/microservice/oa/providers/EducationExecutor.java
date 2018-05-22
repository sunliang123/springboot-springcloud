package com.fengmangbilu.microservice.oa.providers;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fengmangbilu.microservice.oa.endpoints.ReportRequest;
import com.fengmangbilu.microservice.oa.exceptions.ReportException;
import com.fengmangbilu.microservice.oa.providers.crypto.Sign;
import com.fengmangbilu.util.HttpUtils;

public class EducationExecutor implements Callable<JSONObject> {
	private final Logger logger = LoggerFactory.getLogger(EducationExecutor.class);
	private final static String KAOLA_URL = "https://access.kaolazhengxin.com:8453/authentication.do?_t=json";
	private final static String JD_URL = "https://way.jd.com/shujudu/eduinfo?appkey=87f5764fc0bab42695ddd1f1eae7aef6&idname=%s&idnumber=%s";
	private final ReportRequest request;
	private CountDownLatch latch;

	public EducationExecutor(ReportRequest request, CountDownLatch latch) {
		this.request = request;
		this.latch = latch;
	}

	@Override
	public JSONObject call() throws ReportException {
		try {
			Map<String, String> reqMap = new HashMap<String, String>();
			reqMap.put("userName", request.getName());
			reqMap.put("identity", request.getIdCard());
			Map<String, String> signMap;
			try {
				signMap = Sign.getSign(reqMap);
			} catch (Exception e) {
				logger.error(e.getMessage());
				throw ReportException.ENCRYPT;
			}
			signMap.put("prdGrpId", "baseInfoQuery");
			signMap.put("prdId", "qrySingleEducationReview");
			String ret = HttpUtils.getInstance().doPost(KAOLA_URL, signMap);
			JSONObject retObject = JSON.parseObject(ret);
			String retCode = retObject.getString("retCode");
			String retMsg = retObject.getString("retMsg");
			if ("000000".equals(retCode)) {
				JSONObject resultObject;
				try {
					resultObject = Sign.getSignVeryfy(retObject);
				} catch (Exception e) {
					logger.error(e.getMessage());
					throw ReportException.SIGN;
				}
				String result = resultObject.getString("result");
				String message = resultObject.getString("message");
				if (StringUtils.equals(result, "0")) {
					logger.debug("学历接口查询结果: {}", resultObject);
					return resultObject;
				} else {
					logger.debug("考拉学历查询失败：{}", message);
				}
			} else {
				logger.error(retMsg);
				throw new ReportException(retMsg);
			}

			String api = String.format(JD_URL, request.getName(), request.getIdCard());
			String result = HttpUtils.getInstance().doGet(api);
			JSONObject resultObject = JSONObject.parseObject(result);
			String code = resultObject.getString("code");
			if (code.equals("10000")) {
				resultObject = resultObject.getJSONObject("result");
				String resId = resultObject.getString("resid");
				JSONObject data = resultObject.getJSONObject("data");
				if (resId.equals("0") && data != null) {
					String resultMsg = data.getString("resulttext");
					if (data.get("result").equals("1")) {
						logger.debug("学历接口查询结果: {}", data);
						return data;
					} else {
						logger.debug("京东学历查询失败：{}", resultMsg);
						return null;
					}
				} else {
					String resmsg = resultObject.getString("resmsg");
					logger.debug("京东学历查询失败：{}", resmsg);
					return null;
				}
			} else {
				String msg = resultObject.getString("msg");
				logger.error(msg);
				throw new ReportException(msg);
			}
		} finally {
			latch.countDown();
		}
	}
}
