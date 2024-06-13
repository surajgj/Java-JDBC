package com.demo.laptop.service;

import java.util.List;

import com.demo.laptop.dto.LaptopDto;
import com.demo.laptop.repo.LaptopRepo;
import com.demo.laptop.repo.LaptopRepoImpl;

public class LaptopServiceImpl implements LaptopService{

	private LaptopRepo repo = new LaptopRepoImpl();
	
	@Override
	public boolean save(LaptopDto dto) {
		if(dto.getId() > 0) {
			if(dto.getName().length() > 1) {
				if(dto.getRam() >= 2) {
					if(dto.getStorage() >= 128) {
						if(dto.getPrice() > 24999) {
							return repo.save(dto);
						} else 
							System.out.println(dto.getPrice()+ ": Price Should be >= 25000");
					} else 
						System.out.println(dto.getStorage()+": Storage must be >= 128");
				} else 
					System.out.println(dto.getRam()+": Ram Must be >=2");
			} else
				System.out.println(dto.getName()+": Name length Should be > 1");
		} else
			System.out.println(dto.getId() +": ID is Invalid");

		return false;
	}

	@Override
	public List<LaptopDto> findByName(String name) {
		if(name.length() > 2) {
			return repo.findByName(name);
		}
		return null;
	}

	@Override
	public List<LaptopDto> readAll() {
		return repo.readAll();
	}

	@Override
	public boolean updateRamByStorage(int ram, int storage) {
		if(ram > 2) {
			if(storage > 128) {
				return repo.updateRamByStorage(ram,storage);
			}
		}
		return false;
	}

	@Override
	public boolean deleteByRam(int ram) {
		if(ram >= 2) {
			return repo.deleteByRam(ram);
		}
		return false;
	}

}
