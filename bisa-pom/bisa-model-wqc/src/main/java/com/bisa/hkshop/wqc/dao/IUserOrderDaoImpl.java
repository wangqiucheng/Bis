package com.bisa.hkshop.wqc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bisa.hkshop.model.Order;
import com.bisa.hkshop.wqc.basic.dao.BaseDao;
import com.bisa.hkshop.wqc.basic.model.Pager;


@Repository
public class IUserOrderDaoImpl extends BaseDao<Order> implements IUserOrderDao{

	@Override
	public List<Order> loadOrderList(int user_guid) {
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
	public Order loadOrderByname(int user_guid) {
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

	@Override
	public Pager<Order> selPaOrder(int user_guid) {
		// TODO Auto-generated method stub
		String sql="select * from s_order where user_guid=?";
		return super.findBySql(sql, new Object[]{user_guid}, Order.class, true);
	}

	@Override
	public Pager<Order> seltra_status1(int user_guid, int tra_status) {
		// TODO Auto-generated method stub
		String sql="select * from s_order where user_guid=? and tra_status=?";
		return super.findBySql(sql, new Object[]{user_guid,tra_status}, Order.class, true);
	}

	@Override
	public Pager<Order> seltra_status4(int user_guid, int tra_status) {
		// TODO Auto-generated method stub
		String sql="select * from s_order o where o.user_guid=? and (o.tra_status=20 || o.tra_status=21)";
		return super.findBySql(sql, new Object[]{user_guid}, Order.class, true);
	}

	@Override
	public Pager<Order> seleffective_statu(int user_guid, int effective_statu) {
		// TODO Auto-generated method stub
		String sql="select * from s_order where user_guid=? and effective_statu=?";
		return super.findBySql(sql, new Object[]{user_guid,effective_statu}, Order.class, true);
	}

	@Override
	public List<Order> Ordertra_statusList(int user_guid, int tra_status,int effective_statu) {
		// TODO Auto-generated method stub
		String sql="select * from s_order o where o.user_guid=? and o.tra_status=? and o.effective_statu=?";
		return super.queryListBySql(sql, new Object[]{user_guid,tra_status,effective_statu}, Order.class);
	}

	@Override
	public List<Order> Ordertra_statusList2(int user_guid, int tra_status) {
		// TODO Auto-generated method stub
		String sql="select * from s_order o where o.user_guid=? and (o.tra_status=20 || o.tra_status=21)";
		return super.queryListBySql(sql, new Object[]{user_guid}, Order.class);
	}
	


	
	
	
}
