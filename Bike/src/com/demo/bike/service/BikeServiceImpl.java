package com.demo.bike.service;

import java.util.List;

import com.demo.bike.dto.BikeDto;
import com.demo.bike.repo.BikeRepo;
import com.demo.bike.repo.BikeRepoImpl;

public class BikeServiceImpl implements BikeService{

	private BikeRepo repo = new BikeRepoImpl();
	
	@Override
	public boolean save(BikeDto dto) {
		if(dto.getId() > 0) {
			if(dto.getTopSpeed() > 50) {
				return repo.save(dto);
			}
		}
		return false;
	}

	@Override
	public List<BikeDto> readAll() {
		return repo.readAll();
	}

	@Override
	public boolean saveAll(BikeDto[] arr) {
		
		return repo.saveAll(arr);
	}

	@Override
	public List<BikeDto> findByPrice(int price) {
		return repo.findByPrice(price);
	}

	@Override
	public boolean updateSpeedAndPriceByCC(int speed, int price, int cc) {
		return repo.updateSpeedAndPriceByCC(speed,price,cc);
	}

	@Override
	public boolean deleteByNameAndCCAndPrice(String name, int cc, int price) {
		return repo.deleteByNameAndCCAndPrice(name, cc, price);
	}

}
