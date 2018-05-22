package com.fengmangbilu.microservice.finance.services;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fengmangbilu.microservice.finance.endpoints.WxPayUnifiedOrderRequest;
import com.fengmangbilu.microservice.finance.endpoints.WxPayUnifiedOrderResponse;

/**
 * 微信支付接口
 */
@Validated
public interface WxPayService {
	
	/**
	 * 统一下单。在发起微信支付前，需要调用统一下单接口，获取"预支付交易会话标识"
	 * 接口地址：https://api.mch.weixin.qq.com/pay/unifiedorder
	 */
	WxPayUnifiedOrderResponse unifiedOrder(@Valid WxPayUnifiedOrderRequest request);
}
