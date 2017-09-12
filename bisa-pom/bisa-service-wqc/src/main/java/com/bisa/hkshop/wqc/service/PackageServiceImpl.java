package com.bisa.hkshop.wqc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bisa.hkshop.model.Package;
import com.bisa.hkshop.wqc.dao.IPackageDao;


@Service
public class PackageServiceImpl implements IPackageService {

	@Autowired
	private IPackageDao iPackageDao;

	@Override
	public List<Package> getpackage(String shop_Number) {
		// TODO Auto-generated method stub
		return iPackageDao.getpackage(shop_Number);
	}

	@Override
	public Package getpackages(String packId) {
		// TODO Auto-generated method stub
		return iPackageDao.getpackages(packId);
	}
	
	

}