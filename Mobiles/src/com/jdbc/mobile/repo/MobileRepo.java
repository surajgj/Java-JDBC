package com.jdbc.mobile.repo;

import java.util.List;

import com.jdbc.mobile.dto.MobileDto;

public interface MobileRepo {

	public String save(MobileDto dto);

	public String save(List<MobileDto> list);

	public List<MobileDto> readAll();

	public List<MobileDto> readByStorage(int storage);

	public String updatePriceByStorage(int price, int storage);

	public String deleteByProcessor(String processor);
	
}
