package com.bisa.hkshop.wqc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bisa.hkshop.model.Banner;

import com.bisa.hkshop.wqc.basic.dao.BaseDao;
@Repository
public class BannerDaoImpl extends BaseDao<Banner> implements IBannerDao {

	@Override
	public List<Banner> getBanner() {
		String sql = "select * from s_banner";
		return super.queryListBySql(sql, new Object[]{}, Banner.class);
	}

}
