package com.fengmangbilu.microservice.oa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fengmangbilu.microservice.oa.entities.DeptInfo;
import com.fengmangbilu.microservice.oa.repositories.DeptInfoRepository;
import com.fengmangbilu.service.DefaultJpaServiceImpl;

@Service
public class DeptInfoServiceImpl extends DefaultJpaServiceImpl<DeptInfo, Long, DeptInfoRepository>
		implements DeptInfoService {
	
	@Autowired
	private DeptInfoRepository repository;

	@Override
	public List<DeptInfo> findByCompanyId(Long companyId) {
		return repository.findByCompanyId(companyId);
	}

}
