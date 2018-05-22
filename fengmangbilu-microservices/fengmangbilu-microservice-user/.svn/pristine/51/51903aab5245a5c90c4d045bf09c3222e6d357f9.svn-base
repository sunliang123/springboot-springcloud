package com.fengmangbilu.microservice.user.clients;

import javax.validation.Valid;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.fengmangbilu.microservice.user.endpoints.IdCardRequest;
import com.fengmangbilu.web.Response;

@FeignClient("oa")
public interface OaClient {

	@PostMapping("/report/getIdCard")
	public Response getIdCard(@RequestHeader("Authorization") String token, @Valid @RequestBody IdCardRequest request);
}
