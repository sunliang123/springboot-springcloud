package com.fengmangbilu.security.token;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import com.fengmangbilu.security.AccessToken;
import com.fengmangbilu.security.RefreshToken;

public interface TokenStore {

	UsernamePasswordAuthenticationToken readAuthentication(AccessToken token);

	UsernamePasswordAuthenticationToken readAuthentication(String token);

	void storeAccessToken(AccessToken token, Authentication authentication);

	AccessToken readAccessToken(String tokenValue);

	void removeAccessToken(AccessToken token);

	void storeRefreshToken(RefreshToken refreshToken, Authentication authentication);

	RefreshToken readRefreshToken(String tokenValue);

	UsernamePasswordAuthenticationToken readAuthenticationForRefreshToken(RefreshToken token);

	void removeRefreshToken(RefreshToken token);

	void removeAccessTokenUsingRefreshToken(RefreshToken refreshToken);

	AccessToken getAccessToken(Authentication authentication);
}
