package com.fengmangbilu.microservice.oa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fengmangbilu.microservice.oa.entities.StaffInfo;
import com.fengmangbilu.microservice.oa.repositories.StaffInfoRepository;
import com.fengmangbilu.service.DefaultJpaServiceImpl;

@Service
public class StaffInfoServiceImpl extends DefaultJpaServiceImpl<StaffInfo, Long, StaffInfoRepository>
		implements StaffInfoService {

	@Autowired
	private StaffInfoRepository repository;

	@Override
	public StaffInfo findByIsLeaveFalseAndUserId(String userId) {
		return repository.findByIsLeaveFalseAndUserId(userId);
	}

	@Override
	public long countByDeptId(Long deptId) {
		return repository.countByDeptId(deptId);
	}

	@Override
	@Transactional
	public int setIsLeaveFor(Long id) {
		return repository.setIsLeaveFor(id);
	}

}
