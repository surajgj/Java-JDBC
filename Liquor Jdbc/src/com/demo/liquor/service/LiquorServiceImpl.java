package com.demo.liquor.service;

import java.util.List;

import com.demo.liquor.dto.LiquorDto;
import com.demo.liquor.repo.LiquorRepo;
import com.demo.liquor.repo.LiquorRepoImpl;

public class LiquorServiceImpl implements Liquorservice{

	private LiquorRepo repo = new LiquorRepoImpl();
	
	@Override
	public boolean save(LiquorDto dto) {
		if(dto.getId() > 0) {
			
			return repo.save(dto);			
		}
		return false;
	}

	@Override
	public List<LiquorDto> readAll() {
		
		return repo.readAll();
	}

	@Override
	public List<LiquorDto> findByName(String name) {
		return repo.findByName(name);
	}

}
