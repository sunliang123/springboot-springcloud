package com.fengmangbilu.microservice.oa.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fengmangbilu.microservice.oa.entities.ReportPushInfo;
import com.fengmangbilu.microservice.oa.enums.ReportStatus;
import com.fengmangbilu.repository.DefaultRepository;

@Repository
public interface ReportPushInfoRepository extends DefaultRepository<ReportPushInfo, Long> {
	
	ReportPushInfo findFirstByCreatedByAndUserId(String createdBy,String userId);
	
	Page<ReportPushInfo> findByCreatedByOrderByCreatedDateDesc(String createdBy,Pageable pageable);
	
	@Modifying
	@Query("update ReportPushInfo r set r.status = ?2 where r.pushId = ?1")
	int setStatusFor(Long pushId,ReportStatus status);
}
