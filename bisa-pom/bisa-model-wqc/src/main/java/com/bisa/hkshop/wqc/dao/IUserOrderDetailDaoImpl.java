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
			String sql = "select * from s_order_detail where order_no=? order by start_time desc";
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
			String sql = "select * from s_order_detail where order_detail_guid=? order by start_time desc";
			orderDetail = this.queryObjectBySql(sql, new Object[]{order_detail_guid},OrderDetail.class);
		}catch(Exception e){
			return null;
		}
		return orderDetail;
	}

	@Override
	public int addOrderDetail(OrderDetail orderDetail) {
		String sql = "insert into s_order_detail(s.order_detail.id,s_order_detail.ascription,s_order_detail.ascription_guid,"
				+ "s_order_detail.count,s_order_detail.order_detail_guid,s_order_detail.order_no,s_order_detail.pic,"
				+ "s_order_detail.product_name,s_order_detail.start_time,s_order_detail.price,s_order_detail.appraise_isnot,"
				+ "s_order_detail.user_guid) values(?,?,?,?,?,?,?,?,?,?,?)";
		return super.addObjectBySql(sql, new Object[]{orderDetail.getId(),orderDetail.getAscription(),orderDetail.getAscription_guid()
				,orderDetail.getCount(),orderDetail.getOrder_detail_guid(),orderDetail.getOrder_no(),
				orderDetail.getPic(),orderDetail.getProduct_name(),orderDetail.getStart_time(),orderDetail.getPrice(),orderDetail.getAppraise_isnot()
				,orderDetail.getUser_guid()});
	}

	@Override
	public int updateActive(OrderDetail orderDetail) {
		String sql = "update s_order_detail set s_order_detail.ascription=?,s_order_detail.ascription_guid=?,"
				+ "s_order_detail.count=?,s_order_detail.order_detail_guid=?,s_order_detail.order_no=?,s_order_detail.pic=?,"
				+ "s_order_detail.product_name=?,s_order_detail.start_time=?,s_order_detail.price=?,s_order_detail.appraise_isnot=?,"
				+ "s_order_detail.user_guid=? where s_order_detail.order_detail_guid=?";
		return super.addObjectBySql(sql, new Object[]{orderDetail.getAscription(),orderDetail.getAscription_guid()
				,orderDetail.getCount(),orderDetail.getOrder_detail_guid(),orderDetail.getOrder_no(),
				orderDetail.getPic(),orderDetail.getProduct_name(),orderDetail.getStart_time(),orderDetail.getPrice(),orderDetail.getAppraise_isnot()
				,orderDetail.getUser_guid(),orderDetail.getOrder_detail_guid()});
	}


	@Override
	public Pager<OrderDetail> loadOderPage(String order_no) {
		// TODO Auto-generated method stub
		String sql="select od.* from s_order_detail od where order_no=? order by start_time desc";
		return super.findBySql(sql, new Object[]{order_no},OrderDetail.class, true);
	
	}


	@Override
	public List<OrderDetail> pageuserdetails(int user_guid,int appraise_isnot) {
		// TODO Auto-generated method stub
		/*String sql="SELECT od.* FROM s_order AS o,s_order_detail AS od where o.user_guid=? and o.tra_status=? and o.appraise_isnot=? and o.appraise_status=? and od.order_no=o.order_no";
		return super.findBySql(sql, new Object[]{guid,tra_status,appraise_isnot,appraise_status},OrderDetail.class, true);*/
		String sql="SELECT od.* FROM s_order_detail AS od where od.user_guid=? and od.appraise_isnot=? order by start_time desc";
		return super.queryListBySql(sql, new Object[]{user_guid,appraise_isnot},OrderDetail.class);
	}


	@Override
	public List<OrderDetail> getOrderDetail(int user_guid) {
		// TODO Auto-generated method stub
		String sql = "select * from s_order_detail where user_guid=? order by start_time desc";
		return super.queryListBySql(sql, new Object[]{user_guid},OrderDetail.class);
	}


	@Override
	public int delOdtail(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		String sql="delete from s_order_detail  od where od.order_detail_guid=? order by start_time desc";
		return super.delUpObjectBySql(sql, new Object[]{orderDetail.getOrder_detail_guid()});
	}
	


	

	
	
	
	
}
