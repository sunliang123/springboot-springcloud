package com.fengmangbilu.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.fengmangbilu.util.RegexUtils;
import com.fengmangbilu.validator.constraints.Mobile;

public class MobileValidator implements ConstraintValidator<Mobile, CharSequence> {

    @Override
    public void initialize(Mobile constraintAnnotation) {

    }

    @Override
    public boolean isValid(CharSequence value, ConstraintValidatorContext context) {

        if (value == null || value.length() == 0) {
            return true;
        }
        return RegexUtils.isMobile(value.toString());
    }
}
