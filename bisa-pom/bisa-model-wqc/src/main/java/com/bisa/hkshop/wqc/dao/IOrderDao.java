package com.bisa.hkshop.wqc.dao;

import java.util.List;

import com.bisa.hkshop.model.Order;

public interface IOrderDao {
	

	public List<Order> loadOrderList(String  user_guid);
	
	public  Order  loadOrderByname(String  user_guid);
	
	public  Order  loadOrderByOrderId (String  order_no);
	
	public  Boolean  addOrder(Order  order);
	
	public  Boolean  updateOrder (Order order);

}