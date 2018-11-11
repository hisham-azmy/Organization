package com.jwt.dao;

import java.util.List;

import com.jwt.model.Orders;
import com.org.model.Users;

public interface OrderDao {

	public void CreateOrder(Orders order);

	public void editOrder(Orders order);

	public void deleteOrder(Orders order);

	public List<Orders> getOrderByCustomer();

}
