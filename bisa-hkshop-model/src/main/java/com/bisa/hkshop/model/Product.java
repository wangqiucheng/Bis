package com.bisa.hkshop.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * 商品关系表
 */
@Entity
@Table(name="s_product",uniqueConstraints={@UniqueConstraint(columnNames={"mainId"})})
public class Product {
	private int id;
	
	private String insertime;  //插入时间
	private String updatime;	//更新时间
	private String mainId;	//主id
	private String assistant;//副id
	private String orderId;//排序用的
	public Product() {
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
	
	
	@Column(length=50,nullable=false)
	public String getInsertime() {
		return insertime;
	}
	public void setInsertime(String insertime) {
		this.insertime = insertime;
	}
	@Column(length=50,nullable=false)
	public String getUpdatime() {
		return updatime;
	}
	public void setUpdatime(String updatime) {
		this.updatime = updatime;
	}
	
	@Column(length=255,nullable=false)
	public String getMainId() {
		return mainId;
	}
	public void setMainId(String mainId) {
		this.mainId = mainId;
	}
	@Column(length=255,nullable=false)
	public String getAssistant() {
		return assistant;
	}
	public void setAssistant(String assistant) {
		this.assistant = assistant;
	}
	@Column(length=255,nullable=true)
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	public Product(int id, String insertime, String updatime, String mainId, String assistant, String orderId) {
		super();
		this.id = id;
		this.insertime = insertime;
		this.updatime = updatime;
		this.mainId = mainId;
		this.assistant = assistant;
		this.orderId = orderId;
	}
	


	
	
	
	
	
}
