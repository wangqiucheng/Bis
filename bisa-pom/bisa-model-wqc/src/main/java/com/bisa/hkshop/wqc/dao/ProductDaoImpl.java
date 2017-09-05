package com.bisa.hkshop.wqc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bisa.hkshop.model.Active;
import com.bisa.hkshop.model.Product;
import com.bisa.hkshop.wqc.basic.dao.BaseDao;

@Repository
public class ProductDaoImpl extends BaseDao<Product> implements IProductDao{

	@Override
	public List<Product> getProduct(String mainId) {
		String sql="SELECT * FROM s_product AS p where mainId=? ORDER BY p.orderId desc";
		return super.queryListBySql(sql, new Object[]{mainId}, Product.class);
		
	}
	

}