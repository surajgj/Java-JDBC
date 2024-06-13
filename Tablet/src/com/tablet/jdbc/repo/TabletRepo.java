package com.tablet.jdbc.repo;

import java.util.List;

import com.tablet.jdbc.dto.TabletDto;

public interface TabletRepo {

	public boolean save(TabletDto ... dto);
	
	public List readAll();
	
	public List readByNameandPrice(String name, int price);
	
	public boolean updatePriceByRom(int price, int rom);

	public boolean delteByPrice(int price);
	
	
}
