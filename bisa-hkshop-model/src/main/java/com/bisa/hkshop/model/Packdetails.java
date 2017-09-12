package com.bisa.hkshop.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="s_packdetails")
public class Packdetails {
	private int id;
	private String pack_number;
	private int packId;
	private String pack_name;
	private String pack_subname;
	private String pack_descrition;
	private String pack_subdetion;
	private double pack_price;
	private int pack_orderId;
	private String main_picture;
	private Date insert_time;
	private Date update_time;
	public Packdetails() {
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
	public String getPack_number() {
		return pack_number;
	}
	public void setPack_number(String pack_number) {
		this.pack_number = pack_number;
	}
	public int getPackId() {
		return packId;
	}
	public void setPackId(int packId) {
		this.packId = packId;
	}
	public String getPack_name() {
		return pack_name;
	}
	public void setPack_name(String pack_name) {
		this.pack_name = pack_name;
	}
	public String getPack_subname() {
		return pack_subname;
	}
	public void setPack_subname(String pack_subname) {
		this.pack_subname = pack_subname;
	}
	public String getPack_descrition() {
		return pack_descrition;
	}
	public void setPack_descrition(String pack_descrition) {
		this.pack_descrition = pack_descrition;
	}
	public String getPack_subdetion() {
		return pack_subdetion;
	}
	public void setPack_subdetion(String pack_subdetion) {
		this.pack_subdetion = pack_subdetion;
	}

	public double getPack_price() {
		return pack_price;
	}
	public void setPack_price(double pack_price) {
		this.pack_price = pack_price;
	}

	public int getPack_orderId() {
		return pack_orderId;
	}
	public void setPack_orderId(int pack_orderId) {
		this.pack_orderId = pack_orderId;
	}
	public String getMain_picture() {
		return main_picture;
	}
	public void setMain_picture(String main_picture) {
		this.main_picture = main_picture;
	}
	public Date getInsert_time() {
		return insert_time;
	}
	public void setInsert_time(Date insert_time) {
		this.insert_time = insert_time;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	public Packdetails(int id, String pack_number, int packId, String pack_name, String pack_subname,
			String pack_descrition, String pack_subdetion, double pack_price,
			int pack_orderId, String main_picture, Date insert_time, Date update_time) {
		super();
		this.id = id;
		this.pack_number = pack_number;
		this.packId = packId;
		this.pack_name = pack_name;
		this.pack_subname = pack_subname;
		this.pack_descrition = pack_descrition;
		this.pack_subdetion = pack_subdetion;
		this.pack_price = pack_price;
		this.pack_orderId = pack_orderId;
		this.main_picture = main_picture;
		this.insert_time = insert_time;
		this.update_time = update_time;
	}

	
}
