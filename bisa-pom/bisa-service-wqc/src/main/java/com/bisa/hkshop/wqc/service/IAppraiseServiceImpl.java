package com.bisa.hkshop.wqc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bisa.hkshop.model.Appraise;
import com.bisa.hkshop.wqc.dao.IAppraiseDao;

@Service
public class IAppraiseServiceImpl implements IAppraiseService{
	@Autowired
	private IAppraiseDao IAppraiseDao;

	@Override
	public int addAppraise(Appraise appraise) {
		// TODO Auto-generated method stub
		return IAppraiseDao.addAppraise(appraise);
	}

	@Override
	public Appraise loadAppraise(String order_detail_guid) {
		// TODO Auto-generated method stub
		return IAppraiseDao.loadAppraise(order_detail_guid);
	}

	@Override
	public int upAppraise(Appraise appraise) {
		// TODO Auto-generated method stub
		return IAppraiseDao.upAppraise(appraise);
	}

	@Override
	public int delAppraise(Appraise appraise) {
		// TODO Auto-generated method stub
		return IAppraiseDao.delAppraise(appraise);
	}

}
