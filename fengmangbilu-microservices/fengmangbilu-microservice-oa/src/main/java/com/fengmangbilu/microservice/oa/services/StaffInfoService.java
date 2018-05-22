package com.fengmangbilu.microservice.oa.services;

import com.fengmangbilu.microservice.oa.entities.StaffInfo;
import com.fengmangbilu.microservice.oa.repositories.StaffInfoRepository;
import com.fengmangbilu.service.DefaultJpaService;

public interface StaffInfoService extends DefaultJpaService<StaffInfo, Long, StaffInfoRepository>{ 

	StaffInfo findByIsLeaveFalseAndUserId(String userId);
	
	long countByDeptId(Long deptId);
	
	int setIsLeaveFor(Long id);
}
