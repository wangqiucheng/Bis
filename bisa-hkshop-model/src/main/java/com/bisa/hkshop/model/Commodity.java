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
 * 商品表
 */
@Entity
@Table(name="s_commodity")
public class Commodity {
	private int id;
	private String shop_number; //商品编号
	private String title;		//商品大标题
	private String subtitle;	//商品小标题
	private String description;
	private String sub_description;
	private Double selling_price;	//出售价格
	private String classification;	//分类
	private int orderId;//排序用的
	private String type;	
	private String main_picture;	//商品主图
	private String pic1_picture;	//商品图片1小图
	private String pic2_picture;	//商品图片2
	private String pic3_picture;	//商品图片3
	private String pic4_picture;	//商品图片4
	private Date insertime;  //插入时间
	private Date updatime;	//更新时间
	public Commodity() {
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
	public String getShop_number() {
		return shop_number;
	}
	public void setShop_number(String shop_number) {
		this.shop_number = shop_number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getSub_description() {
		return sub_description;
	}
	public void setSub_description(String sub_description) {
		this.sub_description = sub_description;
	}
	public Double getSelling_price() {
		return selling_price;
	}
	public void setSelling_price(Double selling_price) {
		this.selling_price = selling_price;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMain_picture() {
		return main_picture;
	}
	public void setMain_picture(String main_picture) {
		this.main_picture = main_picture;
	}
	public String getPic1_picture() {
		return pic1_picture;
	}
	public void setPic1_picture(String pic1_picture) {
		this.pic1_picture = pic1_picture;
	}
	public String getPic2_picture() {
		return pic2_picture;
	}
	public void setPic2_picture(String pic2_picture) {
		this.pic2_picture = pic2_picture;
	}
	public String getPic3_picture() {
		return pic3_picture;
	}
	public void setPic3_picture(String pic3_picture) {
		this.pic3_picture = pic3_picture;
	}
	public String getPic4_picture() {
		return pic4_picture;
	}
	public void setPic4_picture(String pic4_picture) {
		this.pic4_picture = pic4_picture;
	}
	public Date getInsertime() {
		return insertime;
	}
	public void setInsertime(Date insertime) {
		this.insertime = insertime;
	}
	public Date getUpdatime() {
		return updatime;
	}
	public void setUpdatime(Date updatime) {
		this.updatime = updatime;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Commodity(int id, String shop_number, String title, String subtitle, String description,
			String sub_description, Double selling_price, String classification, int orderId, String type,
			String main_picture, String pic1_picture, String pic2_picture, String pic3_picture, String pic4_picture,
			Date insertime, Date updatime) {
		super();
		this.id = id;
		this.shop_number = shop_number;
		this.title = title;
		this.subtitle = subtitle;
		this.description = description;
		this.sub_description = sub_description;
		this.selling_price = selling_price;
		this.classification = classification;
		this.orderId = orderId;
		this.type = type;
		this.main_picture = main_picture;
		this.pic1_picture = pic1_picture;
		this.pic2_picture = pic2_picture;
		this.pic3_picture = pic3_picture;
		this.pic4_picture = pic4_picture;
		this.insertime = insertime;
		this.updatime = updatime;
	}
	

	
	
	
	
	
}
