package com.bisa.hkshop.wqc.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.bisa.hkshop.model.OrderDetail;
import com.bisa.hkshop.wqc.basic.model.Pager;

public interface IUserOrderDetailService {

	public  List<OrderDetail>  loadOrderDetailList(String  order_no);
	
	public  OrderDetail  loadOrderDetail (String  order_detail_guid);
	
	public  int addOrderDetail (OrderDetail  orderDetail);

	public  int updateActive(OrderDetail  orderDetail);

	public Pager<OrderDetail> loadOderPage(String order_no);

	public List<OrderDetail> pageuserdetails(int user_guid, int appraise_isnot);

	public List<OrderDetail> getOrderDetail(int user_guid);
	
	public int delOdtail(OrderDetail  orderDetail);

}
