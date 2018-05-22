package com.fengmangbilu.microservice.oa.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fengmangbilu.microservice.oa.entities.StaffInfo;
import com.fengmangbilu.repository.DefaultRepository;

@Repository
public interface StaffInfoRepository extends DefaultRepository<StaffInfo, Long> {

	StaffInfo findByIsLeaveFalseAndUserId(String userId);
	
	long countByDeptId(Long deptId);
	
	@Modifying
	@Query("update StaffInfo s set s.isLeave = 1 where s.id = ?1")
	int setIsLeaveFor(Long id);
}
