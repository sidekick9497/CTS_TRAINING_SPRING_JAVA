package com.cts.training.hibernatemapping.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pixogram.cofig.PixogramSpring;
import com.pixogram.dao.MediaDao;
import com.pixogram.dao.ReviewDao;
import com.pixogram.dao.UserDao;
import com.pixogram.entity.Media;
import com.pixogram.entity.Review;
import com.pixogram.entity.User;

@RunWith(SpringRunner.class) // Test Runner
@SpringBootTest(classes =  PixogramSpring.class )
public class CourseDaoTests {

	@Autowired
	private MediaDao courseDao;
	
	@Autowired
	private ReviewDao reviewDao;
	
	@Autowired
	private UserDao studentDao;
	/*@Test
	void testFindCourseById() {
		Review review =  this.reviewDao.findById(1);
		assertEquals("Good", review.getReview());
	}*/
	
	/*@Test
	void testFindReviewById() {
		Review review =  this.reviewDao.findById(1);
		assertEquals("Good", review.getReview());
	}*/
	/*@Test
	void testAddCourseWithoutReview() {
		Course course = new Course();
		course.setName("C#");
		Course added = this.courseDao.addCourseWithoutReview(course);
		assertEquals("C#", added.getName());
	}*/
	
	@Test
	public void testAddCourseWithReviews() {
		Media course = new Media();
		course.setName("Kotlin");
		
		List<Review> reviews = new ArrayList<Review>();
		
		Review review1 = new Review();
		review1.setReview("Futuristic");
		reviews.add(review1);
		Review review2 = new Review();
		review2.setReview("Good for mobile");
		reviews.add(review2);
		
		
		Media added = this.courseDao.addCourseWithReviews(course, reviews);
		assertEquals("Kotlin", added.getName());
	}
	



}
