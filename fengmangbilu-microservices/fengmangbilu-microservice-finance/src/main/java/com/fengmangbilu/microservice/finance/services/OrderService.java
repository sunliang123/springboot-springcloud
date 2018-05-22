package com.fengmangbilu.microservice.finance.services;

import com.fengmangbilu.microservice.finance.entities.Order;
import com.fengmangbilu.microservice.finance.repositories.OrderRepository;
import com.fengmangbilu.service.DefaultJpaService;

public interface OrderService extends DefaultJpaService<Order, Long, OrderRepository> {

	Order findByOrderId(Long orderId);

	Order findByBuyerIdAndOrderId(String buyerId, Long orderId);
}
