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
@Table(name="s_commodity",uniqueConstraints={@UniqueConstraint(columnNames={"shop_number"})},indexes={@Index(columnList="shop_number")})
public class Commodity {
	private int id;
	private String shop_number; //商品编号
	private String title;		//商品大标题
	private String subtitle;	//商品小标题
	private Double original_price; //起始价格
	private Double selling_price;	//出售价格
	private String packages;        //套餐 0是无套餐，1是有套餐
	private String classification;	//分类
	private String package_content;	//套餐内容
	private String summary;//概述
	private String param; //参数
	private String main_picture;	//商品主图
	private String pic1_mix;	//商品图片1小图
	private String pic2_mix;	//商品图片2
	private String pic3_mix;	//商品图片3
	private String pic4_mix;	//商品图片4
	private String pic1_large;//商品图片1大图
	private String pic1_midium;//商品图片1中等
	private String pic2_large;//商品图片2大图
	private String pic2_midium;//商品图片2中等
	private String pic3_large;//商品图片3大图
	private String pic3_midium;//商品图片3中等
	private String pic4_large;//商品图片4大图
	private String pic4_midium;//商品图片4中等
	private String content;	//商品详情页
	private String insertime;  //插入时间
	private String updatime;	//更新时间
	private int orderId;//排序用的
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
	@Column(length=36,nullable=false,unique=true)
	public String getShop_number() {
		return shop_number;
	}
	public void setShop_number(String shop_number) {
		this.shop_number = shop_number;
	}
	@Column(length=100,nullable=false)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Column(length=100,nullable=true)
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	@Column(columnDefinition = "double(10,2) default '1.00'",nullable=false)
	public Double getOriginal_price() {
		return original_price;
	}
	public void setOriginal_price(Double original_price) {
		this.original_price = original_price;
	}
	@Column(columnDefinition = "double(10,2) default '1.00'",nullable=false)
	public Double getSelling_price() {
		return selling_price;
	}
	public void setSelling_price(Double selling_price) {
		this.selling_price = selling_price;
	}
	@Column(length=10,nullable=true)
	public String getPackages() {
		return packages;
	}
	public void setPackages(String packages) {
		this.packages = packages;
	}
	@Column(length=100,nullable=false)
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	@Column(length=100,nullable=true)
	public String getPackage_content() {
		return package_content;
	}
	public void setPackage_content(String package_content) {
		this.package_content = package_content;
	}
	@Column(length=255,nullable=false)
	public String getMain_picture() {
		return main_picture;
	}
	public void setMain_picture(String main_picture) {
		this.main_picture = main_picture;
	}
	@Column(length=255,nullable=true)
	public String getPic1_mix() {
		return pic1_mix;
	}
	public void setPic1_mix(String pic1_mix) {
		this.pic1_mix = pic1_mix;
	}
	@Column(length=255,nullable=true)
	public String getPic2_mix() {
		return pic2_mix;
	}
	public void setPic2_mix(String pic2_mix) {
		this.pic2_mix = pic2_mix;
	}
	@Column(length=255,nullable=true)
	public String getPic3_mix() {
		return pic3_mix;
	}
	public void setPic3_mix(String pic3_mix) {
		this.pic3_mix = pic3_mix;
	}
	@Column(length=255,nullable=true)
	public String getPic4_mix() {
		return pic4_mix;
	}
	public void setPic4_mix(String pic4_mix) {
		this.pic4_mix = pic4_mix;
	}
	@Column(length=255,nullable=true)
	public String getPic1_large() {
		return pic1_large;
	}
	public void setPic1_large(String pic1_large) {
		this.pic1_large = pic1_large;
	}
	@Column(length=255,nullable=true)
	public String getPic1_midium() {
		return pic1_midium;
	}
	public void setPic1_midium(String pic1_midium) {
		this.pic1_midium = pic1_midium;
	}
	@Column(length=255,nullable=true)
	public String getPic2_large() {
		return pic2_large;
	}

	public void setPic2_large(String pic2_large) {
		this.pic2_large = pic2_large;
	}
	@Column(length=255,nullable=true)
    public String getPic2_midium() {
		return pic2_midium;
	}
	public void setPic2_midium(String pic2_midium) {
		this.pic2_midium = pic2_midium;
	}
	@Column(length=255,nullable=true)
	public String getPic3_large() {
		return pic3_large;
	}
	public void setPic3_large(String pic3_large) {
		this.pic3_large = pic3_large;
	}
	@Column(length=255,nullable=true)
	public String getPic3_midium() {
		return pic3_midium;
	}
	public void setPic3_midium(String pic3_midium) {
		this.pic3_midium = pic3_midium;
	}
	@Column(length=255,nullable=true)
	public String getPic4_large() {
		return pic4_large;
	}
	public void setPic4_large(String pic4_large) {
		this.pic4_large = pic4_large;
	}
	@Column(length=255,nullable=true)
	public String getPic4_midium() {
		return pic4_midium;
	}
	public void setPic4_midium(String pic4_midium) {
		this.pic4_midium = pic4_midium;
	}
	@Column(length=255,nullable=false)
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	@Column(length=255,nullable=true)
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	@Column(length=255,nullable=true)
	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param;
	}
	@Column(length=11,nullable=true)
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Commodity(int id, String shop_number, String title, String subtitle, Double original_price,
			Double selling_price, String packages, String classification, String package_content, String summary,
			String param, String main_picture, String pic1_mix, String pic2_mix, String pic3_mix, String pic4_mix,
			String pic1_large, String pic1_midium, String pic2_large, String pic2_midium, String pic3_large,
			String pic3_midium, String pic4_large, String pic4_midium, String content, String insertime,
			String updatime,int orderId) {
		super();
		this.id = id;
		this.shop_number = shop_number;
		this.title = title;
		this.subtitle = subtitle;
		this.original_price = original_price;
		this.selling_price = selling_price;
		this.packages = packages;
		this.classification = classification;
		this.package_content = package_content;
		this.summary = summary;
		this.param = param;
		this.main_picture = main_picture;
		this.pic1_mix = pic1_mix;
		this.pic2_mix = pic2_mix;
		this.pic3_mix = pic3_mix;
		this.pic4_mix = pic4_mix;
		this.pic1_large = pic1_large;
		this.pic1_midium = pic1_midium;
		this.pic2_large = pic2_large;
		this.pic2_midium = pic2_midium;
		this.pic3_large = pic3_large;
		this.pic3_midium = pic3_midium;
		this.pic4_large = pic4_large;
		this.pic4_midium = pic4_midium;
		this.content = content;
		this.insertime = insertime;
		this.updatime = updatime;
		this.orderId = orderId;
	}

	
	
	
	
	
}
