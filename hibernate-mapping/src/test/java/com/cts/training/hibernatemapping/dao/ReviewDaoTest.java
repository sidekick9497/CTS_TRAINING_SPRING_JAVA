package com.cts.training.hibernatemapping.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cts.training.hibernatemapping.HibernateMappingApplication;
import com.cts.training.hibernatemapping.entity.Course;
import com.cts.training.hibernatemapping.entity.Review;

@RunWith(SpringRunner.class) // Test Runner
@SpringBootTest(classes =  HibernateMappingApplication.class )
public class ReviewDaoTest {
	
	@Autowired
	private ReviewDao reviewDao;
	
	@Autowired
	private CourseDao courseDao;
	@Test
	public void testAddCourseWithReviews() {
		Course course = new Course();
		course.setName("newCourse");
		
		Review review1 = new Review();
		review1.setReview("hello");
		
		
		Review added = this.reviewDao.addReviewAndCourse(review1, course);
		assertEquals("hello", added.getReview());
	}
	@Test
	public void testAddReviewToExistingCourse()
	{
		Course course = this.courseDao.findById(2);		
		Review review1 = new Review();
		review1.setReview("testhello");
		
		
		Review added = this.reviewDao.addReviewtoExistingCourse(review1, course);
		assertEquals("testhello", added.getReview());
	}


}
