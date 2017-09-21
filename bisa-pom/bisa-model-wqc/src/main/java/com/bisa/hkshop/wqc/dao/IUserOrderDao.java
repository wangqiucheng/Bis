package com.bisa.hkshop.wqc.dao;

import java.util.List;

import com.bisa.hkshop.model.Order;
import com.bisa.hkshop.wqc.basic.model.Pager;

public interface IUserOrderDao {
	

	public List<Order> loadOrderList(String user_guid);
	
	public  Order  loadOrderByname(String user_guid);
	
	public  Order  loadOrderByOrderId (String  order_no);
	
	public  Boolean  addOrder(Order  order);
	
	public  Boolean  updateOrder (Order order);

	public Pager<Order> selPaOrder(String guid);

	public Pager<Order> seltra_status1(String guid, int tra_status);

	public Pager<Order> seltra_status4(String guid, int tra_status);

	public Pager<Order> seleffective_statu(String guid, int effective_statu);

	public List<Order> Ordertra_statusList(String guid, int tra_status);

	public List<Order> Ordertra_statusList2(String guid, int tra_status);

}
