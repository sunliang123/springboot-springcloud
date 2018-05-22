package com.fengmangbilu.microservice.finance.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fengmangbilu.microservice.finance.endpoints.WxPayUnifiedOrderRequest;
import com.fengmangbilu.microservice.finance.endpoints.WxPayUnifiedOrderResponse;
import com.fengmangbilu.microservice.finance.entities.Order;
import com.fengmangbilu.microservice.finance.enums.OrderStatus;
import com.fengmangbilu.microservice.finance.services.OrderService;
import com.fengmangbilu.microservice.finance.services.WxPayService;
import com.fengmangbilu.util.IPs;
import com.fengmangbilu.web.Response;

import io.swagger.annotations.Api;

@Api
@Validated
@RestController
@RequestMapping("wxpay")
public class WxPayController {

	@Autowired
	private WxPayService wxPayService;

	@Autowired
	private OrderService orderService;

	@PostMapping("web/unifiedOrder")
	public Response unifiedOrder(HttpServletRequest request, @RequestParam String buyerId, @RequestParam Long orderId)
			throws IOException {
		WxPayUnifiedOrderRequest wxPayRequest = new WxPayUnifiedOrderRequest();
		Order order = orderService.findByBuyerIdAndOrderId(buyerId, orderId);
		if (order == null) {
			return Response.error("订单不存在");
		}
		if (order.getOrderStatus().equals(OrderStatus.PAID)) {
			return Response.error("订单已支付");
		}
		if (order.getOrderStatus().equals(OrderStatus.CANCELED)) {
			return Response.error("订单已作废");
		}
		wxPayRequest.setTotalFee(order.getPayAmount().intValue());
		wxPayRequest.setSpbillCreateIp(IPs.getRemoteIp(request));
		wxPayRequest.setNotifyURL("http://www.baidu.com");
		wxPayRequest.setOutTradeNo(order.getOrderId().toString());
		wxPayRequest.setBody(order.getProductName());
		wxPayRequest.setTradeType("NATIVE");
		WxPayUnifiedOrderResponse result = wxPayService.unifiedOrder(wxPayRequest);
		return Response.ok(result);
	}

	@GetMapping("queryQRStatus")
	public Response queryQRStatus(@RequestParam Long orderId) throws IOException {
		orderService.save(new Order());
		Order order = orderService.findByOrderId(orderId);
		if (order == null) {
			return Response.error("订单不存在");
		}
		// if (order.getOrderStatus().equals(OrderStatus.PAID)) {
		// return Response.error("订单已支付");
		// }
		// if (order.getOrderStatus().equals(OrderStatus.CANCELED)) {
		// return Response.error("订单已作废");
		// }
		// wxPayRequest.setTotalFee(order.getPayAmount().intValue());
		// wxPayRequest.setSpbillCreateIp(WebUtils.getRemoteIp(request));
		// wxPayRequest.setNotifyURL("http://www.baidu.com");
		// wxPayRequest.setOutTradeNo(order.getOrderId());
		// wxPayRequest.setBody(order.getProductName());
		// wxPayRequest.setTradeType("NATIVE");
		// WxPayUnifiedOrderResponse result =
		// wxPayService.unifiedOrder(wxPayRequest);
		return Response.ok(null);
	}

}
