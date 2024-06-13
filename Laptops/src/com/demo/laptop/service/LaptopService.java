package com.demo.laptop.service;

import java.util.List;

import com.demo.laptop.dto.LaptopDto;

public interface LaptopService {

	public boolean save(LaptopDto dto);
	
	public List<LaptopDto> findByName(String name);

	public List<LaptopDto>readAll();

	public boolean updateRamByStorage(int ram, int storage);

	public boolean deleteByRam(int ram);
	
	
	
}
