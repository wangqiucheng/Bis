package com.bisa.hkshop.wqc.dao;

import java.util.List;

import com.bisa.hkshop.model.Product;

public interface IProductDao {
	
	public List<Product> getProduct(String mainId);
	
}
