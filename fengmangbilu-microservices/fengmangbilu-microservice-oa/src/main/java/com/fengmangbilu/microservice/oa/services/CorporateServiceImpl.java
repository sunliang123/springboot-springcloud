package com.fengmangbilu.microservice.oa.services;

import org.springframework.stereotype.Service;

import com.fengmangbilu.microservice.oa.entities.Corporate;
import com.fengmangbilu.microservice.oa.repositories.CorporateRepository;
import com.fengmangbilu.service.DefaultJpaServiceImpl;

@Service
public class CorporateServiceImpl extends DefaultJpaServiceImpl<Corporate, Long, CorporateRepository>
		implements CorporateService {
}
