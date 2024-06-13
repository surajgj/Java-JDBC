package com.demo.bottle.service;

import java.util.List;

import com.demo.bottle.dto.BottleDto;
import com.demo.bottle.repo.BottleRepo;
import com.demo.bottle.repo.BottleRepoImpl;

public class BottleServiceImpl implements BottleService {

	private BottleRepo repo = new BottleRepoImpl();

	@Override
	public boolean save(BottleDto... dto) {
		return repo.save(dto);
	}

	@Override
	public List<BottleDto> readAll() {
		return repo.readAll();
	}

	@Override
	public List<BottleDto> findByType(String type) {
		// TODO Auto-generated method stub
		return repo.findByType(type);
	}

	@Override
	public BottleDto findById(int id) {
		return repo.findById(id);
	}

	@Override
	public boolean updateTypeAndPriceByName(String type, int price, String name) {
		return repo.updateTypeAndPriceByName(type, price, name);
	}

	@Override
	public List<BottleDto> readByPrice(int ... price) {
		return repo.readByPrice(price);
	}

	@Override
	public boolean deleteByPrice(int price) {
		return repo.deleteByPrice(price);
	}
	
}
