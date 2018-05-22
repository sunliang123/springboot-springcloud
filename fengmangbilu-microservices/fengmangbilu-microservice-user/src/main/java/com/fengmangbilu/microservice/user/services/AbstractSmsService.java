package com.fengmangbilu.microservice.user.services;

import java.util.Random;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

public abstract class AbstractSmsService<T> implements SmsService<T> {
	
	public static final String SMS_SOURCE_REGISTER = "register";
	
	public static final String SMS_SOURCE_REST_PASSWORD = "rest_passwor";
	
	public static final String SMS_SOURCE_LOGIN = "login";
	
    @Override
    @Cacheable(value = "sms", key = "#mobile + ':' + #source", unless = "#result==null")
    public String getSmsCode(String mobile, String source) {
        return null;
    }

    @Override
    @CachePut(value = "sms", key = "#mobile + ':' +#source")
    public String putSmsCode(String mobile, String source) {
        return String.valueOf(new Random().nextInt(899999) + 100000);
    }

}
