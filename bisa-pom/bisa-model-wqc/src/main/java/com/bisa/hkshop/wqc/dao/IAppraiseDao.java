package com.bisa.hkshop.wqc.dao;

import java.util.List;

import com.bisa.hkshop.model.Appraise;

public interface IAppraiseDao {

	public int addAppraise(Appraise appraise);

	public Appraise loadAppraise(String order_detail_guid);
	
	public int upAppraise(Appraise appraise);
	
	public int delAppraise(Appraise appraise);

	public List<Appraise> loadAppraiseList(String productId);
	

}
