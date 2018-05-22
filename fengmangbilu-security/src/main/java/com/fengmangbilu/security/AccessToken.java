package com.fengmangbilu.security;

import java.util.Date;

public interface AccessToken{
	
	public static String BEARER_TYPE = "Bearer";
	
	public static String ACCESS_TOKEN = "token";
	
	String getJti();
	
	String getAti();

	RefreshToken getRefreshToken();

	boolean isExpired();

	Date getExpiration();

	String getToken();

}
