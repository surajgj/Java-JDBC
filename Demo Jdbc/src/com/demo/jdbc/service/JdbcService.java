package com.demo.jdbc.service;

import java.util.List;

import com.demo.jdbc.dto.Dto;

public interface JdbcService {

	public boolean save(Dto dto);
	
	public List<Dto> readAll();
	
	public boolean deleteByName(String name);
	
	public boolean updateAgeByName(String name, int age);
	
}
