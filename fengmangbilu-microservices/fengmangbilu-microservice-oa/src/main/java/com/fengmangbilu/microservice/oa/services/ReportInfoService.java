package com.fengmangbilu.microservice.oa.services;

import java.util.List;

import com.fengmangbilu.microservice.oa.entities.ReportInfo;
import com.fengmangbilu.microservice.oa.enums.ReportType;
import com.fengmangbilu.microservice.oa.repositories.ReportInfoRepository;
import com.fengmangbilu.service.DefaultJpaService;

public interface ReportInfoService extends DefaultJpaService<ReportInfo, String, ReportInfoRepository> {

	ReportInfo findBy(String name, String idCard, String mobile, ReportType type);
	
	ReportInfo findByCreatedByAndReportId(String createdBy,String reportId);
	
	List<ReportInfo> findByCreatedByOrderByTypeDesc(String createdBy);
}
