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
 * 评论表
 * @author wqc
 *
 */
@Entity
@Table(name="s_comment")
public class Comment {
	private int id;
	private String guid; //用户编号
	private String number;  //评价编号
	private String cart_name; //分类id
	private String comment_one; //评价
	private String comment_two; //追评
	private String insert_time; //插入时间
	private String update_time;	//更改时间
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	@Column(length=50,nullable=false,unique=true)
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Column(length=100,nullable=false)
	public String getCart_name() {
		return cart_name;
	}
	public void setCart_name(String cart_name) {
		this.cart_name = cart_name;
	}
	@Column(length=255,nullable=false)
	public String getComment_one() {
		return comment_one;
	}
	public void setComment_one(String comment_one) {
		this.comment_one = comment_one;
	}
	@Column(length=36,nullable=false)
	public String getComment_two() {
		return comment_two;
	}
	public void setComment_two(String comment_two) {
		this.comment_two = comment_two;
	}
	@Column(length=50,nullable=false)
	public String getInsert_time() {
		return insert_time;
	}
	public void setInsert_time(String insert_time) {
		this.insert_time = insert_time;
	}
	@Column(length=50,nullable=false)
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
