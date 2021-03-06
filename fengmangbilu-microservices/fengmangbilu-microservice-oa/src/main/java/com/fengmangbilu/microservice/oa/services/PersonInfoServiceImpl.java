package com.fengmangbilu.microservice.oa.services;

import org.springframework.stereotype.Service;

import com.fengmangbilu.microservice.oa.entities.PersonInfo;
import com.fengmangbilu.microservice.oa.repositories.PersonInfoRepository;
import com.fengmangbilu.service.DefaultJpaServiceImpl;

@Service
public class PersonInfoServiceImpl extends DefaultJpaServiceImpl<PersonInfo, Long, PersonInfoRepository>
		implements PersonInfoService {
}
