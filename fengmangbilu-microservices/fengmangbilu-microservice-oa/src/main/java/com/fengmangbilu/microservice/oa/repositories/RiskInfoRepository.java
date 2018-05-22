package com.fengmangbilu.microservice.oa.repositories;

import org.springframework.stereotype.Repository;

import com.fengmangbilu.microservice.oa.entities.RiskInfo;
import com.fengmangbilu.repository.DefaultRepository;

@Repository
public interface RiskInfoRepository extends DefaultRepository<RiskInfo, Long>{
	
}
