package com.nagarro.aggregatorservice.dto;

import java.time.LocalDate;

public class OrderResponse {

	private Long orderId;
	
	private Double amount;
	
	private LocalDate orderDate;

	public Long getOrderId() {
		return orderId;
	}

	public OrderResponse() {
		super();
	}
	
	public OrderResponse(Long orderId, Double amount, LocalDate orderDate) {
		super();
		this.orderId = orderId;
		this.amount = amount;
		this.orderDate = orderDate;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "OrderResponse [orderId=" + orderId + ", amount=" + amount + ", orderDate=" + orderDate + "]";
	}
}
