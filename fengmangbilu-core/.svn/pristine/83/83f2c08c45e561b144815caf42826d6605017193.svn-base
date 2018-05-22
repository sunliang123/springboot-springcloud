package com.fengmangbilu.validator;

import java.math.BigDecimal;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.hibernate.validator.internal.util.logging.Log;
import org.hibernate.validator.internal.util.logging.LoggerFactory;

import com.fengmangbilu.validator.constraints.Decimal;

public class DecimalValidatorForCharSequence implements ConstraintValidator<Decimal, CharSequence> {

	private static final Log log = LoggerFactory.make();

	private int precision;// 有效位数
	private int scale;// 小数位数
	private BigDecimal maxValue;// 最大数
	private BigDecimal minValue;// 最小数
	private boolean inclusive;

	@Override
	public void initialize(Decimal constraintAnnotation) {
		this.precision = constraintAnnotation.precision();
		this.scale = constraintAnnotation.scale();
		String max = constraintAnnotation.max();
		String min = constraintAnnotation.min();
		if (max != null && max.length() > 0) {
			try {
				this.maxValue = new BigDecimal(constraintAnnotation.max());
			} catch (NumberFormatException nfe) {
				throw log.getInvalidBigDecimalFormatException(constraintAnnotation.max(), nfe);
			}
		}
		if (min != null && min.length() > 0) {
			try {
				this.minValue = new BigDecimal(constraintAnnotation.min());
			} catch (NumberFormatException nfe) {
				throw log.getInvalidBigDecimalFormatException(constraintAnnotation.min(), nfe);
			}
		}
		this.inclusive = constraintAnnotation.inclusive();
	}

	@Override
	public boolean isValid(CharSequence value, ConstraintValidatorContext constraintValidatorContext) {
		if (value == null || value.length() == 0) {
			return true;
		}
		try {
			BigDecimal val = new BigDecimal(value.toString());
			boolean maxComparisonResult = true;
			boolean minComparisonResult = true;
			if (maxValue != null) {
				int result = val.compareTo(maxValue);
				maxComparisonResult = inclusive ? result <= 0 : result < 0;
			}
			if (minValue != null) {
				int result = val.compareTo(minValue);
				minComparisonResult = inclusive ? result >= 0 : result > 0;
			}
			return maxComparisonResult && minComparisonResult && val.precision() <= precision && val.scale() <= scale;
		} catch (NumberFormatException e) {
			return false;
		}

	}

}
