package com.fengmangbilu.microservice.user.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

import com.fengmangbilu.microservice.user.endpoints.LoginRequest;
import com.fengmangbilu.microservice.user.exceptions.UserException;
import com.fengmangbilu.util.RegexUtils;

public class LoginRequestValidator implements ConstraintValidator<LoginRequestConstraint, LoginRequest> {

	@Override
	public void initialize(final LoginRequestConstraint constraintAnnotation) {
	}

	@Override
	public boolean isValid(LoginRequest request, ConstraintValidatorContext context) {
		String username = request.getMobile();
		String smsCode = request.getSmsCode();
		if (!StringUtils.hasText(username)) {
			return createSingleConstraintViolation(context, "mobile", UserException.ERR_MOBILE_IS_BLANK.getName());
		}
		if (!RegexUtils.isMobile(username)) {
			return createSingleConstraintViolation(context, "mobile", UserException.ERR_MOBILE_FORMAT.getName());
		}
		if (!StringUtils.hasText(smsCode)) {
			return createSingleConstraintViolation(context, "smsCode", UserException.ERR_SMS_CODE_IS_BLANK.getName());
		}
		return true;
	}

	protected boolean createSingleConstraintViolation(ConstraintValidatorContext context, String name, String message) {
		context.buildConstraintViolationWithTemplate(message).addPropertyNode(name).addConstraintViolation();
		return false;
	}
}
