package com.fengmangbilu.microservice.user.services;

import org.springframework.stereotype.Service;

import com.fengmangbilu.microservice.user.entities.Role;
import com.fengmangbilu.microservice.user.repositories.RoleRepository;
import com.fengmangbilu.service.DefaultJpaServiceImpl;

@Service
public class RoleServiceImpl extends DefaultJpaServiceImpl<Role, Long, RoleRepository>
		implements RoleService {

}
