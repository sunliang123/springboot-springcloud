package com.fengmangbilu.oacloud.security.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.RedisOperationsSessionRepository;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration
@EnableRedisHttpSession
public class HttpSessionConfiguration {
	
	@Value("${server.session.timeout}")
	private int maxInactiveIntervalInSeconds;

	@Autowired
	private RedisOperationsSessionRepository sessionRepository;

	@PostConstruct
	private void afterPropertiesSet() {
		sessionRepository.setDefaultMaxInactiveInterval(maxInactiveIntervalInSeconds);
	}
}
