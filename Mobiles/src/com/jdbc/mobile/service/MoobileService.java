package com.jdbc.mobile.service;

import java.util.List;

import com.jdbc.mobile.dto.MobileDto;

public interface MoobileService {

	public String save(MobileDto dto);
	
	public String save(List<MobileDto> list);
	
	public List<MobileDto> readAll();
	
	public List<MobileDto> redByStorage(int storage);
	
	public String updatePriceByStorage(int price, int storage);
	
	public String deleteByProcessor(String processor);
	
}
