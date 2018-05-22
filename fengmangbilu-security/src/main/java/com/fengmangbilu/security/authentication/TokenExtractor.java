package com.fengmangbilu.security.authentication;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;

public interface TokenExtractor {
	
	public static String TOKEN_HEADER_NAME = "Authorization";

	Authentication extract(HttpServletRequest request);
}
