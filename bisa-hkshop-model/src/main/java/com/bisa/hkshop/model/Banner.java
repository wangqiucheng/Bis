package com.bisa.hkshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="s_banner")
public class Banner {
	
	private	int	id;		//主键ID
	/**
	 * 一级导航（如1000、2000、3000、4000、5000、6000）
	 * 二级导航（如2001、2002、2003、2004、2005、2006）
	 */
	private	int	banner_number;		
	/**
	 * 8	一级导航名称（如首页、关于碧沙、网上商城、健康咨询、购物指南、联系我们）
	 * 二级导航名称（关于碧沙的二级导航：公司简介、服务宗旨、经营理念）
	 */
	private	String banner_name;		
	private String url;		//	100	导航链接地址
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBanner_number() {
		return banner_number;
	}
	public void setBanner_number(int banner_number) {
		this.banner_number = banner_number;
	}
	@Column(length=8)
	public String getBanner_name() {
		return banner_name;
	}
	public void setBanner_name(String banner_name) {
		this.banner_name = banner_name;
	}
	@Column(length=100)
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public Banner() {
		super();
	}
	public Banner(int id, int banner_number, String banner_name, String url) {
		super();
		this.id = id;
		this.banner_number = banner_number;
		this.banner_name = banner_name;
		this.url = url;
	}
	
}
