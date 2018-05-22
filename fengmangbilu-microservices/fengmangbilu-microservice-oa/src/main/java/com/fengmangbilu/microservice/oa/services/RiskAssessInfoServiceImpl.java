package com.fengmangbilu.microservice.oa.services;

import org.springframework.stereotype.Service;

import com.fengmangbilu.microservice.oa.entities.RiskAssessInfo;
import com.fengmangbilu.microservice.oa.repositories.RiskAssessInfoRepository;
import com.fengmangbilu.service.DefaultJpaServiceImpl;

@Service
public class RiskAssessInfoServiceImpl extends DefaultJpaServiceImpl<RiskAssessInfo, Long, RiskAssessInfoRepository>
		implements RiskAssessInfoService {
}
