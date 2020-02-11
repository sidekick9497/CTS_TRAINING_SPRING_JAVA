package com.cts.training.spring.models;

import java.util.UUID;

public class Cars {
	private String name;
	private Integer cost;
	private Integer id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Cars [name=" + name + ", cost=" + cost + ", id=" + id + "]";
	}
	
	
}
