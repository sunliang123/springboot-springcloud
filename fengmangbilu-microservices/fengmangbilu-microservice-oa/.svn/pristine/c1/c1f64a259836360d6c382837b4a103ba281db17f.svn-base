package com.fengmangbilu.microservice.oa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fengmangbilu.microservice.oa.entities.IdCardInfo;
import com.fengmangbilu.microservice.oa.repositories.IdCardInfoRepository;
import com.fengmangbilu.service.DefaultJpaServiceImpl;

@Service
public class IdCardInfoServiceImpl extends DefaultJpaServiceImpl<IdCardInfo, Long, IdCardInfoRepository>
		implements IdCardInfoService {

	@Autowired
	private IdCardInfoRepository repository;

	@Override
	public IdCardInfo findFirstByCreatedBy(String createdBy) {
		return repository.findFirstByCreatedBy(createdBy);
	}
}
