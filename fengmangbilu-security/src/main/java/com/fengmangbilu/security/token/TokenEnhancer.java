package com.fengmangbilu.security.token;

import org.springframework.security.core.Authentication;

import com.fengmangbilu.security.AccessToken;

public interface TokenEnhancer {

	AccessToken enhance(AccessToken accessToken, Authentication authentication);
}
