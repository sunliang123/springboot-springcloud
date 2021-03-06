package com.fengmangbilu.security.config;

import java.util.Collections;

import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationEventPublisher;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExceptionHandlingConfigurer;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter;
import org.springframework.security.web.util.matcher.MediaTypeRequestMatcher;
import org.springframework.util.Assert;
import org.springframework.web.accept.ContentNegotiationStrategy;
import org.springframework.web.accept.HeaderContentNegotiationStrategy;

import com.fengmangbilu.security.authentication.TokenAuthenticationManager;
import com.fengmangbilu.security.authentication.TokenAuthenticationProcessingFilter;
import com.fengmangbilu.security.authentication.TokenExtractor;
import com.fengmangbilu.security.error.TokenAccessDeniedHandler;
import com.fengmangbilu.security.error.TokenAuthenticationEntryPoint;
import com.fengmangbilu.security.token.TokenService;

public final class TokenSecurityConfigurer extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {

	private AuthenticationEntryPoint authenticationEntryPoint = new TokenAuthenticationEntryPoint();

	private AccessDeniedHandler accessDeniedHandler = new TokenAccessDeniedHandler();

	private AuthenticationEventPublisher eventPublisher = null;

	private TokenService tokenService;

	private TokenExtractor tokenExtractor;

	public TokenSecurityConfigurer() {
	}

	@Override
	public void init(HttpSecurity http) throws Exception {
		registerDefaultAuthenticationEntryPoint(http);
	}

	@SuppressWarnings("unchecked")
	private void registerDefaultAuthenticationEntryPoint(HttpSecurity http) {
		ExceptionHandlingConfigurer<HttpSecurity> exceptionHandling = http.getConfigurer(ExceptionHandlingConfigurer.class);
		if (exceptionHandling == null) {
			return;
		}
		ContentNegotiationStrategy contentNegotiationStrategy = http.getSharedObject(ContentNegotiationStrategy.class);
		if (contentNegotiationStrategy == null) {
			contentNegotiationStrategy = new HeaderContentNegotiationStrategy();
		}
		MediaTypeRequestMatcher preferredMatcher = new MediaTypeRequestMatcher(contentNegotiationStrategy, MediaType.APPLICATION_ATOM_XML,
				MediaType.APPLICATION_FORM_URLENCODED, MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM,
				MediaType.APPLICATION_XML, MediaType.MULTIPART_FORM_DATA, MediaType.TEXT_XML);
		preferredMatcher.setIgnoredMediaTypes(Collections.singleton(MediaType.ALL));
		exceptionHandling.defaultAuthenticationEntryPointFor(postProcess(authenticationEntryPoint), preferredMatcher);
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		// @formatter:off
		http
			.authorizeRequests()
		.and()
			.addFilterBefore(tokenAuthenticationFilter(http), AbstractPreAuthenticatedProcessingFilter.class)
			.exceptionHandling()
				.accessDeniedHandler(accessDeniedHandler)
				.authenticationEntryPoint(authenticationEntryPoint);
		// @formatter:on
	}
	
	private TokenAuthenticationProcessingFilter tokenAuthenticationFilter(HttpSecurity http) {
		TokenAuthenticationProcessingFilter tokenFilter = new TokenAuthenticationProcessingFilter();
		tokenFilter.setAuthenticationEntryPoint(authenticationEntryPoint);
		tokenFilter.setAuthenticationManager(tokenAuthenticationManager(http));
		if (eventPublisher != null) {
			tokenFilter.setAuthenticationEventPublisher(eventPublisher);
		}
		if (tokenExtractor != null) {
			tokenFilter.setTokenExtractor(tokenExtractor);
		}
		tokenFilter = postProcess(tokenFilter);
		return tokenFilter;
	}

	private AuthenticationManager tokenAuthenticationManager(HttpSecurity http) {
		Assert.state(tokenService != null, "tokenService cannot be null");
		TokenAuthenticationManager tokenAuthenticationManager = new TokenAuthenticationManager();
		tokenAuthenticationManager.setTokenService(tokenService);
		return tokenAuthenticationManager;
	}

	public void setAuthenticationEntryPoint(AuthenticationEntryPoint authenticationEntryPoint) {
		this.authenticationEntryPoint = authenticationEntryPoint;
	}

	public void setAccessDeniedHandler(AccessDeniedHandler accessDeniedHandler) {
		this.accessDeniedHandler = accessDeniedHandler;
	}
	
	public AccessDeniedHandler getAccessDeniedHandler() {
		return accessDeniedHandler;
	}

	public void setEventPublisher(AuthenticationEventPublisher eventPublisher) {
		this.eventPublisher = eventPublisher;
	}

	public void setTokenService(TokenService tokenService) {
		this.tokenService = tokenService;
	}

	public void setTokenExtractor(TokenExtractor tokenExtractor) {
		this.tokenExtractor = tokenExtractor;
	}

}
