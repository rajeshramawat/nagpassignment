package com.nagarro.aggregatorservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nagarro.aggregatorservice.dto.OrderDetails;
import com.nagarro.aggregatorservice.dto.OrderResponse;
import com.nagarro.aggregatorservice.dto.User;
import com.nagarro.aggregatorservice.service.OrderDetailService;

@Service
public class OrderDetailServiceImpl implements OrderDetailService{

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public OrderDetails getOrderDetails(Long userId) {
		
		OrderDetails details = new OrderDetails();
		
		ResponseEntity<User> userResponse = restTemplate.getForEntity("http://userService/user/"+userId, User.class);
		
		details.setUserDetails(userResponse.getBody());
		
        ResponseEntity<List<OrderResponse>> orderResponse = restTemplate.exchange("http://orderService/orders/"+userId,HttpMethod.GET, null, new ParameterizedTypeReference<List<OrderResponse>>() {});
		
		details.setOrders(orderResponse.getBody());
		
		return details;
	}
}
