package com.fengmangbilu.microservice.oa.services;

import org.springframework.stereotype.Service;

import com.fengmangbilu.microservice.oa.entities.RiskCqsInfo;
import com.fengmangbilu.microservice.oa.repositories.RiskCqsInfoRepository;
import com.fengmangbilu.service.DefaultJpaServiceImpl;

@Service
public class RiskCqsInfoServiceImpl extends DefaultJpaServiceImpl<RiskCqsInfo, Long, RiskCqsInfoRepository>
		implements RiskCqsInfoService {

}
