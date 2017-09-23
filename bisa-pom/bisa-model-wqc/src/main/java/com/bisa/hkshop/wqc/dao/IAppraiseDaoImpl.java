package com.bisa.hkshop.wqc.dao;

import org.springframework.stereotype.Repository;

import com.bisa.hkshop.model.Appraise;
import com.bisa.hkshop.wqc.basic.dao.BaseDao;
@Repository
public class IAppraiseDaoImpl extends BaseDao<Appraise> implements IAppraiseDao{

	@Override
	public Appraise addAppraise(Appraise appraise) {
		// TODO Auto-generated method stub
		return super.add(appraise);
	}
	

}
