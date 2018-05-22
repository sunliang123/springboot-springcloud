package com.fengmangbilu.validator.constraints;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.fengmangbilu.validator.DateRangeValidator;

/**
 * @author Justice
 */
@Target({ TYPE, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {DateRangeValidator.class})
public @interface DateRange {

    String message() default "{com.fengmangbilu.data.validator.constraints.DateRange.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String start();
    
    String end();
    
    @Target({ TYPE, ANNOTATION_TYPE })
    @Retention(RUNTIME)
    @Documented
    @interface List {
        DateRange[] value();
    }
}
