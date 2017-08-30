package com.bisa.hkshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * 激活码表
 * @author wqc
 *
 */
@Entity
@Table(name="s_active",uniqueConstraints={@UniqueConstraint(columnNames={"atcive_number"})})
public class Active {

	private int id;
	private String atcive_number;//激活编号
	private String active_code;//激活码
	private String status;//激活状态，0表示未激活，1表示激活
	private String active_time;//激活时间
	private String service_life;//使用期限
	private String serviceId;//服务号
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(length=36,nullable=false,unique=true)
	public String getAtcive_number() {
		return atcive_number;
	}
	public void setAtcive_number(String atcive_number) {
		this.atcive_number = atcive_number;
	}
	@Column(length=36,nullable=false,unique=true)
	public String getActive_code() {
		return active_code;
	}
	public void setActive_code(String active_code) {
		this.active_code = active_code;
	}
	@Column(length=50,nullable=false)
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Column(length=50,nullable=false)
	public String getActive_time() {
		return active_time;
	}
	public void setActive_time(String active_time) {
		this.active_time = active_time;
	}
	@Column(length=50,nullable=false)
	public String getService_life() {
		return service_life;
	}
	public void setService_life(String service_life) {
		this.service_life = service_life;
	}
	@Column(length=50,nullable=false)
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public Active() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Active(int id, String atcive_number, String active_code, String status, String active_time,
			String service_life, String serviceId) {
		super();
		this.id = id;
		this.atcive_number = atcive_number;
		this.active_code = active_code;
		this.status = status;
		this.active_time = active_time;
		this.service_life = service_life;
		this.serviceId = serviceId;
	}

	
}