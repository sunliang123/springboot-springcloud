package com.fengmangbilu.microservice.oa.repositories;

import org.springframework.stereotype.Repository;

import com.fengmangbilu.microservice.oa.entities.MobileInfo;
import com.fengmangbilu.repository.DefaultRepository;

@Repository
public interface MobileInfoRepository extends DefaultRepository<MobileInfo, Long>{
	
}
