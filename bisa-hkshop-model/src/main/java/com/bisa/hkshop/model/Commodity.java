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
	private String main_picture;	//商品主图
	private String pic1;	//商品图片1
	private String pic2;	//商品图片2
	private String pic3;	//商品图片3
	private String pic4;	//商品图片4
	private String content;	//商品详情页
	private String insertime;  //插入时间
	private String updatime;	//更新时间
	
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
	@Column(length=255,nullable=false)
	public String getPic1() {
		return pic1;
	}
	public void setPic1(String pic1) {
		this.pic1 = pic1;
	}
	@Column(length=255,nullable=false)
	public String getPic2() {
		return pic2;
	}
	public void setPic2(String pic2) {
		this.pic2 = pic2;
	}
	@Column(length=255,nullable=false)
	public String getPic3() {
		return pic3;
	}
	public void setPic3(String pic3) {
		this.pic3 = pic3;
	}
	@Column(length=255,nullable=false)
	public String getPic4() {
		return pic4;
	}
	public void setPic4(String pic4) {
		this.pic4 = pic4;
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
	public Commodity(int id, String shop_number, String title, String subtitle, Double original_price,
			Double selling_price, String packages, String classification, String package_content, String main_picture,
			String pic1, String pic2, String pic3, String pic4, String content, String insertime, String updatime) {
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
		this.main_picture = main_picture;
		this.pic1 = pic1;
		this.pic2 = pic2;
		this.pic3 = pic3;
		this.pic4 = pic4;
		this.content = content;
		this.insertime = insertime;
		this.updatime = updatime;
	}
	
	
	
	
	
}
