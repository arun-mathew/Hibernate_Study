package com.arun.study.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name ="ANNOTATIONS_TEST")
public class AnnotationTest {
	
	private String name;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Transient
	private String description;
	
	@Id
	private long id;
	
	public AnnotationTest() {
		
	}
	
	public AnnotationTest(String name, String description, long id) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.date = new Date();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
}