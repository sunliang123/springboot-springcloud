package com.fengmangbilu.microservice.oa.services;

import com.fengmangbilu.microservice.oa.clients.User;
import com.fengmangbilu.microservice.oa.entities.CompanyAuth;
import com.fengmangbilu.microservice.oa.repositories.CompanyAuthRepository;
import com.fengmangbilu.service.DefaultJpaService;

public interface CompanyAuthService extends DefaultJpaService<CompanyAuth, Long, CompanyAuthRepository> {
	
	public CompanyAuth audit(CompanyAuth companyAuth,User user);
	
	public CompanyAuth findFirstByCreatedByOrderByCreatedDateDesc(String createdBy);
}
