package com.bisa.hkshop.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
/**
 * 订单表
 * @author wqc
 *
 */
@Entity
@Table(name="s_order",uniqueConstraints={@UniqueConstraint(columnNames={"orderId"})},indexes={@Index(columnList="orderId")})
public class Order {
	private int id;
	private String username; //用户名字
	private String price;	//总价
	private String startTime; //创建时间
	private int tra_status;//交易状态
	private String shop;	//商品字段
	private String address;  //收货地址
	private String orderId;		//订单号
	private String logistics_Number; //物流编号
	private String logistics_name;	//物流名字
	private String updatetime; //更改时间
	private String investEffectDate;//订单生效时间
	private String pay_ok_time;//支付成功时间
	private String trade_ok_time;//交易成功时间
	private String trade_false_time;//交易失败时间
	private String invoice_title;//发票抬头
	private String invoice_type;//'发票类型, 0:增值税发票, 1:普通发票'
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(length=36,nullable=false,unique=true)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(length=36,nullable=false)
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Column(length=50,nullable=false)
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	@Column(length=11,nullable=false)
	public int getTra_status() {
		return tra_status;
	}
	public void setTra_status(int tra_status) {
		this.tra_status = tra_status;
	}
	@Column(length=255,nullable=false)
	public String getShop() {
		return shop;
	}
	public void setShop(String shop) {
		this.shop = shop;
	}
	@Column(length=100,nullable=false)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(length=36,nullable=false,unique=true)
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	@Column(length=100,nullable=false)
	public String getLogistics_Number() {
		return logistics_Number;
	}
	public void setLogistics_Number(String logistics_Number) {
		this.logistics_Number = logistics_Number;
	}
	@Column(length=100,nullable=false)
	public String getLogistics_name() {
		return logistics_name;
	}
	public void setLogistics_name(String logistics_name) {
		this.logistics_name = logistics_name;
	}
	@Column(length=50,nullable=false)
	public String getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}
	@Column(length=50,nullable=true)
	public String getInvestEffectDate() {
		return investEffectDate;
	}
	public void setInvestEffectDate(String investEffectDate) {
		this.investEffectDate = investEffectDate;
	}
	@Column(length=50,nullable=true)
	public String getPay_ok_time() {
		return pay_ok_time;
	}
	public void setPay_ok_time(String pay_ok_time) {
		this.pay_ok_time = pay_ok_time;
	}
	@Column(length=50,nullable=true)
	public String getTrade_ok_time() {
		return trade_ok_time;
	}
	public void setTrade_ok_time(String trade_ok_time) {
		this.trade_ok_time = trade_ok_time;
	}
	@Column(length=50,nullable=true)
	public String getTrade_false_time() {
		return trade_false_time;
	}
	public void setTrade_false_time(String trade_false_time) {
		this.trade_false_time = trade_false_time;
	}
	@Column(length=50,nullable=true)
	public String getInvoice_title() {
		return invoice_title;
	}
	public void setInvoice_title(String invoice_title) {
		this.invoice_title = invoice_title;
	}
	@Column(length=50,nullable=true)
	public String getInvoice_type() {
		return invoice_type;
	}
	public void setInvoice_type(String invoice_type) {
		this.invoice_type = invoice_type;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
