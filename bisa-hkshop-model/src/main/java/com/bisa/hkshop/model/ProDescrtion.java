package com.bisa.hkshop.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProDescrtion {
	private int id;
	private String description_number;
	private String product_Id;
	private String url;
	private int orderId;
	private Date inserttime;
	private Date updatetime;
	public ProDescrtion() {
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
	public String getDescription_number() {
		return description_number;
	}
	public void setDescription_number(String description_number) {
		this.description_number = description_number;
	}
	public String getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(String product_Id) {
		this.product_Id = product_Id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getInserttime() {
		return inserttime;
	}
	public void setInserttime(Date inserttime) {
		this.inserttime = inserttime;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	public ProDescrtion(int id, String description_number, String product_Id, String url, int orderId, Date inserttime,
			Date updatetime) {
		super();
		this.id = id;
		this.description_number = description_number;
		this.product_Id = product_Id;
		this.url = url;
		this.orderId = orderId;
		this.inserttime = inserttime;
		this.updatetime = updatetime;
	}
	
}
