package com.bisa.hkshop.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="s_trade")
public class Trade {
	
	
	private int id;
	private String trade_no;//交易号
	private String order_guid; //订单的guid
	private String price; //价格
	private String user_guid; //用户的唯一标识
	private String guid;//当前区域服务器内的唯一id
	private int status; //交易的状态（1：未付款，2：已付款）
	private int pay_type;//付款的方式（1001:微信支付,1002:支付宝支付）
	private Date start_time;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTrade_no() {
		return trade_no;
	}
	public void setTrade_no(String trade_no) {
		this.trade_no = trade_no;
	}
	public String getOrder_guid() {
		return order_guid;
	}
	public void setOrder_guid(String order_guid) {
		this.order_guid = order_guid;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getUser_guid() {
		return user_guid;
	}
	public void setUser_guid(String user_guid) {
		this.user_guid = user_guid;
	}
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getPay_type() {
		return pay_type;
	}
	public void setPay_type(int pay_type) {
		this.pay_type = pay_type;
	}
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	} //创建时间
	
	
	
	
}
