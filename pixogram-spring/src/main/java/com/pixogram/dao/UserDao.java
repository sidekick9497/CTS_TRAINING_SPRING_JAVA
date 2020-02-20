package com.pixogram.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pixogram.entity.Media;
import com.pixogram.entity.Passport;
import com.pixogram.entity.User;

@Repository

public class UserDao {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	// dependency
	@Autowired
	private EntityManager em;
	
	
	@Transactional
	public List<User> getAllStudents(){
			TypedQuery<User> query =  this.em.createQuery("SELECT USER FROM USER")
			return null;
	}
	@Transactional
	public User findById(Integer id) {
		User student = this.em.find(User.class, id);
		return student;
	}
	
	@Transactional
	public User addUser(User user) {
		return null;
	}
	
	
	}

