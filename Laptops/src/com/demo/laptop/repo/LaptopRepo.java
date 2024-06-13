package com.demo.laptop.repo;

import java.util.List;

import com.demo.laptop.dto.LaptopDto;

public interface LaptopRepo {

	public boolean save(LaptopDto dto);

	public List<LaptopDto> findByName(String name);

	public List<LaptopDto> readAll();

	public boolean updateRamByStorage(int ram, int storage);

	public boolean deleteByRam(int ram);

}
