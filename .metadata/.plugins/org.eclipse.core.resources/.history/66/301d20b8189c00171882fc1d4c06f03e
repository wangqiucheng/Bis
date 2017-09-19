package com.bisa.hkshop.wqc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bisa.hkshop.model.Product;
import com.bisa.hkshop.wqc.dao.IActiveDao;
import com.bisa.hkshop.wqc.dao.IProductDao;

@Service
public class ProductServiceImpl implements IProductService{
	@Autowired
	private IProductDao iProductDao;
	

	@Override
	public List<Product> getProduct(String mainId) {
		// TODO Auto-generated method stub
		return iProductDao.getProduct(mainId);
	}
	

	
}
