package com.fengmangbilu.microservice.finance.constraints;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({TYPE, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {InvoiceSettingValidator.class})
public @interface InvoiceSettingConstraint {

	String message() default "参数验证错误";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	@Target({TYPE, ANNOTATION_TYPE})
	@Retention(RUNTIME)
	@Documented
	@interface List {
		InvoiceSettingConstraint[] value();
	}
}
