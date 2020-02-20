package com.pixogram.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "review")
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String review;
	
	// default is eager
	@ManyToOne
	private Media course;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	
	
	
	public Media getCourse() {
		return course;
	}

	public void setCourse(Media course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", review=" + review + "]";
	}
	
	
	
	
}
