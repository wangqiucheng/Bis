package com.bisa.hkshop.wqc.service;

import java.util.List;

import com.bisa.hkshop.model.Product;

public interface IProductService {
	public List<Product> getProduct(String mainId);
}
