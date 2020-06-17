package com.nagarro.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.orderservice.dto.OrderResponse;
import com.nagarro.orderservice.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService; 
	
	@GetMapping(value = "/orders/{id}")
	public List<OrderResponse> getOrders(@PathVariable("id") Long userId) {
		
		return orderService.getOrderList();
	}
}
