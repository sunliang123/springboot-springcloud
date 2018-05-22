package com.fengmangbilu.microservice.oa.services;

import com.fengmangbilu.microservice.oa.entities.CorporateShareholder;
import com.fengmangbilu.microservice.oa.repositories.CorporateShareholderRepository;
import com.fengmangbilu.service.DefaultJpaService;

public interface CorporateShareholderService
		extends DefaultJpaService<CorporateShareholder, Long, CorporateShareholderRepository> {

}
