package com.pixogram.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pixogram.entity.Media;
import com.pixogram.entity.Review;
import com.pixogram.entity.User;

@Repository
@Transactional
public class MediaDao {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private EntityManager em;
	
	public Media findById(Integer id) {
		return null;
	}
	
	public Media addCourseWithoutReview(Media course) {
		this.em.persist(course);
		return course;
	}
	public Media addCourseWithReviews(Media course,List<Review> reviews) {
		this.em.persist(course);
		
		reviews.forEach(review ->{
			review.setCourse(course);
			this.em.persist(review);
			// course.addReview(review);
		});
		
		// this.em.persist(course);
		
		return course;
	}
	
	
}









