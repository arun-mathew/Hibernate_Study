package com.arun.study.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="MESSAGE")
public class Message {
	
	@Id
	@Column(name="MESSAGE_ID")
	private long id;
	
	@Column(name="MESSAGE_CONTENT")
	private String content;
	
	@Column(name="DATE")
	private Date createdTime;
	
	@Column(name="AUTHOR")
	private String author;
	
	public Message() {
		
	}

	public Message(long id, String content, String author) {
		super();
		this.id = id;
		this.content = content;
		this.author = author;
		this.createdTime = new Date();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
