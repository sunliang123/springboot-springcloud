package com.fengmangbilu.security.token;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import com.fengmangbilu.security.AccessToken;

public interface TokenService {

	UsernamePasswordAuthenticationToken loadAuthentication(String accessToken) throws AuthenticationException;

	AccessToken readAccessToken(String accessToken);

	AccessToken createAccessToken(Authentication authentication) throws AuthenticationException;

	AccessToken refreshAccessToken(String refreshToken) throws AuthenticationException;

	AccessToken getAccessToken(Authentication authentication);

	boolean revokeToken(String tokenValue);
}
