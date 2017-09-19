package com.bisa.hkshop.wqc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bisa.hkshop.model.Banner;

import com.bisa.hkshop.wqc.dao.IBannerDao;
@Service
public class BannerServiceImpl implements IBannerService {

	
	@Autowired
	private IBannerDao iBannerDao;
	@Override
	public List<Banner> getBanner() {
		return iBannerDao.getBanner();
	}
	

}
