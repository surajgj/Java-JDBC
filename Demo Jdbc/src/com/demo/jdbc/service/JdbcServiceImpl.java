package com.demo.jdbc.service;

import java.util.List;

import com.demo.jdbc.dto.Dto;
import com.demo.jdbc.repo.JdbcRepo;
import com.demo.jdbc.repo.JdbcRepoImpl;

public class JdbcServiceImpl implements JdbcService {

	private JdbcRepo repo = new JdbcRepoImpl();
	
	@Override
	public boolean save(Dto dto) {
		if(dto.getId() > 0) {
			if(dto.getName().length() > 3) {
				if(dto.getAge() >= 18) {
					if(dto.getGender().equals("Male") || dto.getGender().equals("Female")) {
						return repo.save(dto);
					}else
					System.err.println("Error: Invalid, Try with all characters are in capital letters");
				}else
				System.err.println("Error: Age must be > 18");
			}else
			System.err.println("Error: Invalid name, Name Must contain > 3 Character");
		}else
			System.err.println("Error: ID is Invalid or ID must be Greater than 0");
		return false;
	}

	@Override
	public List<Dto> readAll() {
		return repo.readAll();
	}

	@Override
	public boolean deleteByName(String name) {
		if(name.length() > 3) {
			return repo.deleteByName(name);
		}
		return false;
	}

	@Override
	public boolean updateAgeByName(String name, int age) {
		if(name.length() > 3) {
			if(age >= 18) {
				return repo.updateAgeByName(name,age);
			}
		}
		return false;
	}

	
	
}
