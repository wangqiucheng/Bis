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
	public Cart addCart(Cart cart) {
		// TODO Auto-generated method stub
		return ICartDao.addCart(cart);
	}

	

	@Override
	public List<Cart> selCart(String userId) {
		// TODO Auto-generated method stub
		return ICartDao.selCart(userId);
	}

	@Override
	public Cart getCart(String packId) {
		// TODO Auto-generated method stub
		return ICartDao.getCart(packId);
	}



	@Override
	public int delCart(String deleteId) {
		// TODO Auto-generated method stub
		return ICartDao.delCart(deleteId);
	}



	@Override
	public void updateCart(Cart cart) {
		// TODO Auto-generated method stub
		ICartDao.updateCart(cart);
	}

}
