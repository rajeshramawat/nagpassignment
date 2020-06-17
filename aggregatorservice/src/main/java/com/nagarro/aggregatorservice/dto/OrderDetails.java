package com.nagarro.aggregatorservice.dto;

import java.util.List;

public class OrderDetails {

	private User userDetails;
	
	private List<OrderResponse> orders;
	
	public OrderDetails() {}
	
	public OrderDetails(User userDetails, List<OrderResponse> orders) {
		super();
		this.userDetails = userDetails;
		this.orders = orders;
	}

	public User getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(User userDetails) {
		this.userDetails = userDetails;
	}

	public List<OrderResponse> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderResponse> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "AggregatorResponseDto [userDetails=" + userDetails + ", orders=" + orders + "]";
	}
}
