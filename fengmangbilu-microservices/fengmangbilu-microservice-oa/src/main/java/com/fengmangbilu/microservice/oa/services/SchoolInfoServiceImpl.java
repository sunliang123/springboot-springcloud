package com.fengmangbilu.microservice.oa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fengmangbilu.microservice.oa.entities.SchoolInfo;
import com.fengmangbilu.microservice.oa.repositories.SchoolInfoRepository;
import com.fengmangbilu.service.DefaultJpaServiceImpl;

@Service
public class SchoolInfoServiceImpl extends DefaultJpaServiceImpl<SchoolInfo, Long, SchoolInfoRepository>
		implements SchoolInfoService {

	@Autowired
	private SchoolInfoRepository repository;

	@Override
	public SchoolInfo findByName(String name) {
		return repository.findByName(name);
	}
}
