package com.fengmangbilu.microservice.oa.services;

import com.fengmangbilu.microservice.oa.entities.RiskInfo;
import com.fengmangbilu.microservice.oa.repositories.RiskInfoRepository;
import com.fengmangbilu.service.DefaultJpaService;

public interface RiskInfoService extends DefaultJpaService<RiskInfo, Long, RiskInfoRepository> {

}
