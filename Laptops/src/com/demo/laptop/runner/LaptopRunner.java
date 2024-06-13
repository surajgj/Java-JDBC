package com.demo.laptop.runner;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.demo.laptop.dto.LaptopDto;
import com.demo.laptop.service.LaptopService;
import com.demo.laptop.service.LaptopServiceImpl;

public class LaptopRunner {
	
	public static void main(String[] args) {
				
		
		LaptopService service = new LaptopServiceImpl();
//		
//		LaptopDto d1 = new LaptopDto(1, "Lenovo", "Ryzen 5", 8, 512, 49989.99);
//		LaptopDto d2 = new LaptopDto(2, "MSI", "intel 7", 16, 1024, 70999.87);
//		LaptopDto d3 = new LaptopDto(3, "HP", "Ryzen 3", 4, 256, 35999.00);
//		LaptopDto d4 = new LaptopDto(4, "Lenovo", "intel 5", 16, 1024, 60099.23);
//		LaptopDto d5 = new LaptopDto(5, "Acer", "intel 5", 2, 128, 25000.00);
//		LaptopDto d6 = new LaptopDto(6, "Apple", "Apple M3", 8 , 1024, 159999.99);
		
/////SaveAll
//		LaptopDto[] dtos = {d2,d3,d4,d5,d6};
//		List<LaptopDto> list = Arrays.asList(dtos);
//		for(LaptopDto dto : list) {
//			service.save(dto);
//		}
		
		
////Save		
//		if(service.save(d3)) {
//			System.out.println("Saved Sucessfully");
//		} else {
//			System.out.println("Something Went Wrong While Save");
//		}
		
////Find By Name
//		if(service.findByName("Lenovo") != null) {
//			for(LaptopDto d : service.findByName("Lenovo")) {
//				System.out.println(d);
//			}
//		} else {
//			System.out.println("Something Went Wrong While Finding");
//		}

////Read All
//		for(LaptopDto dto : service.readAll()) {
//			System.out.println(dto);
//		}
		
////Update Ram by Storage
//		if(service.updateRamByStorage(32,1024)) {
//			System.out.println("Updated Successfully");
//		} else {
//			System.out.println("Something went wrong while Updating");
//		}

////Delete By Ram
//		if(service.deleteByRam(2)) {
//			System.out.println("Deleted Successfully");
//		} else {
//			System.out.println("Something Went Wrong While Deleting");
//		}

	}

}
