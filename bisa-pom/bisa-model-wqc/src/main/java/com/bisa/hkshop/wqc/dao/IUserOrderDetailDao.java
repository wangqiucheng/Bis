package com.bisa.hkshop.wqc.dao;

import java.util.List;


import com.bisa.hkshop.model.OrderDetail;
import com.bisa.hkshop.wqc.basic.model.Pager;

public interface IUserOrderDetailDao {
	
	public  List<OrderDetail>  loadOrderDetailList(String  order_no);
	
	public  OrderDetail  loadOrderDetail (String  order_detail_guid);
	
	public  int addOrderDetail (OrderDetail  orderDetail);

	public  int updateActive(OrderDetail  orderDetail);

	public Pager<OrderDetail> loadOderPage(String order_no);

	public List<OrderDetail> pageuserdetails(int user_guid, int appraise_isnot);

	public List<OrderDetail> getOrderDetail(int user_guid);
	
	public int delOdtail(OrderDetail  orderDetail);

	
}
