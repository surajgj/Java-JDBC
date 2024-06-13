package com.demo.watch.runner;

import java.util.Arrays;
import java.util.List;

import com.demo.watch.dto.WatchDto;
import com.demo.watch.service.WatchService;
import com.demo.watch.service.WatchServiceImpl;

public class WatchRunner {

	public static void main(String[] args) {

		WatchService service = new WatchServiceImpl();

		WatchDto d3 = new WatchDto(3, "Peter England", "Analog", "Lether", 7895.56);
		WatchDto d4 = new WatchDto(4, "Apple", "Smart Watch", "Silicon", 1899.99);
		WatchDto d5 = new WatchDto(5, "Fastrack", "Digital", "Silicon", 3598.78);
		WatchDto d6 = new WatchDto(6, "G-Shock", "Analog & Analog", "Rubber", 11185.58);

		WatchDto[] arr = { d3, d4, d5, d6 };

		List<WatchDto> list = Arrays.asList(arr);
		int count = 0;

//----------------------------Save One Dto--------------------------------------------
//		if(service.save(d2)) {
//			System.out.println("Saved Sucessfully");
//		} else {
//			System.out.println("Something Went Wrong");
//		}

//----------------------------Save Multiple Dto at once (Save All)---------------------

//		for(WatchDto d : list) {
//			service.save(d);
//			count++;
//		}
//		System.out.println("Total Watch Saved: "+ count);

//-----------------------------Find by ID------------------------------------------------

//		System.out.println(service.findById(2));

//		if(service.findById(2) != null) {
//			System.out.println(service.findById(2));
//		} else {
//			System.out.println("Something went Wrong");
//		}
//-----------------------------Read All--------------------------------------------------

//		for(WatchDto d : service.readAll()) {
//			System.out.println(d);
//		}
//		System.out.println(service.readAll());

//-----------------------------Delete By ID ----------------------------------------------

//		if(service.deleteById(5)) {
//			System.out.println("Sucessfully Deleted");
//		} else {
//			System.out.println("Something Went Wrong");
//		}

//-----------------------------Find by ID using Var-arg method-----------------------------	

//		int[] a = {4,1,6};
//		if(service.findMoreById(a) == null) {
//			System.out.println("Id doesnot contains any Watch Dto");
//		} else {
//			System.out.println(service.findMoreById(a));	
//		}
		
		
//------------------------------Update Strap By Price---------------------------------------
		
		if(service.updateStrapByPrice("Lether", 4999999)) {
			System.out.println("Updated Sucessfully");
		} else {
			System.out.println("Something went Wrong");
		}

	}

}
