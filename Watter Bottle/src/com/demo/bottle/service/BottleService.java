package com.demo.bottle.service;

import java.util.List;

import com.demo.bottle.dto.BottleDto;

public interface BottleService {

	public boolean save(BottleDto ... dto);
	
	public List<BottleDto> readAll();
	
	public List<BottleDto> readByPrice(int ... price);
	
	public List<BottleDto> findByType(String type);
	
	public BottleDto findById(int id);
	
	public boolean updateTypeAndPriceByName(String type, int price, String name);
	
	public boolean deleteByPrice(int price);
	
}
