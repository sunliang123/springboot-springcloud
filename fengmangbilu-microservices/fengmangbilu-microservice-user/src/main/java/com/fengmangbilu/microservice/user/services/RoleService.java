package com.fengmangbilu.microservice.user.services;

import com.fengmangbilu.microservice.user.entities.Role;
import com.fengmangbilu.microservice.user.repositories.RoleRepository;
import com.fengmangbilu.service.DefaultJpaService;

public interface RoleService extends DefaultJpaService<Role, Long, RoleRepository> {
	
}
