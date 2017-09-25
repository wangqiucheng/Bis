package com.bisa.hkshop.wqc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;
import com.bisa.hkshop.model.OrderDetail;
import com.bisa.hkshop.wqc.basic.dao.BaseDao;
import com.bisa.hkshop.wqc.basic.model.Pager;


@Repository
public class IUserOrderDetailDaoImpl extends BaseDao<OrderDetail> implements IUserOrderDetailDao{

	
	
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
			String sql = "select * from s_order_detail where order_detail_guid=?";
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


	@Override
	public Pager<OrderDetail> loadOderPage(String order_no) {
		// TODO Auto-generated method stub
		String sql="select od.* from s_order_detail od where order_no=?";
		return super.findBySql(sql, new Object[]{order_no},OrderDetail.class, true);
	
	}


	@Override
	public List<OrderDetail> pageuserdetails(int user_guid,int appraise_isnot) {
		// TODO Auto-generated method stub
		/*String sql="SELECT od.* FROM s_order AS o,s_order_detail AS od where o.user_guid=? and o.tra_status=? and o.appraise_isnot=? and o.appraise_status=? and od.order_no=o.order_no";
		return super.findBySql(sql, new Object[]{guid,tra_status,appraise_isnot,appraise_status},OrderDetail.class, true);*/
		String sql="SELECT od.* FROM s_order_detail AS od where od.user_guid=? and od.appraise_isnot=?";
		return super.queryListBySql(sql, new Object[]{user_guid,appraise_isnot},OrderDetail.class);
	}


	@Override
	public List<OrderDetail> getOrderDetail(int user_guid) {
		// TODO Auto-generated method stub
		String sql = "select * from s_order_detail where user_guid=?";
		return super.queryListBySql(sql, new Object[]{user_guid},OrderDetail.class);
	}
	


	

	
	
	
	
}
