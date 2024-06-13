package com.jdbc.demo.repo;

import java.util.List;

import com.jdbc.demo.dto.JdbcDto;

public interface JdbcRepo {

	public boolean save(JdbcDto dto);

	public List<JdbcDto> read();

	public boolean deleteById(int id);

}
