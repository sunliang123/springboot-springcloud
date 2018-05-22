package com.fengmangbilu.microservice.user.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

import com.fengmangbilu.microservice.user.endpoints.TokenRequest;
import com.fengmangbilu.microservice.user.exceptions.UserException;

public class TokenRequestValidator implements ConstraintValidator<TokenRequestConstraint, TokenRequest> {

	@Override
	public void initialize(final TokenRequestConstraint constraintAnnotation) {
	}

	@Override
	public boolean isValid(TokenRequest request, ConstraintValidatorContext context) {
		String username = request.getUsername();
		String password = request.getPassword();
		if (!StringUtils.hasText(username)) {
			return createSingleConstraintViolation(context, "username", UserException.ERR_MOBILE_IS_BLANK.getName());
		}
		if (!StringUtils.hasText(password)) {
			return createSingleConstraintViolation(context, "password", UserException.ERR_PASSWORD_IS_BLANK.getName());
		}
		return true;
	}

	protected boolean createSingleConstraintViolation(ConstraintValidatorContext context, String name, String message) {
		context.buildConstraintViolationWithTemplate(message).addPropertyNode(name).addConstraintViolation();
		return false;
	}
}
