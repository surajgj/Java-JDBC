package com.demo.bike.repo;

import java.util.List;

import com.demo.bike.dto.BikeDto;

public interface BikeRepo {

	public boolean save(BikeDto dto);

	public List<BikeDto> readAll();

	public boolean saveAll(BikeDto[] arr);

	public List<BikeDto> findByPrice(int price);

	public boolean updateSpeedAndPriceByCC(int speed, int price, int cc);

	public boolean deleteByNameAndCCAndPrice(String name, int cc, int price);

}
