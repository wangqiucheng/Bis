package com.bisa.hkshop.wqc.dao;



import java.util.List;

import com.bisa.hkshop.model.Commodity;
import com.bisa.hkshop.wqc.basic.model.Pager;

public interface ICommodityDao {
	//根据商品编号获取商品详情
	public Commodity getcommodity(String product_number);
	//查询所有商品不带分页
	public List<Commodity> getcommodity();
	//获取所有商品带分页的
	public Pager<Commodity> getselCommodityPage();
	//获取带标题搜索的商品（看是否按新品，价格排序）带分页
	public Pager<Commodity> getselTitleCommmodity(String title,String selling_price);
	//添加商品
	public Commodity addCommodity(Commodity comm);
	//修改商品
	public void updateCommodity(Commodity comm);
	//删除商品
	public void delCommdity(String shop_number);
	
}
