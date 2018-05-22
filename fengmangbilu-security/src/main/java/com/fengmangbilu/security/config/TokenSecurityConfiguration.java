package com.fengmangbilu.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.security.authentication.AnonymousAuthenticationProvider;
import org.springframework.security.authentication.AuthenticationEventPublisher;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

import com.fengmangbilu.security.token.TokenService;

@EnableConfigurationProperties(TokenSecurityProperties.class)
public class TokenSecurityConfiguration extends WebSecurityConfigurerAdapter implements Ordered {
	
	@Autowired
	private TokenService tokenService;

	@Autowired
	private TokenSecurityProperties tokenSecurityProperties;

	@Autowired(required = false)
	private AuthenticationEventPublisher eventPublisher;

	@Override
	public int getOrder() {
		return 3;
	}

	@Bean
	public TokenSecurityConfigurer tokenSecurityConfigurer() throws Exception {
		TokenSecurityConfigurer tokenSecurityConfigurer = new TokenSecurityConfigurer();
		tokenSecurityConfigurer.setTokenService(tokenService);
		if (eventPublisher != null) {
			tokenSecurityConfigurer.setEventPublisher(eventPublisher);
		}
		return tokenSecurityConfigurer;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		TokenSecurityConfigurer configurer = tokenSecurityConfigurer();

		// @formatter:off
		http.authenticationProvider(new AnonymousAuthenticationProvider("default")).exceptionHandling()
				.accessDeniedHandler(configurer.getAccessDeniedHandler()).and().sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().csrf().disable();
		// @formatter:on
		http.apply(configurer);

		http.authorizeRequests().anyRequest().authenticated();
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/v2/api-docs/**", "/swagger-resources/**", "/swagger-ui.html", "/webjars/**")
				.antMatchers("/actuator/**", "/druid/**").antMatchers(tokenSecurityProperties.getIgnored());
	}
}
