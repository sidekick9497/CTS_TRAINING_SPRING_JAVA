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
import com.pixogram.entity.Media;
import com.pixogram.entity.Review;

@RunWith(SpringRunner.class) // Test Runner
@SpringBootTest(classes =  PixogramSpring.class )
public class ReviewDaoTest {
	
	@Autowired
	private ReviewDao reviewDao;
	
	@Autowired
	private MediaDao courseDao;
	@Test
	public void testAddCourseWithReviews() {
		Media course = new Media();
		course.setName("newCourse");
		
		Review review1 = new Review();
		review1.setReview("hello");
		
		
		Review added = this.reviewDao.addReviewAndCourse(review1, course);
		assertEquals("hello", added.getReview());
	}
	@Test
	public void testAddReviewToExistingCourse()
	{
		Media course = this.courseDao.findById(2);		
		Review review1 = new Review();
		review1.setReview("testhello");
		
		
		Review added = this.reviewDao.addReviewtoExistingCourse(review1, course);
		assertEquals("testhello", added.getReview());
	}


}
