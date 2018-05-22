package com.fengmangbilu.microservice.oa.endpoints;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.fengmangbilu.microservice.oa.enums.AuthStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthRequest {
	
	@NotNull(message = "请选择审核申请记录")
	private Long id;

	@NotNull(message = "请选择审核结果")
	private AuthStatus status;
	
	@NotBlank(message = "请填写审批意见")
	private String failureReason;
	
}
