package com.bisa.hkshop.wqc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bisa.hkshop.model.OrderDetail;
import com.bisa.hkshop.wqc.basic.dao.BaseDao;


@Repository
public class OrderDetailDaoImpl extends BaseDao<OrderDetail> implements IOrderDetailDao{

	
	
	@Override
	public List<OrderDetail> loadOrderDetailList(String order_no) {
		 List<OrderDetail> orderDetail = null;
		try{
			String sql = "select * from s_order_detail where order_no=?";
			orderDetail = this.queryListBySql(sql, new Object[]{order_no},OrderDetail.class);
		}catch(Exception e){
			return null;
		}
		return orderDetail;
	}
	
	
	@Override
	public OrderDetail loadOrderDetail(String order_detail_guid) {
		OrderDetail orderDetail = null;
		try{
			String sql = "select * from s_order_detail where orderDetailGuid=?";
			orderDetail = this.queryObjectBySql(sql, new Object[]{order_detail_guid},OrderDetail.class);
		}catch(Exception e){
			return null;
		}
		return orderDetail;
	}

	@Override
	public Boolean addOrderDetail(OrderDetail orderDetail) {
		try{
			this.add(orderDetail);
		}catch(Exception e){
			return false;
		}
		return true;
	}

	@Override
	public Boolean updateActive(OrderDetail orderDetail) {
		try{
			this.update(orderDetail);
		}catch(Exception e){
			return false;
		}
		return true;
	}

	
	
	
	
}
