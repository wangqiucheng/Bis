package com.bisa.hkshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Id;
import javax.persistence.Index;

@Entity
@Table(name="s_active")
public class Active {
	private	int	Id;	
	private	String active_number;	//	64唯一 	激活编号
	private	String active_code;	//	16非空 	激活码
	private	int	status;	//	10非空 	激活状态（0：未激活，1：激活，2、失效）
	private	String active_time;	//	50	激活时间
	private	int service_diff;	//	5非空	月数（一共几个月）
	private	String service_guid;	//	64非空	服务Guid
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	@Column(length=64,unique=true)
	public String getActive_number() {
		return active_number;
	}
	public void setActive_number(String active_number) {
		this.active_number = active_number;
	}
	@Column(length=16,nullable=false)
	public String getActive_code() {
		return active_code;
	}
	public void setActive_code(String active_code) {
		this.active_code = active_code;
	}
	@Column(nullable=false)
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Column(length=50)
	public String getActive_time() {
		return active_time;
	}
	public void setActive_time(String active_time) {
		this.active_time = active_time;
	}
	@Column(nullable=false)
	public int getService_diff() {
		return service_diff;
	}
	public void setService_diff(int service_diff) {
		this.service_diff = service_diff;
	}
	@Column(length=64,nullable=false)
	public String getService_guid() {
		return service_guid;
	}
	public void setService_guid(String service_guid) {
		this.service_guid = service_guid;
	}
	public Active() {
		super();
	}
	public Active(int id, String active_number, String active_code, int status, String active_time, int service_diff,
			String service_guid) {
		super();
		Id = id;
		this.active_number = active_number;
		this.active_code = active_code;
		this.status = status;
		this.active_time = active_time;
		this.service_diff = service_diff;
		this.service_guid = service_guid;
	}
	
	

}
