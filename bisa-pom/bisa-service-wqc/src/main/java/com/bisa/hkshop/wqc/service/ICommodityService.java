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
	//获取带标题搜索的商品（看是否按新品，价格排序）带分页
	public Pager<Commodity> getselTitleCommmodity(String title,String selling_price);
	//添加商品
	public Commodity addCommodity(Commodity comm);
	//修改商品
	public void updateCommodity(Commodity comm);
	//删除商品
	public void delCommdity(String shop_number);
	
}
