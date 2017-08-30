package com.bisa.hkshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * 用户地址表
 * @author wqc
 *
 */
@Entity
@Table(name="s_address",uniqueConstraints={@UniqueConstraint(columnNames={"addr_number"})})
public class Address {

	private int id;
	private String addr_number;//地址编号
	private String username;//支付用户的用户
	private String address;//比如地址：深圳市宝安区   后亭地铁站 address:是指后亭地铁站
	private String tel;
	private String postcode;//邮政编码
	private String name;//收货人的姓名
	private String act_time;//最近使用时间(可根据这个时间排序)
	private String province;//省
	private String city;//市
	private String county;//县
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(length=36,nullable=false,unique=true)
	public String getAddr_number() {
		return addr_number;
	}
	public void setAddr_number(String addr_number) {
		this.addr_number = addr_number;
	}
	@Column(length=36,nullable=false,unique=true)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(length=100,nullable=false)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(length=25,nullable=false)
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Column(length=12,nullable=false)
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	@Column(length=50,nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(length=50,nullable=false)
	public String getAct_time() {
		return act_time;
	}
	public void setAct_time(String act_time) {
		this.act_time = act_time;
	}
	@Column(length=100,nullable=false)
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	@Column(length=100,nullable=true)
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Column(length=100,nullable=true)
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int id, String addr_number, String username, String address, String tel, String postcode,
			String name, String act_time, String province, String city, String county) {
		super();
		this.id = id;
		this.addr_number = addr_number;
		this.username = username;
		this.address = address;
		this.tel = tel;
		this.postcode = postcode;
		this.name = name;
		this.act_time = act_time;
		this.province = province;
		this.city = city;
		this.county = county;
	}
	
		
}
