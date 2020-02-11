package com.cts.training.maven.dao;


import java.util.List;

import com.cts.training.spring.models.Cars;



public interface IcarsDao {
	List<Cars> findAll();
	Cars findById(Integer id);
	boolean add(Cars car);
	boolean update(Cars  car);
	boolean delete(Integer id);

}
