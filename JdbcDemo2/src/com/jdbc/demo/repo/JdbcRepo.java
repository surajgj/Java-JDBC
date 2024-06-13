package com.jdbc.demo.repo;

import java.util.List;

import com.jdbc.demo.dto.DemoDto;

public interface JdbcRepo {

	public boolean save(DemoDto dto);

	public List<DemoDto> read();

	public boolean deleteById(int id);

}
