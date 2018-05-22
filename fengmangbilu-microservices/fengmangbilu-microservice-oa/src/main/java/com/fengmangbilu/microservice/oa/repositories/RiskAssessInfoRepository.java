package com.fengmangbilu.microservice.oa.repositories;

import org.springframework.stereotype.Repository;

import com.fengmangbilu.microservice.oa.entities.RiskAssessInfo;
import com.fengmangbilu.repository.DefaultRepository;

@Repository
public interface RiskAssessInfoRepository extends DefaultRepository<RiskAssessInfo, Long> {

}
