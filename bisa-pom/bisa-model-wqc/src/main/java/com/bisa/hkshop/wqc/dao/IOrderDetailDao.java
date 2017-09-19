package com.bisa.hkshop.wqc.dao;

import java.util.List;

import com.bisa.hkshop.model.OrderDetail;

public interface IOrderDetailDao {
	
	public  List<OrderDetail>  loadOrderDetailList(String  order_no);
	
	public  OrderDetail  loadOrderDetail (String  order_detail_guid);
	
	public  Boolean  addOrderDetail (OrderDetail  orderDetail);

	public  Boolean  updateActive(OrderDetail  orderDetail);
}
