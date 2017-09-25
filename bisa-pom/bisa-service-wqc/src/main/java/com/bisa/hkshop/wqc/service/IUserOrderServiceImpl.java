package com.bisa.hkshop.wqc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bisa.hkshop.model.Order;

import com.bisa.hkshop.wqc.basic.model.Pager;
import com.bisa.hkshop.wqc.dao.ICommodityDao;
import com.bisa.hkshop.wqc.dao.IUserOrderDao;
import com.bisa.hkshop.wqc.dao.IUserOrderDetailDao;
import com.bisa.hkshop.wqc.dao.IPackageDao;


@Service
public class IUserOrderServiceImpl implements IUserOrderService{
	
	
	
	@Autowired
	private IUserOrderDao orderDao;
	
	

	@Override
	public List<Order> loadOrderList(int user_guid) {
		
		return orderDao.loadOrderList(user_guid);
	}

	@Override
	public Order loadOrderByname(int user_guid) {
		
		return orderDao.loadOrderByname(user_guid);
	}

	@Override
	public Order loadOrderByOrderId(String orderId) {
		return orderDao.loadOrderByOrderId(orderId);
	}

	@Override
	public int addOrder(Order order) {
		return orderDao.addOrder(order);
	}

	@Override
	public int updateOrder(Order order) {
		return orderDao.updateOrder(order);
	}

	@Override
	public Pager<Order> selPaOrder(int user_guid) {
		// TODO Auto-generated method stub
		return orderDao.selPaOrder(user_guid);
	}

	@Override
	public Pager<Order> seltra_status1(int user_guid, int tra_status) {
		// TODO Auto-generated method stub
		return orderDao.seltra_status1(user_guid,tra_status);
	}


	@Override
	public Pager<Order> seleffective_statu(int user_guid, int effective_statu) {
		// TODO Auto-generated method stub
		return orderDao.seleffective_statu(user_guid,effective_statu);
	}

	@Override
	public Pager<Order> seltra_status4(int user_guid, int tra_status) {
		// TODO Auto-generated method stub
		return orderDao.seltra_status4(user_guid,tra_status);
	}

	@Override
	public List<Order> Ordertra_statusList(int user_guid, int tra_status,int appraise_status) {
		// TODO Auto-generated method stub
		return orderDao.Ordertra_statusList(user_guid,tra_status,appraise_status);
	}

	@Override
	public List<Order> Ordertra_statusList2(int user_guid, int tra_status) {
		// TODO Auto-generated method stub
		return orderDao.Ordertra_statusList2(user_guid,tra_status);
	}

	@Override
	public int delOrder(Order order) {
		// TODO Auto-generated method stub
		return orderDao.delOrder(order);
	}

	
	
	
	

	
	
}
