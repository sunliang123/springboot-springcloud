package com.fengmangbilu.microservice.user.endpoints;

import com.fengmangbilu.microservice.user.constraints.LoginRequestConstraint;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@LoginRequestConstraint
public class LoginRequest {

	private String mobile;

	private String smsCode;

}
