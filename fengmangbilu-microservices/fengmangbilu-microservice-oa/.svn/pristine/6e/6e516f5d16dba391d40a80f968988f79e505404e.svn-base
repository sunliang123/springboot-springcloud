package com.fengmangbilu.microservice.oa.services;

import java.util.List;

import com.fengmangbilu.microservice.oa.entities.DeptInfo;
import com.fengmangbilu.microservice.oa.repositories.DeptInfoRepository;
import com.fengmangbilu.service.DefaultJpaService;

public interface DeptInfoService extends DefaultJpaService<DeptInfo, Long, DeptInfoRepository>{ 

	List<DeptInfo> findByCompanyId(Long companyId);
}
