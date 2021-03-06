package com.fengmangbilu.microservice.oa.services;

import org.springframework.stereotype.Service;

import com.fengmangbilu.microservice.oa.entities.RiskWdyqsInfo;
import com.fengmangbilu.microservice.oa.repositories.RiskWdyqsInfoRepository;
import com.fengmangbilu.service.DefaultJpaServiceImpl;

@Service
public class RiskWdyqsInfoServiceImpl extends DefaultJpaServiceImpl<RiskWdyqsInfo, Long, RiskWdyqsInfoRepository>
		implements RiskWdyqsInfoService {

}
