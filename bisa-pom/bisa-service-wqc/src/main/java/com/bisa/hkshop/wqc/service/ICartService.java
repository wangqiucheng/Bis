package com.bisa.hkshop.wqc.service;

import java.util.List;

import com.bisa.hkshop.model.Cart;

public interface ICartService {

	//添加商品进购物车
	public Cart addCart(Cart cart);
	//删除商品在购物车
	public void updateCart(Cart cart);
	public List<Cart> selCart(String userId);
	
	public Cart getCart(String packId);
	
	public Cart updateCart(String packId);
	
	public int delCart(String deleteId);
	
	public int selCartNum(String userId);
}
