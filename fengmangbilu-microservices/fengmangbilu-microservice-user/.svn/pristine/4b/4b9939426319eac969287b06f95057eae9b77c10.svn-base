package com.fengmangbilu.microservice.user.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.fengmangbilu.microservice.user.endpoints.LoginRequest;
import com.fengmangbilu.microservice.user.endpoints.UserRequest;
import com.fengmangbilu.microservice.user.entities.User;
import com.fengmangbilu.microservice.user.exceptions.UserException;
import com.fengmangbilu.microservice.user.repositories.UserRepository;
import com.fengmangbilu.service.DefaultJpaServiceImpl;

@Service
public class UserServiceImpl extends DefaultJpaServiceImpl<User, String, UserRepository>
		implements UserService, UserDetailsService {

	@Autowired
	private UserRepository repository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private SmsService<SendSmsResponse> smsService;

	@Override
	public User findByMobile(String mobile) {
		return repository.findByMobile(mobile);
	}
	
	@Override
	public User login(LoginRequest loginRequest) {
		String mobile = loginRequest.getMobile();
		User user = findByMobile(mobile);
		if (user == null) {
			throw UserException.ERR_MOBILE_NOT_FOUND;
		}
		String smsCode = smsService.getSmsCode(mobile, AbstractSmsService.SMS_SOURCE_LOGIN);
		if (smsCode == null || !smsCode.equals(loginRequest.getSmsCode())) {
			throw UserException.ERR_SMS_CODE;
		}
		return user;
	}

	@Override
	public User register(UserRequest userRequest) {
		String mobile = userRequest.getMobile();
		User user = findByMobile(mobile);
		if (user != null) {
			throw UserException.ERR_MOBILE_DUPLICATE;
		}
		String smsCode = smsService.getSmsCode(mobile, AbstractSmsService.SMS_SOURCE_REGISTER);
		if (smsCode == null || !smsCode.equals(userRequest.getSmsCode())) {
			throw UserException.ERR_SMS_CODE;
		}
		user = new User();
		user.setMobile(mobile);
		user.setName(user.getSecurityMobile());
		user.setPassword(passwordEncoder.encode(userRequest.getPassword()));
		user.setLastPasswordResetDate(new Date());
		return repository.save(user);
	}

	@Override
	public User resetPassword(UserRequest userRequest) {
		String mobile = userRequest.getMobile();
		User user = findByMobile(mobile);
		if (user == null) {
			throw UserException.ERR_MOBILE_NOT_FOUND;
		}
		String smsCode = smsService.getSmsCode(mobile, AbstractSmsService.SMS_SOURCE_REST_PASSWORD);
		if (smsCode == null || !smsCode.equals(userRequest.getSmsCode())) {
			throw UserException.ERR_SMS_CODE;
		}
		user.setPassword(passwordEncoder.encode(userRequest.getPassword()));
		user.setLastPasswordResetDate(new Date());
		return repository.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repository.findByMobile(username);
		if (user == null) {
			throw new UsernameNotFoundException(UserException.ERR_MOBILE_NOT_FOUND.getMessage());
		}
		return user;
	}

	@Override
	@Transactional
	public int setAvatarFor(String userId, String avatar) {
		return repository.setAvatarFor(userId, avatar);
	}

	@Override
	@Transactional
	public int setIsCertifiedFor(String userId, String name) {
		return repository.setIsCertifiedFor(userId, name);
	}

}
