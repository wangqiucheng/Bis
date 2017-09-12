package com.bisa.hkshop.wqc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bisa.hkshop.model.Packdetails;
import com.bisa.hkshop.wqc.dao.IPackdetailsDao;
@Service
public class IPackdetailsServiceImpl implements IPackdetailsService{

	@Autowired
	private IPackdetailsDao IPackdetailsDao;
	@Override
	public List<Packdetails> getpackdetails(String packIds) {
		// TODO Auto-generated method stub
		return IPackdetailsDao.getpackdetails(packIds);
	}

}
