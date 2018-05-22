package com.fengmangbilu.microservice.oa.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.fengmangbilu.web.Response;

@FeignClient("user")
public interface UserClient {

	@PostMapping("grantUserHrRole")
	public Response grantUserHrRole(@RequestHeader("Authorization") String token,@RequestParam("userId") String userId);
	
	@PostMapping("grantUserEmpRole")
	public Response grantUserEmpRole(@RequestHeader("Authorization") String token,@RequestParam("userId") String userId);
	
	@PostMapping("resetUserRole")
	public Response resetUserRole(@RequestHeader("Authorization") String token); 
	
	@GetMapping("findByMobile")
	public Response findByMobile(@RequestParam("mobile") String mobile);
}
