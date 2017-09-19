package com.bisa.hkshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * 分类表
 * @author wqc
 *
 */
@Entity
@Table(name="s_classification")
public class Classification {
	private int id;
	private int code;	//子分类的编号
	private String name;//子类名字
	private int parent_code;//父类的编号 其中和商品表的相关联
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(length=20,nullable=false,unique=true)
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	@Column(length=64,nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(length=36,nullable=false)
	public int getParent_code() {
		return parent_code;
	}
	public void setParent_code(int parent_code) {
		this.parent_code = parent_code;
	}
	public Classification() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Classification(int id, int code, String name, int parent_code) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.parent_code = parent_code;
	}
	
	
	
}
