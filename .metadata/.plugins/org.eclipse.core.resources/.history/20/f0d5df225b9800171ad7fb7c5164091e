package com.bisa.hkshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="s_news")
public class News {
	
	private int id;
	private String title;  //新闻标题
	private int read;	//阅读量
	private String content;//新闻内容
	private int category; //类别
	private String release_time; //发布日期
	private String author;  //作者
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getRead() {
		return read;
	}
	public void setRead(int read) {
		this.read = read;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getRelease_time() {
		return release_time;
	}
	public void setRelease_time(String release_time) {
		this.release_time = release_time;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public News() {
		super();
	}
	public News(int id, String title, int read, String content, int category, String release_time, String author) {
		super();
		this.id = id;
		this.title = title;
		this.read = read;
		this.content = content;
		this.category = category;
		this.release_time = release_time;
		this.author = author;
	}
}
