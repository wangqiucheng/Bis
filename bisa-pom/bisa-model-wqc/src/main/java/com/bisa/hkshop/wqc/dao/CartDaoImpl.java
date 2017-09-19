package com.bisa.hkshop.wqc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bisa.hkshop.model.Active;
import com.bisa.hkshop.model.Cart;
import com.bisa.hkshop.wqc.basic.dao.BaseDao;
@Repository
public class CartDaoImpl extends BaseDao<Cart> implements IcartDao{


	@Override
	public List<Cart> selCart(String guid) {
		// TODO Auto-generated method stub
		String sql="select * from s_cart AS c where c.guid=? order by c.update_time desc";
		return super.queryListBySql(sql, new Object[]{guid}, Cart.class);
	}

	@Override
	public Cart addCart(Cart cart) {
		// TODO Auto-generated method stub
		return super.add(cart);
	}

	@Override
	public Cart getCart(String packId) {
		// TODO Auto-generated method stub
		String sql="select * from s_cart where packId=?";
		return super.queryObjectBySql(sql, new Object[]{packId}, Cart.class);
	}

	@Override
	public int delCart(String deleteId) {
		// TODO Auto-generated method stub
		String sql="delete from s_cart where packId=?";
		return super.delUpObjectBySql(sql, new Object[]{deleteId});
	}

	@Override
	public void updateCart(Cart cart) {
		// TODO Auto-generated method stub
		super.update(cart);
	}

	@Override
	public int selCartNum(String guid) {
		// TODO Auto-generated method stub
		String sql="select count(*) from s_cart where guid=?";
		return (int) super.queryTotal(sql, new Object[]{guid});
	}
	

}
