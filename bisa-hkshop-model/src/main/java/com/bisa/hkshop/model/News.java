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
	private String news_title;  //新闻标题
	
	private String news_subhead;	//副标题
	private int read_quantity;	//阅读量
	private String news_content;//新闻内容
	private int news_category; //类别

	private String img_url;//新闻封面图
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
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public String getNews_title() {
		return news_title;
	}
	public void setNews_title(String news_title) {
		this.news_title = news_title;
	}
	public int getRead_quantity() {
		return read_quantity;
	}
	public void setRead_quantity(int read_quantity) {
		this.read_quantity = read_quantity;
	}
	public String getNews_content() {
		return news_content;
	}
	public void setNews_content(String news_content) {
		this.news_content = news_content;
	}
	public int getNews_category() {
		return news_category;
	}
	public void setNews_category(int news_category) {
		this.news_category = news_category;
	}
	public String getNews_subhead() {
		return news_subhead;
	}
	public void setNews_subhead(String news_subhead) {
		this.news_subhead = news_subhead;
	}
	public News() {
		super();
	}
	public News(int id, String news_title, String news_subhead, int read_quantity, String news_content,
			int news_category, String img_url, String release_time, String author) {
		super();
		this.id = id;
		this.news_title = news_title;
		this.news_subhead = news_subhead;
		this.read_quantity = read_quantity;
		this.news_content = news_content;
		this.news_category = news_category;
		this.img_url = img_url;
		this.release_time = release_time;
		this.author = author;
	}
	
}
