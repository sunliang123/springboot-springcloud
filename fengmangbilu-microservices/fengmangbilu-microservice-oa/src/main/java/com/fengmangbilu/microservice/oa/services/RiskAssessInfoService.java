package com.fengmangbilu.microservice.oa.services;

import com.fengmangbilu.microservice.oa.entities.RiskAssessInfo;
import com.fengmangbilu.microservice.oa.repositories.RiskAssessInfoRepository;
import com.fengmangbilu.service.DefaultJpaService;

public interface RiskAssessInfoService extends DefaultJpaService<RiskAssessInfo, Long, RiskAssessInfoRepository> {

}
