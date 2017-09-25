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
	public int addOrder(Order order) {
		String sql = "insert into s_order(s_order.id,s_order.addr_num,s_order.effective_statu,s_order.invoice_title,"
				+ "s_order.invoice_type,s_order.logistics_name,s_order.logistics_number,s_order.order_fail_time,"
				+ "s_order.order_no,s_order.pay_ok_time,s_order.pay_type,s_order.post_price,s_order.price,"
				+ "s_order.reduced_price,s_order.start_time,s_order.tra_status,s_order.trade_fail_cause,"
				+ "s_order.trade_false_time,s_order.trade_ok_time,s_order.update_time,s_order.user_guid,"
				+ "s_order.guid,s_order.appraise_status) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		return super.addObjectBySql(sql,new Object[]{order.getId(),order.getAddr_num(),order.getEffective_statu(),order.getInvoice_title()
				,order.getInvoice_type(),order.getLogistics_name(),order.getLogistics_number(),order.getOrder_fail_time(),order.getOrder_no()
				,order.getPay_ok_time(),order.getPay_type(),order.getPost_price(),order.getPrice(),order.getReduced_price(),order.getStart_time(),
				order.getTra_status(),order.getTrade_fail_cause(),order.getTrade_false_time(),order.getTrade_ok_time(),order.getUpdate_time(),order.getUser_guid(),
				order.getUser_guid(),order.getAppraise_status()});
	}
	
	@Override
	public int updateOrder(Order order) {
		String sql = "UPDATE s_trade SET s_order.addr_num=?,s_order.effective_statu=?,s_order.invoice_title=?,"
				+ "s_order.invoice_type=?,s_order.logistics_name=?,s_order.logistics_number=?,s_order.order_fail_time=?,"
				+ "s_order.order_no=?,s_order.pay_ok_time=?,s_order.pay_type=?,s_order.post_price=?,s_order.price=?,"
				+ "s_order.reduced_price=?,s_order.start_time=?,s_order.tra_status=?,s_order.trade_fail_cause=?,"
				+ "s_order.trade_false_time=?,s_order.trade_ok_time=?,s_order.update_time=?,s_order.user_guid=?,"
				+ "s_order.guid=?,s_order.appraise_status=? where s_order.order_no=?";
		return super.delUpObjectBySql(sql,new Object[]{order.getAddr_num(),order.getEffective_statu(),order.getInvoice_title()
				,order.getInvoice_type(),order.getLogistics_name(),order.getLogistics_number(),order.getOrder_fail_time(),order.getOrder_no()
				,order.getPay_ok_time(),order.getPay_type(),order.getPost_price(),order.getPrice(),order.getReduced_price(),order.getStart_time(),
				order.getTra_status(),order.getTrade_fail_cause(),order.getTrade_false_time(),order.getTrade_ok_time(),order.getUpdate_time(),order.getUser_guid(),
				order.getUser_guid(),order.getAppraise_status(),order.getOrder_no()});
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
	public List<Order> Ordertra_statusList(int user_guid, int tra_status,int appraise_status) {
		// TODO Auto-generated method stub
		String sql="select * from s_order o where o.user_guid=? and o.tra_status=? and o.appraise_status=?";
		return super.queryListBySql(sql, new Object[]{user_guid,tra_status,appraise_status}, Order.class);
	}

	@Override
	public List<Order> Ordertra_statusList2(int user_guid, int tra_status) {
		// TODO Auto-generated method stub
		String sql="select * from s_order o where o.user_guid=? and (o.tra_status=20 || o.tra_status=21)";
		return super.queryListBySql(sql, new Object[]{user_guid}, Order.class);
	}
	public int delOrder(Order order) {
		String sql="delete from s_order o where o.order_no=?";
		return super.delUpObjectBySql(sql, new Object[]{order.getOrder_no()});
	}


	
	
	
}
