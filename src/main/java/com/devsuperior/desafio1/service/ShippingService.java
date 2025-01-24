package com.devsuperior.desafio1.service;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio1.entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {
		
		double frete = 0;
		
		if (order.getBasic() < 100.0) {
			frete = 20.0;
		} else if ((order.getBasic() >= 100.0) && (order.getBasic() < 200.0)) {
			frete = 12.0;						
		}				
		
		return frete;
	}

}
