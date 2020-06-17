package com.nagarro.orderservice.service;

import java.util.List;

import com.nagarro.orderservice.dto.OrderResponse;

public interface OrderService {

	List<OrderResponse> getOrderList();
}
