package com.fengmangbilu.microservice.user.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

import com.fengmangbilu.microservice.user.endpoints.UserRequest;
import com.fengmangbilu.microservice.user.exceptions.UserException;
import com.fengmangbilu.util.RegexUtils;

public class UserRequestValidator implements ConstraintValidator<UserRequestConstraint, UserRequest> {

	@Override
	public void initialize(final UserRequestConstraint constraintAnnotation) {
	}

	@Override
	public boolean isValid(UserRequest request, ConstraintValidatorContext context) {
		String username = request.getMobile();
		String password = request.getPassword();
		String smsCode = request.getSmsCode();
		if (!StringUtils.hasText(username)) {
			return createSingleConstraintViolation(context, "mobile", UserException.ERR_MOBILE_IS_BLANK.getName());
		}
		if (!RegexUtils.isMobile(username)) {
			return createSingleConstraintViolation(context, "mobile", UserException.ERR_MOBILE_FORMAT.getName());
		}
		if (!StringUtils.hasText(password)) {
			return createSingleConstraintViolation(context, "password", UserException.ERR_PASSWORD_IS_BLANK.getName());
		}
		if (!RegexUtils.isPassword(password)) {
			return createSingleConstraintViolation(context, "password", UserException.ERR_PASSWORD_FORMAT.getName());
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
