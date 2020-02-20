package com.pixogram.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pixogram.entity.Media;
import com.pixogram.entity.Review;

@Repository
@Transactional
public class ReviewDao {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private EntityManager em;
	
	public Review findById(Integer id) {
		Review review = this.em.find(Review.class, id);
		logger.info("Review : '" + review);
		logger.info("Course : " + review.getCourse());
		return review;
	}
	
	public Review addReviewAndCourse(Review review, Media course) {
		this.em.persist(course);
		
		review.setCourse(course);
		this.em.persist(review);
		return review;
	}
	
	public Review addReviewtoExistingCourse(Review review, Media course) {
		review.setCourse(course);
		this.em.persist(review);
		return review;
	}
	
	
	
	
}
