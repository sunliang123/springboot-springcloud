package com.fengmangbilu.microservice.finance.services;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.fengmangbilu.microservice.finance.endpoints.WxPayUnifiedOrderRequest;
import com.fengmangbilu.microservice.finance.endpoints.WxPayUnifiedOrderResponse;
import com.fengmangbilu.microservice.finance.utils.JaxbUtil;
import com.fengmangbilu.microservice.finance.utils.RandomUtil;
import com.fengmangbilu.microservice.finance.utils.SignUtil;
import com.fengmangbilu.util.HttpUtils;

@Service
@Validated
public class WxPayServiceImpl implements WxPayService {

	private final static Logger logger = LoggerFactory.getLogger(WxPayServiceImpl.class);
	
	@Value("${wxpay.appId}")
	private String appId;
	
	@Value("${wxpay.mchId}")
	private String mchId;
	
	@Value("${wxpay.key}")
	private String key;

	@Value("${wxpay.unifiedorder}")
	private String unifiedOrderUrl;

	@Override
	public WxPayUnifiedOrderResponse unifiedOrder(@Valid WxPayUnifiedOrderRequest request) {
		logger.debug("【微信支付统一下单】" + request);
		request.setAppid(appId);
		request.setMchId(mchId);
		request.setNonceStr(RandomUtil.generate(32, '0', 'Z'));
		request.setSign(SignUtil.getSign(request, key));
		String returnXml = HttpUtils.getInstance().doPost(unifiedOrderUrl, JaxbUtil.convertToXml(request));
		WxPayUnifiedOrderResponse response = JaxbUtil.converyToJavaBean(returnXml, WxPayUnifiedOrderResponse.class);
		return response;
	}
}
