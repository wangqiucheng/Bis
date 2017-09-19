package com.bisa.hkshop.wqc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bisa.hkshop.model.Order;
import com.bisa.hkshop.wqc.basic.dao.BaseDao;


@Repository
public class OrderDaoImpl extends BaseDao<Order> implements IOrderDao{

	@Override
	public List<Order> loadOrderList(String user_guid) {
		List<Order> order = null;
		try{
			String sql = "select * from s_order where user_guid=?";
			order = this.queryListBySql(sql, new Object[]{user_guid},Order.class);
		}catch(Exception e){
			return null;
		}
		return order;
	}

	@Override
	public Order loadOrderByname(String user_guid) {
		Order order = null;
		try{
			String sql = "select * from s_order where user_guid=?";
			order = this.queryObjectBySql(sql, new Object[]{user_guid},Order.class);
		}catch(Exception e){
			return null;
		}
		return order;
	}

	@Override
	public Order loadOrderByOrderId(String order_no) {
		Order order = null;
		try{
			String sql = "select * from s_order where order_no=?";
			order = this.queryObjectBySql(sql, new Object[]{order_no},Order.class);
		}catch(Exception e){
			return null;
		}
		return order;
	}

	@Override
	public Boolean addOrder(Order order) {
		try{
			this.add(order);
			
		}catch(Exception e){
			return false;
		}
		return true;
	}
	
	@Override
	public Boolean updateOrder(Order order) {
		try{
			this.update(order);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	
	
}
