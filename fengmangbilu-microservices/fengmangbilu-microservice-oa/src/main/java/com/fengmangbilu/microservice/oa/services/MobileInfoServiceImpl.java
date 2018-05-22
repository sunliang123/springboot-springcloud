package com.fengmangbilu.microservice.oa.services;

import org.springframework.stereotype.Service;

import com.fengmangbilu.microservice.oa.entities.MobileInfo;
import com.fengmangbilu.microservice.oa.repositories.MobileInfoRepository;
import com.fengmangbilu.service.DefaultJpaServiceImpl;

@Service
public class MobileInfoServiceImpl extends DefaultJpaServiceImpl<MobileInfo, Long, MobileInfoRepository>
		implements MobileInfoService {

}
