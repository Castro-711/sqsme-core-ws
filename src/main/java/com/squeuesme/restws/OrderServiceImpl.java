package com.squeuesme.restws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.squeuesme.restws.model.Order;

/**
 * This class is used to implement the order object
 * @author castro
 */

@Service // enables spring to discover it at runtime
public class OrderServiceImpl implements OrderService {
	
	Map<Long, Order> orders = new HashMap<>();
	long currentId = 123;
	
	public OrderServiceImpl() {
		init();
	}
	
	void init() {
		Order order = new Order();
		order.setId(currentId);
		order.setCustomerID("101010101010101");
		order.setVenueID("BOM12345");
		orders.put(order.getId(), order);
	}

	@Override
	public List<Order> getOrders() {
		Collection<Order> results = orders.values();
		ArrayList<Order> response = new ArrayList<>(results);
		
		return response;
	}

}
