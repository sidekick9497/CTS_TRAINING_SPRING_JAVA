package com.cts.training.maven.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.DataSourceFactory;
import org.springframework.stereotype.Component;

import com.cts.training.spring.models.Cars;


@Component
public class CarsDao implements IcarsDao {
	
	private JdbcTemplate jdbcTemplate;
	
	// SQL templates
	private final String SQL_FETCH_ALL = "select * from cars";
	private final String SQL_FETCH_BY_ID = "select * from cars where id=?";
	private final String SQL_INSERT = "insert into cars(name,cost) values(?, ?)";
	private final String SQL_UPDATE = "update cars set name=?, cost=? where id=?";
	private final String SQL_DELETE = "delete from cars where id=?";

	@Autowired
	public CarsDao(DataSource dataSource) {
		// TODO Auto-generated constructor stub
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Cars> findAll() {
		
		
		List<Cars> cars = this.jdbcTemplate.query(this.SQL_FETCH_ALL,new BeanPropertyRowMapper<Cars>(Cars.class));
		return cars;
	}

	@Override
	public Cars findById(Integer id) {
		
		Cars car = this.jdbcTemplate.queryForObject(this.SQL_FETCH_BY_ID, new Object[] {id},new BeanPropertyRowMapper<Cars>(Cars.class));
			
		return car;
	}

	@Override
	public boolean add(Cars car) {
		int n = this.jdbcTemplate.update(this.SQL_INSERT,new Object[] {car.getName(),car.getCost()});
		
		if(n>0)
			return true;
	
		return false;
	}

	@Override
	public boolean update(Cars car) {
		int n = this.jdbcTemplate.update(this.SQL_UPDATE,new Object[] {car.getName(),car.getCost(),car.getId()});
		if(n>0)
			return true;
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		int n = this.jdbcTemplate.update(this.SQL_DELETE,new Object[] {id});
		if(n>0)
			return true;
		return false;
	}

	
}
