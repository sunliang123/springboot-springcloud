package com.fengmangbilu.microservice.oa.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.fengmangbilu.microservice.oa.entities.DeptInfo;
import com.fengmangbilu.repository.DefaultRepository;

@Repository
public interface DeptInfoRepository extends DefaultRepository<DeptInfo, Long> {
	
	List<DeptInfo> findByCompanyId(Long companyId);
}
