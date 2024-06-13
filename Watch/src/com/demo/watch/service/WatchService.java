package com.demo.watch.service;

import java.util.List;

import com.demo.watch.dto.WatchDto;

public interface WatchService {

	public boolean save(WatchDto dto);
	
	public WatchDto findById(int id);
	
	public List<WatchDto> readAll();
	
	public boolean deleteById(int id);
	
	public List<WatchDto> findMoreById(int ... id);
	
	public boolean updateStrapByPrice(String strap, double price);
}