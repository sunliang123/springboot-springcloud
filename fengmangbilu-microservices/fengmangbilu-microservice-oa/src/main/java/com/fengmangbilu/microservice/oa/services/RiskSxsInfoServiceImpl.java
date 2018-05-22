package com.fengmangbilu.microservice.oa.services;

import org.springframework.stereotype.Service;

import com.fengmangbilu.microservice.oa.entities.RiskSxsInfo;
import com.fengmangbilu.microservice.oa.repositories.RiskSxsInfoRepository;
import com.fengmangbilu.service.DefaultJpaServiceImpl;

@Service
public class RiskSxsInfoServiceImpl extends DefaultJpaServiceImpl<RiskSxsInfo, Long, RiskSxsInfoRepository>
		implements RiskSxsInfoService {

}
