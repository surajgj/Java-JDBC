package com.demo.liquor.service;

import java.util.List;

import com.demo.liquor.dto.LiquorDto;

public interface Liquorservice {

	public boolean save(LiquorDto dto);
	
	public List<LiquorDto> readAll();
	
	public List<LiquorDto> findByName(String name);
	
}
