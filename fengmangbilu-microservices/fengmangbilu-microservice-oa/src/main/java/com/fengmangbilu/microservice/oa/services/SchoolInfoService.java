package com.fengmangbilu.microservice.oa.services;

import com.fengmangbilu.microservice.oa.entities.SchoolInfo;
import com.fengmangbilu.microservice.oa.repositories.SchoolInfoRepository;
import com.fengmangbilu.service.DefaultJpaService;

public interface SchoolInfoService extends DefaultJpaService<SchoolInfo, Long, SchoolInfoRepository> {

	public SchoolInfo findByName(String name);
}
