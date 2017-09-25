package com.bisa.hkshop.wqc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import com.bisa.hkshop.model.OrderDetail;
import com.bisa.hkshop.wqc.basic.model.Pager;
import com.bisa.hkshop.wqc.dao.IUserOrderDetailDao;
@Service
public class IUserOrderDetailServiceImpl implements IUserOrderDetailService{
	
	@Autowired
	private IUserOrderDetailDao IUserOrderDetailDao;
	@Override
	public List<OrderDetail> loadOrderDetailList(String order_no) {
		// TODO Auto-generated method stub
		return IUserOrderDetailDao.loadOrderDetailList(order_no);
	}

	@Override
	public OrderDetail loadOrderDetail(String order_detail_guid) {
		// TODO Auto-generated method stub
		return IUserOrderDetailDao.loadOrderDetail(order_detail_guid);
	}

	@Override
	public Boolean addOrderDetail(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		return IUserOrderDetailDao.addOrderDetail(orderDetail);
	}

	@Override
	public Boolean updateActive(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		return IUserOrderDetailDao.updateActive(orderDetail);
	}

	@Override
	public Pager<OrderDetail> loadOderPage(String order_no) {
		// TODO Auto-generated method stub
		return IUserOrderDetailDao.loadOderPage(order_no);
	}

	@Override
	public List<OrderDetail> pageuserdetails(int user_guid,int appraise_isnot) {
		// TODO Auto-generated method stub
		return IUserOrderDetailDao.pageuserdetails(user_guid, appraise_isnot);
	}

	@Override
	public List<OrderDetail> getOrderDetail(int user_guid) {
		// TODO Auto-generated method stub
		return IUserOrderDetailDao.getOrderDetail(user_guid);
	}

	
	

}
