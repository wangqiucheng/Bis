package com.bisa.hkshop.wqc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bisa.hkshop.model.Active;
import com.bisa.hkshop.model.Cart;
import com.bisa.hkshop.wqc.basic.dao.BaseDao;
@Repository
public class CartDaoImpl extends BaseDao<Cart> implements IcartDao{


	@Override
	public List<Cart> selCart(int user_guid) {
		// TODO Auto-generated method stub
		String sql="select * from s_cart AS c where c.user_guid=? order by c.update_time desc";
		return super.queryListBySql(sql, new Object[]{user_guid}, Cart.class);
	}

	@Override
	public int addCart(Cart cart) {
		// TODO Auto-generated method stub
		String sql="insert into s_cart(id,cart_number,number,price,title,total,guid,"
				+ "packId,main_picture,insert_time,update_time,sing_cox,user_guid) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		return super.addObjectBySql(sql, new Object[]{cart.getId(),cart.getCart_number(),cart.getNumber(),cart.getPrice(),cart.getTitle(),
				cart.getTotal(),cart.getGuid(),cart.getPackId(),cart.getMain_picture(),cart.getInsert_time(),cart.getUpdate_time(),
				cart.getSing_cox(),cart.getUser_guid()});
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
	public int updateCart(Cart cart) {
		// TODO Auto-generated method stub
		String sql="update s_cart c set c.cart_number=?,c.number=?,c.price=?,c.title=?,c.total=?,c.guid=?,"
				+ "c.packId=?,c.main_picture=?,c.insert_time=?,c.update_time=?,c.sing_cox=?,c.user_guid=? where c.cart_number=?";
		return super.delUpObjectBySql(sql, new Object[]{cart.getCart_number(),cart.getNumber(),cart.getPrice(),cart.getTitle(),
				cart.getTotal(),cart.getGuid(),cart.getPackId(),cart.getMain_picture(),cart.getInsert_time(),cart.getUpdate_time(),
				cart.getSing_cox(),cart.getUser_guid(),cart.getCart_number()});
	}

	@Override
	public int selCartNum(int user_guid) {
		// TODO Auto-generated method stub
		String sql="select count(*) from s_cart where user_guid=?";
		return (int) super.queryTotal(sql, new Object[]{user_guid});
	}
	

}
