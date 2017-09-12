package com.bisa.hkshop.wqc.dao;

import com.bisa.hkshop.model.Commodity;
import com.bisa.hkshop.wqc.basic.model.Pager;

public interface IcartDao {
	//根据商品编号获取商品详情
	public Commodity getcommodity(String product_number);
	
	//查看我的购物车
	public Pager<Commodity> getselCommodityPage();
	//获取带标题搜索的商品（看是否按新品，价格排序）带分页
	public Pager<Commodity> getselTitleCommmodity(String title,String selling_price);
	//添加商品进购物车
	public Commodity addCommodity(Commodity comm);
	//删除商品在购物车
	public void updateCommodity(Commodity comm);
	
}
