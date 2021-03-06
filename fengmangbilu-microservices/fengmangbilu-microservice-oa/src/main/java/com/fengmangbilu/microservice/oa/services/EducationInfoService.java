package com.fengmangbilu.microservice.oa.services;

import com.fengmangbilu.microservice.oa.entities.EducationInfo;
import com.fengmangbilu.microservice.oa.repositories.EducationInfoRepository;
import com.fengmangbilu.service.DefaultJpaService;

public interface EducationInfoService extends DefaultJpaService<EducationInfo, Long, EducationInfoRepository> {

}
