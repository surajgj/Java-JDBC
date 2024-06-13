package com.demo.jdbc.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.demo.jdbc.dto.Dto;
import com.demo.jdbc.service.JdbcService;
import com.demo.jdbc.service.JdbcServiceImpl;

public class DemoRunner {

	public static void main(String[] args) {
		
		
		
		JdbcService service = new JdbcServiceImpl();
		
		Dto d1 = new Dto(2, "Sharath", 26, "Male");
		Dto d2 = new Dto(3, "Shamanth", 21, "Male");
		Dto d3 = new Dto(4, "Rohan", 24, "Male");
		Dto d4 = new Dto(5, "Hitesh", 23, "Male");
		
		Dto[] saveAll = {d1,d2,d3,d4};
		List<Dto> save = Arrays.asList(saveAll);
		
//		ArrayList<Dto> dt = new ArrayList<Dto>();
//		dt.add(d1);
//		dt.add(d2);
//		dt.add(d3);
//		dt.add(d4);
		
//		for(Dto d : save) {
//			if(service.save(d)) {
//				System.out.println("Saved to Db Sucessfully");
//			}
//			
//		}
		
//		if(service.save(d3)) {
//			System.out.println("Saved to Db Sucessfully");
//		}
		
//		if(service.readAll() == null) {
//			System.out.println("DAtabase is Empty");
//		}else {
//			System.out.println(service.readAll());
//		}
		
//		if(service.deleteByName("Rohan")) {
//			System.out.println("Secussfully Deleted");
//		}
		
//		if(service.updateAgeByName("Sharath", 21)) {
//			System.out.println("Updated Sucessfully");
//		} else {
//			System.out.println("Something went Wrong");
//		}
	
		
	}
	
}
