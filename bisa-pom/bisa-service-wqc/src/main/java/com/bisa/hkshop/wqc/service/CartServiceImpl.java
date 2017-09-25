package com.bisa.hkshop.wqc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bisa.hkshop.model.Cart;
import com.bisa.hkshop.wqc.dao.IcartDao;


@Repository
public class CartServiceImpl implements ICartService{

	@Autowired
	private IcartDao ICartDao;
	@Override
	public int addCart(Cart cart) {
		// TODO Auto-generated method stub
		return ICartDao.addCart(cart);
	}

	

	@Override
	public List<Cart> selCart(int user_guid) {
		// TODO Auto-generated method stub
		return ICartDao.selCart(user_guid);
	}

	@Override
	public Cart getCart(String packId) {
		// TODO Auto-generated method stub
		 Cart cart=ICartDao.getCart(packId);

		return cart;
	}



	@Override
	public int delCart(String deleteId) {
		// TODO Auto-generated method stub
		return ICartDao.delCart(deleteId);
	}



	@Override
	public int updateCart(Cart cart) {
		// TODO Auto-generated method stub
		return ICartDao.updateCart(cart);
	}




	@Override
	public int selCartNum(int user_guid) {
		// TODO Auto-generated method stub
		return ICartDao.selCartNum(user_guid);
	}

}
