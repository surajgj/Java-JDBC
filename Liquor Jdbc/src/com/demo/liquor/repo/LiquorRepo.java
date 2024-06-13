package com.demo.liquor.repo;

import java.util.List;

import com.demo.liquor.dto.LiquorDto;

public interface LiquorRepo {

	public boolean save(LiquorDto dto);

	public List<LiquorDto> readAll();

	public List<LiquorDto> findByName(String name);

}
