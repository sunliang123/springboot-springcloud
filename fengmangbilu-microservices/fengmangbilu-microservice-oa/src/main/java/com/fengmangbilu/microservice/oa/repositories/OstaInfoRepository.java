package com.fengmangbilu.microservice.oa.repositories;

import org.springframework.stereotype.Repository;

import com.fengmangbilu.microservice.oa.entities.OstaInfo;
import com.fengmangbilu.repository.DefaultRepository;

@Repository
public interface OstaInfoRepository extends DefaultRepository<OstaInfo, Long>{
    
}
