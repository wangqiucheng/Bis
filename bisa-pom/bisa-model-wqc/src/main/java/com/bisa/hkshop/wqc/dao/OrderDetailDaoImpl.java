package com.bisa.hkshop.wqc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bisa.hkshop.model.OrderDetail;
import com.bisa.hkshop.wqc.basic.dao.BaseDao;


@Repository
public class OrderDetailDaoImpl extends BaseDao<OrderDetail> implements IOrderDetailDao{

	
	
	@Override
	public List<OrderDetail> loadOrderDetailList(int user_guid,String order_no) {
		 List<OrderDetail> orderDetail = null;
		try{
			String sql = "select * from s_order_detail where user_guid=? and order_no=?";
			orderDetail = this.queryListBySql(sql, new Object[]{user_guid,order_no},OrderDetail.class);
		}catch(Exception e){
			return null;
		}
		return orderDetail;
	}
	
	
	@Override
	public OrderDetail loadOrderDetail(int user_guid ,String order_detail_guid) {
		OrderDetail orderDetail = null;
		try{
			String sql = "select * from s_order_detail where user_guid=?,orderDetailGuid=?";
			orderDetail = this.queryObjectBySql(sql, new Object[]{user_guid,order_detail_guid},OrderDetail.class);
		}catch(Exception e){
			return null;
		}
		return orderDetail;
	}

	@Override
	public Boolean addOrderDetail(OrderDetail orderDetail) {
		try{
			String sql = "insert into s_order_detail(s_order_detail.ascription,s_order_detail.ascription_guid,"
					+ "s_order_detail.count,s_order_detail.order_detail_guid,s_order_detail.order_no,s_order_detail.pic,"
					+ "s_order_detail.product_name,s_order_detail.start_time,s_order_detail.price,s_order_detail.appraise_isnot,"
					+ "s_order_detail.user_guid) values(?,?,?,?,?,?,?,?,?,?,?)";
			this.addObjectBySql(sql, new Object[]{orderDetail.getAscription(),orderDetail.getAscription_guid()
					,orderDetail.getCount(),orderDetail.getOrder_detail_guid(),orderDetail.getOrder_no(),
					orderDetail.getPic(),orderDetail.getProduct_name(),orderDetail.getStart_time(),orderDetail.getPrice(),orderDetail.getAppraise_isnot()
					,orderDetail.getUser_guid()});
		}catch(Exception e){
			return false;
		}
		return true;
	}

	@Override
	public Boolean updateActive(int user_guid,OrderDetail orderDetail) {
		try{
			String sql = "update s_order_detail set s_order_detail.ascription=?,s_order_detail.ascription_guid=?,"
					+ "s_order_detail.count=?,s_order_detail.order_no=?,s_order_detail.pic=?,"
					+ "s_order_detail.product_name=?,s_order_detail.start_time=?,s_order_detail.price=?,s_order_detail.appraise_isnot=?"
					+ "where s_order_detail.user_guid=? and s_order_detail.order_detail_guid=?";
			this.addObjectBySql(sql, new Object[]{orderDetail.getAscription(),orderDetail.getAscription_guid()
					,orderDetail.getCount(),orderDetail.getOrder_no(),orderDetail.getPic(),
					orderDetail.getProduct_name(),orderDetail.getStart_time(),orderDetail.getPrice(),
					orderDetail.getAppraise_isnot()
					,user_guid,orderDetail.getOrder_detail_guid()});
		}catch(Exception e){
			return false;
		}
		return true;
	}

	
	
	
	
}
