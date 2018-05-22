package com.fengmangbilu.microservice.oa.services;

import org.springframework.stereotype.Service;

import com.fengmangbilu.microservice.oa.entities.CorporateCaseInfo;
import com.fengmangbilu.microservice.oa.repositories.CorporateCaseInfoRepository;
import com.fengmangbilu.service.DefaultJpaServiceImpl;

@Service
public class CorporateCaseInfoServiceImpl extends DefaultJpaServiceImpl<CorporateCaseInfo, Long, CorporateCaseInfoRepository>
		implements CorporateCaseInfoService {
}
