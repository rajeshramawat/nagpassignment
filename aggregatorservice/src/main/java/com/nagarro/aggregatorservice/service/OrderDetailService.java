package com.nagarro.aggregatorservice.service;

import com.nagarro.aggregatorservice.dto.OrderDetails;

public interface OrderDetailService {

	OrderDetails getOrderDetails(Long userId);
}
