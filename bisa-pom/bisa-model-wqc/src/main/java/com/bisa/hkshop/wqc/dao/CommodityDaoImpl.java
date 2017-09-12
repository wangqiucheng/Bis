package com.bisa.hkshop.wqc.dao;


import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import com.bisa.hkshop.model.Commodity;
import com.bisa.hkshop.wqc.basic.dao.BaseDao;
import com.bisa.hkshop.wqc.basic.dao.StringUtil;
import com.bisa.hkshop.wqc.basic.model.Pager;
@Repository
public class CommodityDaoImpl extends BaseDao<Commodity> implements ICommodityDao{

	@Override
	public Commodity getcommodity(String product_number) {
		// TODO Auto-generated method stub
		String sql="select * from s_commodity where shop_number=?";
		return super.queryObjectBySql(sql, new Object[]{product_number}, Commodity.class);
	}

	@Override
	public Pager<Commodity> getselCommodityPage() {
		String sql = "select * from s_commodity";
		return super.findBySql(sql, Commodity.class, true);
	}


	@Override
	public Commodity addCommodity(Commodity comm) {
		// TODO Auto-generated method stub
		return super.add(comm);
	}

	@Override
	public void updateCommodity(Commodity comm) {
		// TODO Auto-generated method stub
		super.update(comm);
	}

	@Override
	public void delCommdity(String shop_number) {
		// TODO Auto-generated method stub
		int i=Integer.parseInt(shop_number);
		super.delete(i);
	}

	@Override
	public List<Commodity> getcommodity() {
		String sql = "select * from s_commodity";
		return super.queryListBySql(sql, null, Commodity.class);
	}

	@Override
	public List<Commodity> selthreeCon(String shop_Number) {
		// TODO Auto-generated method stub
		String sql="select * from s_commodity where classification=? order by orderId desc";
		return super.queryListBySql(sql, new Object[]{shop_Number}, Commodity.class);
	}

	@Override
	public List<Commodity> getTypecommodity(String type) {
		// TODO Auto-generated method stub
		String sql="select * from s_commodity where type=? order by updatime desc";
		
		return super.queryListBySql(sql, new Object[]{type},Commodity.class);
	}
	

	

}
