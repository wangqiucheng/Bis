package com.bisa.hkshop.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
/**
 * 购物车
 * @author wqc
 *
 */

@Entity
@Table(name="s_cart")
public class Cart {
	private int id;
	private String cart_number;	//购物车编号
	private String username;  //用户编号
	private int number;//商品数量
	private Double price;
	private String packId;
//	private int corderId;
	private Double total;
	private String title;
	private String main_picture;
	private String sing_cox;
	private Date insert_time;
	private Date update_time;
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCart_number() {
		return cart_number;
	}
	public void setCart_number(String cart_number) {
		this.cart_number = cart_number;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getPackId() {
		return packId;
	}
	public void setPackId(String packId) {
		this.packId = packId;
	}
	
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getMain_picture() {
		return main_picture;
	}
	public void setMain_picture(String main_picture) {
		this.main_picture = main_picture;
	}
	
	public Date getInsert_time() {
		return insert_time;
	}
	public void setInsert_time(Date insert_time) {
		this.insert_time = insert_time;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	
	public String getSing_cox() {
		return sing_cox;
	}
	public void setSing_cox(String sing_cox) {
		this.sing_cox = sing_cox;
	}
	public Cart(int id, String cart_number, String username, int number, Double price, String packId,
			Double total, String title, String main_picture, String sing_cox, Date insert_time, Date update_time) {
		super();
		this.id = id;
		this.cart_number = cart_number;
		this.username = username;
		this.number = number;
		this.price = price;
		this.packId = packId;
		//this.corderId = corderId;
		this.total = total;
		this.title = title;
		this.main_picture = main_picture;
		this.sing_cox = sing_cox;
		this.insert_time = insert_time;
		this.update_time = update_time;
	}
	

	
	
	
}
