package com.demo.watch.service;

import java.util.List;

import com.demo.watch.dto.WatchDto;
import com.demo.watch.repo.WatchRepo;
import com.demo.watch.repo.WatchRepoImpl;

public class WatchServiceImpl implements WatchService{

	WatchRepo repo = new WatchRepoImpl();
	
	@Override
	public boolean save(WatchDto dto) {
		if(dto.getId() > 0) {
			if(dto.getBrandName().length() > 3) {
				if(dto.getPrice() > 999) {
					return repo.save(dto);
				}
			}
		}
		return false;
	}

	@Override
	public WatchDto findById(int id) {
		if(id > 0) {
			return repo.findById(id);
		}
		return null;
	}

	@Override
	public List<WatchDto> readAll() {
		return repo.readAll();
	}

	@Override
	public boolean deleteById(int id) {
		if(id > 0) {
			return repo.deleteById(id);
		}
		return false;
	}

	@Override
	public List<WatchDto> findMoreById(int... id) {
		return repo.findMoreById(id);
	}

	@Override
	public boolean updateStrapByPrice(String strap, double price) {
		if(strap.length() > 3) {
			if(price > 999) {
				return repo.updateStrapByPrice(strap,price);
			}
		}
		return false;
	}

}
