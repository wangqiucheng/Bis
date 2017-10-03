package com.bisa.hkshop.wqc.service;

import java.util.List;

import com.bisa.hkshop.model.AppraiseUser;

public interface IAppraiseUserService {

	public int addAppraiseUser(AppraiseUser appraise);

	public AppraiseUser loadAppraiseUser(int user_guid,String order_detail_guid);
	
	public int upAppraiseUser(AppraiseUser appraise);
	
	public int delAppraiseUser(AppraiseUser appraise);

	public List<AppraiseUser> loadAppraiseUserList(int user_guid);
	

}
