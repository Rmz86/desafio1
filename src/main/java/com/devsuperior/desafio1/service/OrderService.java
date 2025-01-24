package com.devsuperior.desafio1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.desafio1.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	public double total(Order order) {
		
		double discountValue = 0;
		double result = 0;
		
		discountValue = order.getBasic() - (order.getBasic() * (order.getDiscount() / 100));
		result = discountValue + shippingService.shipment(order);
		return result;
	}

}
