package com.fengmangbilu.microservice.oa.services;

import com.fengmangbilu.microservice.oa.entities.MobileInfo;
import com.fengmangbilu.microservice.oa.repositories.MobileInfoRepository;
import com.fengmangbilu.service.DefaultJpaService;

public interface MobileInfoService extends DefaultJpaService<MobileInfo, Long, MobileInfoRepository> {

}
