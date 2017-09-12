package com.bisa.hkshop.wqc.service;

import java.util.List;

import com.bisa.hkshop.model.Commodity;
import com.bisa.hkshop.wqc.basic.model.Pager;

public interface ICommodityService {

	public Commodity getcommodity(String product_number);
	//获取所有商品带分页的
	public Pager<Commodity> getselCommodityPage();
	//查询所有商品不带分页
	public List<Commodity> getcommodity();

	//添加商品
	public Commodity addCommodity(Commodity comm);
	//修改商品
	public void updateCommodity(Commodity comm);
	//删除商品
	public void delCommdity(String shop_number);
	//查询右侧的商品
	public List<Commodity> selthreeCon(String shop_Number);
	
	public List<Commodity> getTypecommodity(String type);
	
}
