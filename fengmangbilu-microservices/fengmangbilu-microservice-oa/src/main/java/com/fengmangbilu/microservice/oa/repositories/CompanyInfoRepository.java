package com.fengmangbilu.microservice.oa.repositories;

import org.springframework.stereotype.Repository;

import com.fengmangbilu.microservice.oa.entities.CompanyInfo;
import com.fengmangbilu.repository.DefaultRepository;

@Repository
public interface CompanyInfoRepository extends DefaultRepository<CompanyInfo, Long> {

}
