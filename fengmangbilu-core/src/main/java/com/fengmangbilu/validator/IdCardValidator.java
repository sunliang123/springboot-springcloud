package com.fengmangbilu.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.fengmangbilu.util.IdCardUtils;
import com.fengmangbilu.validator.constraints.IdCard;

/**
 * @author Justice
 */
public class IdCardValidator implements ConstraintValidator<IdCard, CharSequence> {

	@Override
	public void initialize(IdCard constraintAnnotation) {
	}

	@Override
	public boolean isValid(CharSequence value, ConstraintValidatorContext content) {

		if (value == null || value.length() == 0) {
			return true;
		}

		if (!IdCardUtils.validateCard(value.toString())) {
			return false;
		}

		return true;
	}
}
