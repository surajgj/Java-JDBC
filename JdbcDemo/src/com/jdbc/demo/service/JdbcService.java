package com.jdbc.demo.service;

import java.util.List;

import com.jdbc.demo.dto.JdbcDto;

public interface JdbcService {

	public boolean save(JdbcDto dto);
	
	public List<JdbcDto> read();

	public boolean deleteById(int id);
	
}
