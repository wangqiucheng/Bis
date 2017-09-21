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
	
	@Autowired
	private ICommodityDao commodityDao;
	
	@Autowired
	private IPackageDao packageDao;
	
	@Autowired
	private IUserOrderDetailDao orderDetailDao;
	

	@Override
	public List<Order> loadOrderList(String user_guid) {
		
		return orderDao.loadOrderList(user_guid);
	}

	@Override
	public Order loadOrderByname(String user_guid) {
		
		return orderDao.loadOrderByname(user_guid);
	}

	@Override
	public Order loadOrderByOrderId(String orderId) {
		return orderDao.loadOrderByOrderId(orderId);
	}

	@Override
	public Boolean addOrder(Order order) {
		return orderDao.addOrder(order);
	}

	@Override
	public Boolean updateOrder(Order order) {
		return orderDao.updateOrder(order);
	}

	@Override
	public Pager<Order> selPaOrder(String guid) {
		// TODO Auto-generated method stub
		return orderDao.selPaOrder(guid);
	}

	@Override
	public Pager<Order> seltra_status1(String guid, int tra_status) {
		// TODO Auto-generated method stub
		return orderDao.seltra_status1(guid,tra_status);
	}


	@Override
	public Pager<Order> seleffective_statu(String guid, int effective_statu) {
		// TODO Auto-generated method stub
		return orderDao.seleffective_statu(guid,effective_statu);
	}

	@Override
	public Pager<Order> seltra_status4(String guid, int tra_status) {
		// TODO Auto-generated method stub
		return orderDao.seltra_status4(guid,tra_status);
	}

	@Override
	public List<Order> Ordertra_statusList(String guid, int tra_status) {
		// TODO Auto-generated method stub
		return orderDao.Ordertra_statusList(guid,tra_status);
	}

	@Override
	public List<Order> Ordertra_statusList2(String guid, int tra_status) {
		// TODO Auto-generated method stub
		return orderDao.Ordertra_statusList2(guid,tra_status);
	}

	
	
	
	

	
	
}
