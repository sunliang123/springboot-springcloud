package com.fengmangbilu.security.token;

import java.util.Map;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

public interface AuthenticationConverter {

	final String AUTHORITIES = "authorities";

	final String USERNAME = "username";

	Map<String, ?> convertAuthentication(Authentication authentication);

	UsernamePasswordAuthenticationToken extractAuthentication(Map<String, ?> map);

}
