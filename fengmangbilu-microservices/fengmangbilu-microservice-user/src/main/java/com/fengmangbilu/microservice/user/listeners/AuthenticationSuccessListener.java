package com.fengmangbilu.microservice.user.listeners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.fengmangbilu.microservice.user.repositories.UserRepository;

@Component
public class AuthenticationSuccessListener implements ApplicationListener<AuthenticationSuccessEvent> {

	@Autowired
	private UserRepository userRepository;

	@Async
	@Override
	@Transactional
	public void onApplicationEvent(AuthenticationSuccessEvent event) {
		Authentication authentication = (Authentication) event.getSource();
		userRepository.setLastLoginDateFor(authentication.getName());
	}

}