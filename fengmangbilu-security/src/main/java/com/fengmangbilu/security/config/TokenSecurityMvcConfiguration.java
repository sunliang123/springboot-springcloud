package com.fengmangbilu.security.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.web.method.annotation.AuthenticationPrincipalArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fengmangbilu.security.token.DefaultTokenService;
import com.fengmangbilu.security.token.JwtAccessTokenConverter;
import com.fengmangbilu.security.token.JwtTokenStore;
import com.fengmangbilu.security.token.TokenService;
import com.fengmangbilu.security.token.TokenStore;

@Configuration
public class TokenSecurityMvcConfiguration extends WebMvcConfigurerAdapter {
	
	@Bean
	protected JwtAccessTokenConverter jwtTokenEnhancer() throws Exception {
		JwtAccessTokenConverter tokenEnhancer = new JwtAccessTokenConverter();
		tokenEnhancer.afterPropertiesSet();
		return tokenEnhancer;
	}

	@Bean
	public TokenService tokenService() throws Exception {
		DefaultTokenService tokenService = new DefaultTokenService();
		tokenService.setTokenStore(tokenStore());
		tokenService.setTokenEnhancer(jwtTokenEnhancer());
		return tokenService;
	}

	@Bean
	public TokenStore tokenStore() throws Exception {
		JwtTokenStore tokenStore = new JwtTokenStore();
		tokenStore.setTokenEnhancer(jwtTokenEnhancer());
		return tokenStore;
	}

	@Lazy
	@Bean
	public AuthenticationPrincipalArgumentResolver authenticationPrincipalArgumentResolver() {
		return new AuthenticationPrincipalArgumentResolver();
	}

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
		argumentResolvers.add(authenticationPrincipalArgumentResolver());
	}
}
