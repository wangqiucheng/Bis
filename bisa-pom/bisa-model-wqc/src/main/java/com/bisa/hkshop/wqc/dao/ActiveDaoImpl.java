package com.bisa.hkshop.wqc.dao;

import org.springframework.stereotype.Repository;

import com.bisa.hkshop.model.Active;
import com.bisa.hkshop.wqc.basic.dao.BaseDao;
@Repository
public class ActiveDaoImpl extends BaseDao<Active> implements IActiveDao {

	@Override
	public Active getActiveByNumber(String active_number) {
		String sql = "select * from s_active where active_number=?";
		return super.queryObjectBySql(sql, new Object[]{active_number}, Active.class);
	}

}