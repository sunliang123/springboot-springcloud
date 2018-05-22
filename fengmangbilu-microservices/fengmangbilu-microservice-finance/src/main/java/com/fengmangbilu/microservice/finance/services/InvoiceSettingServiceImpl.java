package com.fengmangbilu.microservice.finance.services;

import org.springframework.stereotype.Service;

import com.fengmangbilu.microservice.finance.entities.InvoiceSetting;
import com.fengmangbilu.microservice.finance.repositories.InvoiceSettingRepository;
import com.fengmangbilu.service.DefaultJpaServiceImpl;

@Service
public class InvoiceSettingServiceImpl extends DefaultJpaServiceImpl<InvoiceSetting, Long, InvoiceSettingRepository>
        implements InvoiceSettingService {

}
