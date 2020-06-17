package com.nagarro.aggregatorservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.aggregatorservice.dto.OrderDetails;
import com.nagarro.aggregatorservice.service.OrderDetailService;

@RestController
public class AggregatorController {

	@Autowired
	private OrderDetailService orderDetailService;
	
	@GetMapping(value = "/orderdetails/{userId}")
	public OrderDetails getOrderDetails(@PathVariable("userId") Long userId) {
		
		return orderDetailService.getOrderDetails(userId);
	}
}
