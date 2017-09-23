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
	public Appraise addAppraise(Appraise appraise) {
		// TODO Auto-generated method stub
		return IAppraiseDao.addAppraise(appraise);
	}

}
