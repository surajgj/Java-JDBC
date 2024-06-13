package com.demo.snaks.service;

import com.demo.snaks.dto.SnaksDto;
import com.demo.snaks.repo.SnaksRepo;
import com.demo.snaks.repo.SnaksRepoImpl;

public class SnaksServiceImpl implements SnaksService{

	private SnaksRepo repo = new SnaksRepoImpl();
	
	@Override
	public boolean save(SnaksDto dto) {
		if(dto.getId() > 0) {
			return repo.save(dto);
		}
		return false;
	}

}
