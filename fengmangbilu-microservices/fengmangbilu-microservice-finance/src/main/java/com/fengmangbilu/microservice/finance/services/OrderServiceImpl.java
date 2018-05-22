package com.fengmangbilu.microservice.finance.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fengmangbilu.microservice.finance.entities.Order;
import com.fengmangbilu.microservice.finance.repositories.OrderRepository;
import com.fengmangbilu.service.DefaultJpaServiceImpl;

@Service
public class OrderServiceImpl extends DefaultJpaServiceImpl<Order, Long, OrderRepository> implements OrderService{
	
	@Autowired
	private OrderRepository repository;

	@Override
	public Order findByOrderId(Long orderId) {
		return repository.findByOrderId(orderId);
	}

	@Override
	public Order findByBuyerIdAndOrderId(String buyerId, Long orderId) {
		return repository.findByBuyerIdAndOrderId(buyerId, orderId);
	}

}
