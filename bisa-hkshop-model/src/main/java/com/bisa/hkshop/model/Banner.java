package com.bisa.hkshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
/**
 * 导航表
 * @author Administrator
 *
 */
@Entity
@Table(name="s_banner",uniqueConstraints={@UniqueConstraint(columnNames={"parent_banner"})})
public class Banner {
	private int id;
	private int banner;	//子分类导航
	private String name;//子类名字
	private int parent_banner;//父类导航
	private String url;//地址
	@Id
	@GeneratedValue	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Column(length=20,nullable=false,unique=true)
	public int getBanner() {
		return banner;
	}

	public void setBanner(int banner) {
		this.banner = banner;
	}
	@Column(length=64,nullable=false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(length=36,nullable=false)
	public int getParent_banner() {
		return parent_banner;
	}

	public void setParent_banner(int parent_banner) {
		this.parent_banner = parent_banner;
	}
	@Column(length=100,nullable=true)
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}

	public Banner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Banner(int id, int banner, String name, int parent_banner) {
		super();
		this.id = id;
		this.banner = banner;
		this.name = name;
		this.parent_banner = parent_banner;
	}
	
	
	
	
}