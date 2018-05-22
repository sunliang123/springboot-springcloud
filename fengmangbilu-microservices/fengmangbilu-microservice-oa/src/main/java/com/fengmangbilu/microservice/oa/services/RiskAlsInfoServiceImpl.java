package com.fengmangbilu.microservice.oa.services;

import org.springframework.stereotype.Service;

import com.fengmangbilu.microservice.oa.entities.RiskAlsInfo;
import com.fengmangbilu.microservice.oa.repositories.RiskAlsInfoRepository;
import com.fengmangbilu.service.DefaultJpaServiceImpl;

@Service
public class RiskAlsInfoServiceImpl extends DefaultJpaServiceImpl<RiskAlsInfo, Long, RiskAlsInfoRepository>
		implements RiskAlsInfoService {

}
