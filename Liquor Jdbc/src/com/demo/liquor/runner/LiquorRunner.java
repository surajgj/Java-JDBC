package com.demo.liquor.runner;

import java.util.Arrays;
import java.util.List;

import org.omg.PortableServer.Servant;

import com.demo.liquor.dto.LiquorDto;
import com.demo.liquor.service.LiquorServiceImpl;
import com.demo.liquor.service.Liquorservice;

public class LiquorRunner {

	public static void main(String[] args) {
		
		Liquorservice service = new LiquorServiceImpl();
		
		LiquorDto d1 = new LiquorDto(1, "Old Monk", "350", 48.2, 650);
		LiquorDto d2 = new LiquorDto(2, "Mc Whisky", "180", 42.6, 320);
		LiquorDto d3 = new LiquorDto(3, "8 PM", "350", 42.6, 350);
		LiquorDto d4 = new LiquorDto(4, "Old Traven", "90", 41.5, 100);
		LiquorDto d5 = new LiquorDto(5, "Original Choice", "750", 40.8, 480);
		LiquorDto d6 = new LiquorDto(6, "Silever Cup", "180", 46.7, 120);
		LiquorDto d7 = new LiquorDto(7, "Jack Denials", "750", 43.1, 58920);
		LiquorDto d8 = new LiquorDto(8, "Old Monk", "180", 48.2, 200);
		LiquorDto d9 = new LiquorDto(9, "Old Monk", "90", 48.2, 110);
		
		LiquorDto[] dto = {d1, d2, d3, d4, d5}; 
		
		List<LiquorDto> list = Arrays.asList(dto);
		
//		for(LiquorDto dt : list) {
//			if(service.save(dt)) {
//				System.out.println("Saved Sucessfully");
//			} else {
//				System.out.println("Something went wrong while Saving");
//			}
//		}
		
//		if(service.save(d9)) {
//			System.out.println("Saved Sucessfully");
//		} else {
//			System.out.println("Something went wrong while Saving");
//		}
		
//		for(LiquorDto dt : service.readAll()) {
//			System.out.println(dt);
//		}
		
//		for(LiquorDto dt : service.findByName("Old Monk")) {
//			System.out.println(dt);
//		}
		
	}
	
}
