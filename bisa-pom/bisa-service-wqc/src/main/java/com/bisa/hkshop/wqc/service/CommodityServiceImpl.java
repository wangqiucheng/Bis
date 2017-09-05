package com.bisa.hkshop.wqc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bisa.hkshop.model.Commodity;
import com.bisa.hkshop.wqc.basic.model.Pager;
import com.bisa.hkshop.wqc.dao.ICommodityDao;

@Service
public class CommodityServiceImpl implements ICommodityService{
	@Autowired
	private ICommodityDao iCommodityDao;
	
	@Override
	public Commodity getcommodity(String product_number) {
		// TODO Auto-generated method stub
		return iCommodityDao.getcommodity(product_number);
	}

	@Override
	public Pager<Commodity> getselCommodityPage() {
		// TODO Auto-generated method stub
		return iCommodityDao.getselCommodityPage();
	}

	@Override
	public Pager<Commodity> getselTitleCommmodity(String title, String selling_price) {
		// TODO Auto-generated method stub
		return iCommodityDao.getselTitleCommmodity(title, selling_price);
	}

	@Override
	public Commodity addCommodity(Commodity comm) {
		// TODO Auto-generated method stub
		return iCommodityDao.addCommodity(comm);
	}

	@Override
	public void updateCommodity(Commodity comm) {
		 iCommodityDao.updateCommodity(comm);
		
	}

	@Override
	public void delCommdity(String shop_number) {
		// TODO Auto-generated method stub
		iCommodityDao.delCommdity(shop_number);
	}

	@Override
	public List<Commodity> getcommodity() {
		// TODO Auto-generated method stub
		return iCommodityDao.getcommodity();
	}
	

}
