package com.bisa.hkshop.wqc.dao;

import java.util.List;

import org.springframework.data.domain.Page;

import com.bisa.hkshop.model.OrderDetail;
import com.bisa.hkshop.wqc.basic.model.Pager;

public interface IUserOrderDetailDao {
	
	public  List<OrderDetail>  loadOrderDetailList(String  order_no);
	
	public  OrderDetail  loadOrderDetail (String  order_detail_guid);
	
	public  Boolean  addOrderDetail (OrderDetail  orderDetail);

	public  Boolean  updateActive(OrderDetail  orderDetail);

	public Pager<OrderDetail> loadOderPage(String order_no);

	public Pager<OrderDetail> pageuserdetails(String guid, int tra_status, int appraise_isnot, int appraise_status);

	
}
