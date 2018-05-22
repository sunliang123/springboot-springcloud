package com.fengmangbilu.microservice.oa.providers;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fengmangbilu.microservice.oa.endpoints.ReportRequest;
import com.fengmangbilu.microservice.oa.exceptions.ReportException;
import com.fengmangbilu.microservice.oa.providers.crypto.Sign;
import com.fengmangbilu.util.HttpUtils;

public class ProviderContext {

	private final static Logger logger = LoggerFactory.getLogger(ProviderContext.class);

	private static ProviderContext context;

	private final static String KAOLA_URL = "https://access.kaolazhengxin.com:8453/authentication.do?_t=json";

	private ProviderStrategy strategy;
	
	private ReportRequest request;

	private boolean realNameAuth;

	public static ProviderContext getContext() {
		context = new ProviderContext();
		return context;
	}

	public ProviderContext execute(ReportRequest request) throws ReportException {
		strategy = ProviderStrategyFactory.getInstance().creator(request.getMobile());
		Map<String, String> params;
		try {
			params = strategy.getParams(request);
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw ReportException.ENCRYPT;
		}
		String ret = HttpUtils.getInstance().doPost(KAOLA_URL, params);
		JSONObject retObject = JSON.parseObject(ret);
		String retCode = retObject.getString("retCode");
		String retMsg = retObject.getString("retMsg");
		if (StringUtils.equals("000000", retCode)) {
			try {
				JSONObject resultObject = Sign.getSignVeryfy(retObject);
				logger.debug("手机实名认证结果:{}", resultObject.toJSONString());
				String result = resultObject.getString("result");
				this.setRequest(request);
				this.setRealNameAuth(StringUtils.equalsAny(result, "0", "T"));
				return this;
			} catch (Exception e) {
				logger.error(e.getMessage());
				throw ReportException.SIGN;
			}
		} else {
			logger.error(retMsg);
			throw new ReportException(retMsg);
		}
	}

	public boolean isRealNameAuth() {
		return realNameAuth;
	}

	public void setRealNameAuth(boolean realNameAuth) {
		this.realNameAuth = realNameAuth;
	}

	public ProviderStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(ProviderStrategy strategy) {
		this.strategy = strategy;
	}

	public ReportRequest getRequest() {
		return request;
	}

	public void setRequest(ReportRequest request) {
		this.request = request;
	}
	
}