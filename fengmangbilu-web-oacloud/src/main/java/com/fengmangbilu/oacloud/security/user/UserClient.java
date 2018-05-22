package com.fengmangbilu.oacloud.security.user;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fengmangbilu.web.Response;

@FeignClient("user")
public interface UserClient {

	@GetMapping("findByMobile")
	public Response findByMobile(@RequestParam("mobile") String mobile);
}
