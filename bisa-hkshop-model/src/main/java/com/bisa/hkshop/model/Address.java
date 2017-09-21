package com.bisa.hkshop.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="s_address")
public class Address {
	
	private	int	Id;		//Id(自增id)
	private	String addr_num;		//	64	地址编号
	private	String user_guid;		//	36	用户名
	private String guid;           //当前服务器的唯一id
	private	String address;		//	100	详细地址
	private	String tel;		//	20	电话
	private	String name;		//	20	收货人
	private	String postcode;		//	10	邮政编码
	private	Date act_time;		//	50	最近使用时间
	private int is_default;  //是否设置为默认地址
	private String email;   //电子邮箱   设置为可空
	private	String province;		//	30	省  设置为可空
	private	String city;		//	30	市   设置为可空
	private	String county;
	
	@Id
	@GeneratedValue
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getAddr_num() {
		return addr_num;
	}
	public void setAddr_num(String addr_num) {
		this.addr_num = addr_num;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public Date getAct_time() {
		return act_time;
	}
	public void setAct_time(Date act_time) {
		this.act_time = act_time;
	}
	public int getIs_default() {
		return is_default;
	}
	public void setIs_default(int is_default) {
		this.is_default = is_default;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}		//	30	县  设置为可空
	
	
	
	
}
