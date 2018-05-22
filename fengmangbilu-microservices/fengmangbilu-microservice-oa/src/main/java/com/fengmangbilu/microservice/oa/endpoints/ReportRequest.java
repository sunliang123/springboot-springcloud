package com.fengmangbilu.microservice.oa.endpoints;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

import com.fengmangbilu.validator.constraints.IdCard;
import com.fengmangbilu.validator.constraints.Mobile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReportRequest {

	@NotBlank(message = "姓名不能为空")
	@Pattern(regexp = "^[\u4e00-\u9fa5]+(·[\u4e00-\u9fa5]+)*$", message = "姓名格式不正确")
	private String name;

	@IdCard
	@NotBlank(message = "身份证不能为空")
	private String idCard;

	@Mobile
	@NotBlank(message = "手机号不能为空")
	private String mobile;

}
