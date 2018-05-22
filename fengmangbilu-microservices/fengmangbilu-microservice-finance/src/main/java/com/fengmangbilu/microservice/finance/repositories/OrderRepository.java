package com.fengmangbilu.microservice.finance.repositories;

import org.springframework.stereotype.Repository;

import com.fengmangbilu.microservice.finance.entities.Order;
import com.fengmangbilu.repository.DefaultRepository;

@Repository
public interface OrderRepository extends DefaultRepository<Order, Long> {
	
	Order findByOrderId(Long orderId);
	
	Order findByBuyerIdAndOrderId(String buyerId,Long orderId);
}
