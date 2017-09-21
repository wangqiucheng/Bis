package com.bisa.hkshop.wqc.service;

import java.util.List;

import com.bisa.hkshop.model.OrderDetail;

public interface IUserOrderDetailService {

	public  List<OrderDetail>  loadOrderDetailList(String  order_no);
	
	public  OrderDetail  loadOrderDetail (String  order_detail_guid);
	
	public  Boolean  addOrderDetail (OrderDetail  orderDetail);

	public  Boolean  updateActive(OrderDetail  orderDetail);

}
