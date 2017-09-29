package com.bisa.hkshop.remoteservice;

import java.util.List;

import com.bisa.hkshop.model.Commodity;



public interface RProductService {
	//根据商品编号获取商品详情
	public Commodity getcommodity(String product_number);
	//查询所有商品不带分页
	public List<Commodity> getcommodity();
	//添加商品
	public int addCommodity(Commodity comm);
	//修改商品
	public int updateCommodity(Commodity comm);
	//删除商品
	public int delCommdity(String shop_number);
	
	public List<Commodity> selthreeCon(String shop_Number);
	
	public List<Commodity> getTypecommodity(String type);
}
