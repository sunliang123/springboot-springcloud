package com.fengmangbilu.microservice.finance.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

import com.fengmangbilu.microservice.finance.endpoints.InvoiceSettingRequest;
import com.fengmangbilu.microservice.finance.enums.AuditStatus;
import com.fengmangbilu.microservice.finance.enums.InvoiceType;
import com.fengmangbilu.util.RegexUtils;

public class InvoiceSettingValidator implements ConstraintValidator<InvoiceSettingConstraint, InvoiceSettingRequest> {

	@Override
	public void initialize(final InvoiceSettingConstraint constraintAnnotation) {
	}

	@Override
	public boolean isValid(InvoiceSettingRequest request, ConstraintValidatorContext context) {
		String title = request.getTitle();
		if (!StringUtils.hasText(title)) {
			return createSingleConstraintViolation(context, "title", "发票抬头不能为空");
		}
		InvoiceType type = request.getType();
		if (type.equals(InvoiceType.SPECIAL)) {
			String taxRegisterNo = request.getTaxRegisterNo();
			if (!StringUtils.hasText(taxRegisterNo)) {
				return createSingleConstraintViolation(context, "taxRegisterNo", "税务登记证号不能为空");
			}
			String bank = request.getBank();
			if (!StringUtils.hasText(bank)) {
				return createSingleConstraintViolation(context, "bank", "基本开户银行不能为空");
			}
			String bankNo = request.getBankNo();
			if (!StringUtils.hasText(bankNo)) {
				return createSingleConstraintViolation(context, "bankNo", "基本开户账号不能为空");
			}
			String address = request.getOperatingLicenseAddress();
			if (!StringUtils.hasText(address)) {
				return createSingleConstraintViolation(context, "operatingLicenseAddress", "注册场所地址不能为空");
			}
			String phone = request.getOperatingLicensePhone();
			if (!StringUtils.hasText(phone)) {
				return createSingleConstraintViolation(context, "operatingLicensePhone", "注册固定电话不能为空");
			}
			if (!RegexUtils.isPhone(phone)) {
				return createSingleConstraintViolation(context, "operatingLicensePhone", "注册固定电话长度为5至17位");
			}
			request.setStatus(AuditStatus.AUDITING);
		}
		return true;
	}

	protected boolean createSingleConstraintViolation(ConstraintValidatorContext context, String name, String message) {
		context.buildConstraintViolationWithTemplate(message).addPropertyNode(name).addConstraintViolation();
		return false;
	}
}
