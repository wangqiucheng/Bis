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
	public Pager<Commodity> getselTitleCommmodity(String title, String selling_price) {
		String sql=null;
		if(!StringUtils.isNotEmpty(selling_price)||StringUtil.isNotEmpty(title)) {
			sql="select * from s_commodity where title like '%"+title+"%'";
			return super.findBySql(sql, selling_price, Commodity.class, true);
		}else if(StringUtils.isNotEmpty(selling_price)||!StringUtil.isNotEmpty(title)){
			sql="select * from s_commodity where selling_price='%"+selling_price+"%'";
			return super.findBySql(sql, title, Commodity.class, true);
		}else if(StringUtil.isNotEmpty(selling_price)&&StringUtil.isNotEmpty(title)) {
			sql="select * from s_commodity where selling_price='%"+selling_price+"%' and title like '%"+title+"%'";
			return super.findBySql(sql, new Object[]{selling_price,title}, Commodity.class, true);
		}else{
			sql="select * from s_commodity";
			return super.findBySql(sql, Commodity.class, true);
		}
		
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
	

	

}