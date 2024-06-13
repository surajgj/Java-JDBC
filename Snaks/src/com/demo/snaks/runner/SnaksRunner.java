package com.demo.snaks.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.demo.snaks.dto.SnaksDto;
import com.demo.snaks.service.SnaksService;
import com.demo.snaks.service.SnaksServiceImpl;

public class SnaksRunner {

	private static SnaksService serv = new SnaksServiceImpl();
	
	public static void main(String[] args) {

		
		SnaksDto dt1 = new SnaksDto(1, "kodbale", "Chilly", "Spicy", 120);
		SnaksDto dt2 = new SnaksDto(2, "Kajjaya", "Ginger", "Spicy", 120);
		SnaksDto dt3 = new SnaksDto(3, "Nipattu", "Garlic", "Spicy", 120);
		SnaksDto dt4 = new SnaksDto(4, "Rave Unde", "Sooji", "Sweet", 120);
		SnaksDto dt5 = new SnaksDto(5, "Kajjaya", "Onion", "Normal", 120);
		SnaksDto dt6 = new SnaksDto(6, "Kodbale", "Floor", "Sweet", 120);
		SnaksDto dt7 = new SnaksDto(7, "Kajjaya", "Badam", "Sweet", 120);
		SnaksDto dt8 = new SnaksDto(8, "Mandakki", "Capcicum", "Normal", 120);

		SnaksDto[] dt = { dt1, dt2, dt3, dt4, dt5, dt6, dt7, dt8 };
		List<SnaksDto> list = Arrays.asList(dt);

		List<String> ss = new ArrayList<String>();

		int count = 0;
		int coun = 0;
		for (SnaksDto dto : list) {
			if(dto.getSanksName().equalsIgnoreCase("Kajjaya")) {
				if(count == 0 ) {
					serv.save(dto);
					count++;
				}else
				System.out.println("Alredy Exist");
				
			}else {
				serv.save(dto);
			}
			
		}

	}

}
