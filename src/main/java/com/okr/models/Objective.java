package com.okr.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="objctv")
public class Objective {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long           id;
	private String      title;
	private String description;
	@ManyToOne
    private User    createdBy;
    private Date    createdIn;
	@ManyToOne
    private User    updatedBy;
    private Date    updatedIn;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedIn() {
		return createdIn;
	}
	public void setCreatedIn(Date createdIn) {
		this.createdIn = createdIn;
	}
	public User getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(User updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedIn() {
		return updatedIn;
	}
	public void setUpdatedIn(Date updatedIn) {
		this.updatedIn = updatedIn;
	}
	
}
