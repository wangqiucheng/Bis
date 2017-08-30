package com.bisa.hkshop.model;

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
@Table(name="s_cart",uniqueConstraints={@UniqueConstraint(columnNames={"cart_number"})},indexes={@Index(columnList="username")})
public class Cart {
	private int id;
	private String cart_number;	//购物车编号
	private Double number;//商品数量
	private String title;	//商品标题
	private Double price;	//商品价格
	private Double total;	//商品总计
	private String username;  //用户编号
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(length=36,nullable=false,unique=true)
	public String getCart_number() {
		return cart_number;
	}
	public void setCart_number(String cart_number) {
		this.cart_number = cart_number;
	}
	@Column(length=50,nullable=false)
	public Double getNumber() {
		return number;
	}
	public void setNumber(Double number) {
		this.number = number;
	}
	@Column(length=100,nullable=false)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Column(columnDefinition = "double(10,2) default '1.00'",nullable=false)
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Column(columnDefinition = "double(10,2) default '1.00'",nullable=false)
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	@Column(length=100,nullable=false,unique=true)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(int id, String cart_number, Double number, String title, Double price, Double total, String username) {
		super();
		this.id = id;
		this.cart_number = cart_number;
		this.number = number;
		this.title = title;
		this.price = price;
		this.total = total;
		this.username = username;
	}
	
}