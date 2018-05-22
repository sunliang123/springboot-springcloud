package com.fengmangbilu.microservice.oa.endpoints;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

import com.fengmangbilu.validator.constraints.IdCard;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyRequest {

	@NotBlank(message = "姓名不能为空")
	@Pattern(regexp = "^[\u4e00-\u9fa5]+(·[\u4e00-\u9fa5]+)*$", message = "姓名格式不正确")
	private String name;

	@IdCard
	@NotBlank(message = "身份证不能为空")
	private String idCard;
	
	@NotBlank(message = "部门不能为空")
	private String dept;
	
	@NotBlank(message = "职位不能为空")
	private String position;
	
	@NotBlank(message = "公司名称不能为空")
	private String companyName;
	
	@NotBlank(message = "公司规模不能为空")
	private String compayScale;
	
	@NotBlank(message = "营业执照不能为空")
	private String businessLicense;
}
