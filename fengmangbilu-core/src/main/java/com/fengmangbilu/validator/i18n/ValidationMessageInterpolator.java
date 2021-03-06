package com.fengmangbilu.validator.i18n;

import java.util.Locale;

import org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator;
import org.hibernate.validator.resourceloading.PlatformResourceBundleLocator;
import org.springframework.context.i18n.LocaleContextHolder;

public class ValidationMessageInterpolator extends ResourceBundleMessageInterpolator {

    private static final String DEFAULT_VALIDATION_MESSAGES = "ValidationMessages";

    public ValidationMessageInterpolator() {
        super(new PlatformResourceBundleLocator(DEFAULT_VALIDATION_MESSAGES));
    }

    @Override
    public String interpolate(String message, Context context) {
        return interpolate(message, context, LocaleContextHolder.getLocale());
    }

    @Override
    public String interpolate(String message, Context context, Locale locale) {
        return super.interpolate(message, context, locale);
    }

}