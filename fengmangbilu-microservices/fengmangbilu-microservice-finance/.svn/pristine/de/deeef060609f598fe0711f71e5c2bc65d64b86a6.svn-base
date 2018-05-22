package com.fengmangbilu.microservice.finance.controllers;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fengmangbilu.microservice.finance.endpoints.InvoiceSettingRequest;
import com.fengmangbilu.microservice.finance.entities.InvoiceSetting;
import com.fengmangbilu.microservice.finance.services.InvoiceSettingService;
import com.fengmangbilu.web.Response;

import io.swagger.annotations.Api;

@Api
@Validated
@RestController
@RequestMapping("invoice")
public class InvoiceController {
	
	@Autowired
	private InvoiceSettingService invoiceSettingService;
	
	@PostMapping("setting/save")
	public Response save(@Valid @RequestBody InvoiceSettingRequest invoiceSettingRequest) {
		InvoiceSetting invoiceSetting = new InvoiceSetting();
		BeanUtils.copyProperties(invoiceSettingRequest, invoiceSetting);
		invoiceSettingService.save(invoiceSetting);
		return Response.ok();
	}
}
