package com.fengmangbilu.security.exceptions;

import java.util.Map;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@SuppressWarnings("serial")
@JsonSerialize(using = TokenExceptionJackson2Serializer.class)
public class TokenException extends RuntimeException {

	public static final String CODE = "code";
	public static final String MESSAGE = "message";
	public static final int INVALID_TOKEN = 901;
	public static final int EXPIRED_TOKEN = 902;

	public TokenException(String msg, Throwable t) {
		super(msg, t);
	}

	public TokenException(String msg) {
		super(msg);
	}

	public int getTokenErrorCode() {
		return 999;
	}

	public int getHttpErrorCode() {
		return 400;
	}

	public static TokenException create(int code, String errorMessage) {
		if (INVALID_TOKEN == code) {
			return new InvalidTokenException(errorMessage);
		} else if (EXPIRED_TOKEN == code) {
			return new ExpiredTokenException(errorMessage);
		} else {
			return new TokenException(errorMessage);
		}
	}

	public static TokenException valueOf(Map<String, Object> errorParams) {
		int errorCode = (int) errorParams.get(CODE);
		String errorMessage = errorParams.containsKey(MESSAGE) ? (String) errorParams.get(MESSAGE) : null;
		TokenException ex = create(errorCode, errorMessage);
		return ex;
	}
}
