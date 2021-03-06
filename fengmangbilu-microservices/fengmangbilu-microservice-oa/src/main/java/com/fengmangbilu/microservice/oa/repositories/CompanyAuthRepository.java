package com.fengmangbilu.microservice.oa.repositories;

import org.springframework.stereotype.Repository;

import com.fengmangbilu.microservice.oa.entities.CompanyAuth;
import com.fengmangbilu.repository.DefaultRepository;

@Repository
public interface CompanyAuthRepository extends DefaultRepository<CompanyAuth, Long> {

	CompanyAuth findFirstByCreatedByOrderByCreatedDateDesc(String createdBy);

}
