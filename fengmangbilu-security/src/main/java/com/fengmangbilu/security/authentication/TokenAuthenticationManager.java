
package com.fengmangbilu.security.authentication;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.util.Assert;

import com.fengmangbilu.security.exceptions.InvalidTokenException;
import com.fengmangbilu.security.token.TokenService;

/**
 * 资源保护管理器
 * @author Justice
 */
public class TokenAuthenticationManager implements AuthenticationManager, InitializingBean {

	private TokenService tokenService;

	/**
	 * @param tokenServices the tokenServices to set
	 */
	public void setTokenService(TokenService tokenService) {
		this.tokenService = tokenService;
	}

	public void afterPropertiesSet() {
		Assert.state(tokenService != null, "tokenService are required");
	}

	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		if (authentication == null) {
			throw new InvalidTokenException("Invalid token (token not found)");
		}
		String token = (String) authentication.getPrincipal();
		UsernamePasswordAuthenticationToken auth = tokenService.loadAuthentication(token);
		if (auth == null) {
			throw new InvalidTokenException("Invalid token: " + token);
		}
		auth.setDetails(authentication.getDetails());
		return auth;

	}

}
