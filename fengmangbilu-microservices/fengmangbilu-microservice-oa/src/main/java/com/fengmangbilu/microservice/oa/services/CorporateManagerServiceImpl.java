package com.fengmangbilu.microservice.oa.services;

import org.springframework.stereotype.Service;

import com.fengmangbilu.microservice.oa.entities.CorporateManager;
import com.fengmangbilu.microservice.oa.repositories.CorporateManagerRepository;
import com.fengmangbilu.service.DefaultJpaServiceImpl;

@Service
public class CorporateManagerServiceImpl extends DefaultJpaServiceImpl<CorporateManager, Long, CorporateManagerRepository>
		implements CorporateManagerService {
}
