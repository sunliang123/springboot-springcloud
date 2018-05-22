package com.fengmangbilu.microservice.oa.repositories;

import org.springframework.stereotype.Repository;

import com.fengmangbilu.microservice.oa.entities.EnterpriseInfo;
import com.fengmangbilu.repository.DefaultRepository;

@Repository
public interface EnterpriseInfoRepository extends DefaultRepository<EnterpriseInfo, Long> {

}
