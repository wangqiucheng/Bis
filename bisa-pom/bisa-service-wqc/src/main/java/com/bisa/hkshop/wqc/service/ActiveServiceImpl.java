package com.bisa.hkshop.wqc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bisa.hkshop.model.Active;
import com.bisa.hkshop.wqc.dao.IActiveDao;
@Service
public class ActiveServiceImpl implements IActiveService {

	
	@Autowired
	private IActiveDao iActiveDao;
	@Override
	public Active getActiveByNumber(String atcive_number) {
		return iActiveDao.getActiveByNumber(atcive_number);
	}

}