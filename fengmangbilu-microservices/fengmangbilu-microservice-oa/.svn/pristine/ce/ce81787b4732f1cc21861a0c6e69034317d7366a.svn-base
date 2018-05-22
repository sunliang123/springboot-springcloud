package com.fengmangbilu.microservice.oa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fengmangbilu.microservice.oa.entities.ReportInfo;
import com.fengmangbilu.microservice.oa.enums.ReportType;
import com.fengmangbilu.microservice.oa.repositories.ReportInfoRepository;
import com.fengmangbilu.service.DefaultJpaServiceImpl;

@Service
public class ReportInfoServiceImpl extends DefaultJpaServiceImpl<ReportInfo, String, ReportInfoRepository>
        implements ReportInfoService {
	
	@Autowired
	private ReportInfoRepository repository;

	@Override
	public ReportInfo findBy(String name, String idCard, String mobile, ReportType type) {
		return repository.findBy(name, idCard, mobile, type);
	}

	@Override
	public ReportInfo findByCreatedByAndReportId(String createdBy, String reportId) {
		return repository.findByCreatedByAndReportId(createdBy, reportId);
	}

	@Override
	public List<ReportInfo> findByCreatedByOrderByTypeDesc(String createdBy) {
		return repository.findByCreatedByOrderByTypeDesc(createdBy);
	}

}
