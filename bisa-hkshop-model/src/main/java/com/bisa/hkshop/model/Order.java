package com.bisa.hkshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="s_order")
public class Order {
	
	private	int	id; 	//	id
	private	String orderGuid; 	//	32	订单号
	private	String username; 	//	36	用户名
	private	int tra_status; 	//	11	交易状态（1：未支付，2：已支付 3：未发货，4：已发货）
	private	String addr_num; 	//	100	收货地址guid
	private	String price; 	//	36	总价
	private	String logistics_Number; 	//	100	物流单号
	private	String logistics_name; 	//	100	物流公司名
	private	String startTime; 	//	50	创建时间
	private String orderFailTime; //订单失效时间
	private	String updatetime; 	//	50	订单更改时间
	private	String pay_ok_time; 	//	50	支付成功时间
	private	String trade_ok_time; 	//	50	交易成功时间
	private	String trade_false_time; 	//	50	交易失败时间
	private String trade_fail_cause;//交易失败的原因
	private	String invoice_title; 	//	50	发票抬头
	private	int invoice_type; 	//	50	发票类型（0：增值税发票，1：普通发票）
	
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderGuid() {
		return orderGuid;
	}
	public void setOrderGuid(String orderGuid) {
		this.orderGuid = orderGuid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getTra_status() {
		return tra_status;
	}
	public void setTra_status(int tra_status) {
		this.tra_status = tra_status;
	}
	public String getAddr_num() {
		return addr_num;
	}
	public void setAddr_num(String addr_num) {
		this.addr_num = addr_num;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getLogistics_Number() {
		return logistics_Number;
	}
	public void setLogistics_Number(String logistics_Number) {
		this.logistics_Number = logistics_Number;
	}
	public String getLogistics_name() {
		return logistics_name;
	}
	public void setLogistics_name(String logistics_name) {
		this.logistics_name = logistics_name;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getOrderFailTime() {
		return orderFailTime;
	}
	public void setOrderFailTime(String orderFailTime) {
		this.orderFailTime = orderFailTime;
	}
	public String getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}
	public String getPay_ok_time() {
		return pay_ok_time;
	}
	public void setPay_ok_time(String pay_ok_time) {
		this.pay_ok_time = pay_ok_time;
	}
	public String getTrade_ok_time() {
		return trade_ok_time;
	}
	public void setTrade_ok_time(String trade_ok_time) {
		this.trade_ok_time = trade_ok_time;
	}
	public String getTrade_false_time() {
		return trade_false_time;
	}
	public void setTrade_false_time(String trade_false_time) {
		this.trade_false_time = trade_false_time;
	}
	public String getTrade_fail_cause() {
		return trade_fail_cause;
	}
	public void setTrade_fail_cause(String trade_fail_cause) {
		this.trade_fail_cause = trade_fail_cause;
	}
	public String getInvoice_title() {
		return invoice_title;
	}
	public void setInvoice_title(String invoice_title) {
		this.invoice_title = invoice_title;
	}
	public int getInvoice_type() {
		return invoice_type;
	}
	public void setInvoice_type(int invoice_type) {
		this.invoice_type = invoice_type;
	}

	
	
	
}
