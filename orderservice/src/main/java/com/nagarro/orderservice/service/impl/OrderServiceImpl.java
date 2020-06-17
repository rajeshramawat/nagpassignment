package com.nagarro.orderservice.service.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nagarro.orderservice.dto.OrderResponse;
import com.nagarro.orderservice.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Override
	public List<OrderResponse> getOrderList() {
		
		List<OrderResponse> list = new ArrayList<>();
		list.add(new OrderResponse(1l, 250d, LocalDate.parse("2011-12-03", DateTimeFormatter.ISO_LOCAL_DATE)));
		
		return list;
	}

}
