package com.fengmangbilu.microservice.user.constraints;

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
@Constraint(validatedBy = {TokenRequestValidator.class})
public @interface TokenRequestConstraint {

	String message() default "参数验证错误";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	@Target({TYPE, ANNOTATION_TYPE})
	@Retention(RUNTIME)
	@Documented
	@interface List {
		TokenRequestConstraint[] value();
	}
}
