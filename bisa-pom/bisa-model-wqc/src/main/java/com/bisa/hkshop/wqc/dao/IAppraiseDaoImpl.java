package com.bisa.hkshop.wqc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bisa.hkshop.model.Appraise;
import com.bisa.hkshop.wqc.basic.dao.BaseDao;
@Repository
public class IAppraiseDaoImpl extends BaseDao<Appraise> implements IAppraiseDao{

	@Override
	public int addAppraise(Appraise appraise) {
		// TODO Auto-generated method stub
		String sql="insert into s_appraise(id,appraise_no,product_number,main_picture,price,"
				+ "title,appraise_one,appraise_two,appraise_degree,appraise_status,user_guid,"
				+ "insert_time,update_time,order_detail_guid,userImg) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		return super.addObjectBySql(sql, new Object[] {appraise.getId(),appraise.getAppraise_no(),appraise.getProduct_number(),appraise.getMain_picture(),
				appraise.getPrice(),appraise.getTitle(),appraise.getAppraise_one(),appraise.getAppraise_two(),appraise.getAppraise_degree(),
				appraise.getAppraise_status(),appraise.getUser_guid(),appraise.getInsert_time(),appraise.getUpdate_time(),
				appraise.getOrder_detail_guid(),appraise.getUserImg()});
	}

	@Override
	public Appraise loadAppraise(String order_detail_guid) {
		// TODO Auto-generated method stub
		String sql="select * from s_appraise where order_detail_guid=?";
		return super.queryObjectBySql(sql, new Object[]{order_detail_guid}, Appraise.class);
	}


	@Override
	public int upAppraise(Appraise appraise) {
		// TODO Auto-generated method stub
		String sql="update s_appraise a set a.id=?,a.appraise_no=?,a.product_number=?,a.main_picture=?,a.price=?,a.title=?"
				+ "a.appraise_one=?,a.appraise_two=?,a.appraise_degree=?,a.appraise_status=?,a.user_guid=?,a.insert_time=?,a.update_time=?,"
				+ "a.order_detail_guid=?,a.userImg=?";
		return super.delUpObjectBySql(sql, new Object[] {appraise.getId(),appraise.getAppraise_no(),appraise.getProduct_number(),appraise.getMain_picture(),
				appraise.getPrice(),appraise.getTitle(),appraise.getAppraise_one(),appraise.getAppraise_two(),appraise.getAppraise_degree(),
				appraise.getAppraise_status(),appraise.getUser_guid(),appraise.getInsert_time(),appraise.getUpdate_time(),
				appraise.getOrder_detail_guid(),appraise.getUserImg()});
	}

	@Override
	public int delAppraise(Appraise appraise) {
		// TODO Auto-generated method stub
		String sql="delete from s_appraise a where  a.appraise_no=?";
		return super.delUpObjectBySql(sql, new Object[] {appraise.getAppraise_no()});
	}

	@Override
	public List<Appraise> loadAppraiseList(String productId) {
		// TODO Auto-generated method stub
		String sql="select * from s_appraise a where a.product_number=? order by update_time desc";
		return super.queryListBySql(sql, new Object[]{productId}, Appraise.class);
	}
	

}
