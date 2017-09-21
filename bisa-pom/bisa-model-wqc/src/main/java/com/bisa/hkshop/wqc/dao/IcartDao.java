package com.bisa.hkshop.wqc.dao;

import java.util.List;

import com.bisa.hkshop.model.Cart;
import com.bisa.hkshop.wqc.basic.model.Pager;

public interface IcartDao {

	//添加商品进购物车
	//public Cart addCart(Cart cart);
	public Cart addCart(Cart cart);


	public List<Cart> selCart(String user_guid);
	
	public Cart getCart(String packId);
	
	public int delCart(String deleteId);


	public void updateCart(Cart cart);
	
	public int selCartNum(String user_guid);
	
}
