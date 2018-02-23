package com.squeuesme.restws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.squeuesme.restws.model.Order;

@Path("/orderservice")
public interface OrderService {

	@Path("/orders")
	@GET
	List<Order> getOrders();
}
