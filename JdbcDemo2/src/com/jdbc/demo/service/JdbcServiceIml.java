package com.jdbc.demo.service;

//import java.util.List;

import com.jdbc.demo.dto.DemoDto;
import com.jdbc.demo.repo.JdbcRepo;
import com.jdbc.demo.repo.JdbcRepoImpl;

public class JdbcServiceIml implements JdbcService {

	JdbcRepo repo = new JdbcRepoImpl();
	
	@Override
	public boolean save(DemoDto dto) {
		
		return repo.save(dto);
	}

//	@Override
//	public List<DemoDto> read() {
//		return repo.read();
//	}
//
//	@Override
//	public boolean deleteById(int id) {
//		return repo.deleteById(id);
//	}

}
