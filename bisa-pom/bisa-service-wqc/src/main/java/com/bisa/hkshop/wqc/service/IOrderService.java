package com.bisa.hkshop.zj.service;

import java.util.List;

import com.bisa.hkshop.model.Order;
import com.bisa.hkshop.zj.basic.model.OrderDetailDto;

public interface IOrderService {
	
	public Order addCarOrder(List<OrderDetailDto> orderList,String addr_num,String username);
	
	public Order addProductOrder(List<OrderDetailDto> orderList,String addr_num,String username);
	
	public List<Order> loadOrderList(String  username);
	
	public  Order  loadOrderByname(String  username) ;
	
	public  Order  loadOrderByOrderId (String  orderId);
	
	public  Boolean  addOrder(Order  order);
	
	public  Boolean  updateOrder (Order order);
}
