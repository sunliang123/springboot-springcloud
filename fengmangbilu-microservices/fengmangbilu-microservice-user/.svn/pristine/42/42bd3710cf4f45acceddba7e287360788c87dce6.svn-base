package com.fengmangbilu.microservice.user.services;

import com.fengmangbilu.microservice.user.endpoints.LoginRequest;
import com.fengmangbilu.microservice.user.endpoints.UserRequest;
import com.fengmangbilu.microservice.user.entities.User;
import com.fengmangbilu.microservice.user.repositories.UserRepository;
import com.fengmangbilu.service.DefaultJpaService;

public interface UserService extends DefaultJpaService<User, String, UserRepository> {

	User findByMobile(String mobile);
	
	User login(LoginRequest loginRequest);

	User register(UserRequest userRequest);

	User resetPassword(UserRequest userRequest);

	int setIsCertifiedFor(String userId, String name);

	int setAvatarFor(String userId, String avatar);
}
