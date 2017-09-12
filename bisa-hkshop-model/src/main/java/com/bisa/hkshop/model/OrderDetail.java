package com.bisa.hkshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="s_orderDetail")
public class OrderDetail {
	
	private int id ;
	private String orderDetailGuid;//订单详细表的唯一id
	private String orderGuid;//订单表中的guid,表示隶属于那个订单
	private String ascription;//属于商品，还是属于套餐（1:商品,2:套餐）;
	private String ascriptionId;//商品或者套餐的guid
	private int count;//套餐或者商品的数量
	private String pic;//套餐或者商品的的图片
	private String product_name;//商品名或者套餐名
	private String time;//创建时间
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getorderDetailGuid() {
		return orderDetailGuid;
	}
	public void setOrderDetailGuid(String orderDetailGuid) {
		orderDetailGuid = orderDetailGuid;
	}
	public String getOrderGuid() {
		return orderGuid;
	}
	public void setOrderGuid(String orderGuid) {
		this.orderGuid = orderGuid;
	}
	public String getAscription() {
		return ascription;
	}
	public void setAscription(String ascription) {
		this.ascription = ascription;
	}
	public String getAscriptionId() {
		return ascriptionId;
	}
	public void setAscriptionId(String ascriptionId) {
		this.ascriptionId = ascriptionId;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
	
	
	
}
