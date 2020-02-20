package com.cts.training.hibernatemapping.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.pixogram.cofig.PixogramSpring;
import com.pixogram.dao.UserDao;
import com.pixogram.entity.Passport;
import com.pixogram.entity.User;

@RunWith(SpringRunner.class) // Test Runner
@SpringBootTest(classes =  PixogramSpring.class ) // where to get all context
public class StudentDaoTests {

	// dependency
	@Autowired
	private UserDao studentDao;
	
	/*@Test
	public void testFindById() {
		Student student = studentDao.findById(1);
		assertEquals("First", student.getName());
	}*/

	/*@Test
	public void testAddStudent() {
		Student student = new Student();
		student.setName("Fifth");
		student.setEmail("fifth@mail.com");
		Student added = this.studentDao.addStudent(student);
		assertEquals("Fifth", student.getName());
	}*/
	
	/*@Test
	public void testAddStudentAndPassport() {
		Student student = new Student();
		student.setName("Seventh");
		student.setEmail("seventh@mail.com");
		
		Passport passport = new Passport();
		passport.setPassportNumber("X12345");
	
		Student added = this.studentDao.addStudentAndPassport(student, passport);
		assertEquals("Seventh", student.getName());
	}
	
	@Test
	public void testAddStudentAndPassportPro() {
		Student student = new Student();
		student.setName("Ninth");
		student.setEmail("ninth@mail.com");
		
		Passport passport = new Passport();
		passport.setPassportNumber("A12345");
	
		Student added = this.studentDao.addStudentAndPassportPro(student, passport);
		assertEquals("Ninth", student.getName());
	}*/
	
}
