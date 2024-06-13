package com.demo.bike.service;

import java.util.List;

import com.demo.bike.dto.BikeDto;

public interface BikeService {

	public boolean save(BikeDto d1);
	
	public boolean saveAll(BikeDto[] arr);
	
	public List<BikeDto> readAll();
	
	public List<BikeDto> findByPrice(int price);
	
	public boolean updateSpeedAndPriceByCC(int speed, int price,int cc);
	
	public boolean deleteByNameAndCCAndPrice(String name, int cc, int price);

}
