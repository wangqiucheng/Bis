package com.bisa.hkshop.wqc.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.bisa.hkshop.model.OrderDetail;
import com.bisa.hkshop.wqc.basic.model.Pager;

public interface IUserOrderDetailService {

	public  List<OrderDetail>  loadOrderDetailList(int user_guid,String  order_no);
	
	public  OrderDetail  loadOrderDetail (int user_guid,String  order_detail_guid);
	
	public  int addOrderDetail (int user_guid,OrderDetail  orderDetail);

	public  int updateActive(int user_guid,OrderDetail  orderDetail);

	public Pager<OrderDetail> loadOderPage(int user_guid,String order_no);

	public List<OrderDetail> pageuserdetails(int user_guid, int appraise_isnot);

	public List<OrderDetail> getOrderDetail(int user_guid);
	
	public int delOdtail(int user_guid,OrderDetail  orderDetail);

}
