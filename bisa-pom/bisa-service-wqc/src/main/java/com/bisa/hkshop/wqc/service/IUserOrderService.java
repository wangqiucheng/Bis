package com.bisa.hkshop.wqc.service;

import java.util.List;

import com.bisa.hkshop.model.Order;
import com.bisa.hkshop.wqc.basic.model.Pager;


public interface IUserOrderService {
	

	
	public List<Order> loadOrderList(int user_guid);
	
	public  Order  loadOrderByname(int user_guid);
	
	public  Order  loadOrderByOrderId (String  order_no);
	
	public  Boolean  addOrder(Order  order);
	
	public  Boolean  updateOrder (Order order);

	public Pager<Order> selPaOrder(int user_guid);

	public Pager<Order> seltra_status1(int user_guid, int tra_status);

	public Pager<Order> seltra_status4(int user_guid, int tra_status);

	public Pager<Order> seleffective_statu(int user_guid, int effective_statu);

	public List<Order> Ordertra_statusList(int user_guid, int tra_status,int effective_statu);

	public List<Order> Ordertra_statusList2(int user_guid, int tra_status);

	
}
