package com.fengmangbilu.security.token;

import java.util.Map;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import com.fengmangbilu.security.AccessToken;

public interface AccessTokenConverter {

	final String EXP = "exp";
	
	final String JTI = "jti";
	
	final String ATI = "ati";

	Map<String, ?> convertAccessToken(AccessToken token, Authentication authentication);

	AccessToken extractAccessToken(String value, Map<String, ?> map);

	UsernamePasswordAuthenticationToken extractAuthentication(Map<String, ?> map);

}
