package com.fengmangbilu.microservice.oa.services;

import org.springframework.stereotype.Service;

import com.fengmangbilu.microservice.oa.entities.CorporateShareholder;
import com.fengmangbilu.microservice.oa.repositories.CorporateShareholderRepository;
import com.fengmangbilu.service.DefaultJpaServiceImpl;

@Service
public class CorporateShareholderServiceImpl extends
		DefaultJpaServiceImpl<CorporateShareholder, Long, CorporateShareholderRepository> implements CorporateShareholderService {
}
