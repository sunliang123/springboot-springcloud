package com.fengmangbilu.microservice.user.endpoints;

import com.fengmangbilu.microservice.user.constraints.UserRequestConstraint;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@UserRequestConstraint
public class UserRequest {

	private String mobile;

	private String password;

	private String smsCode;
}
