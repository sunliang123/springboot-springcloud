package com.fengmangbilu.microservice.oa.services;

import org.springframework.stereotype.Service;

import com.fengmangbilu.microservice.oa.entities.EducationInfo;
import com.fengmangbilu.microservice.oa.repositories.EducationInfoRepository;
import com.fengmangbilu.service.DefaultJpaServiceImpl;

@Service
public class EducationInfoServiceImpl extends DefaultJpaServiceImpl<EducationInfo, Long, EducationInfoRepository>
		implements EducationInfoService {

}
