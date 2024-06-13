package com.demo.bottle.runner;

import com.demo.bottle.dto.BottleDto;
import com.demo.bottle.service.BottleService;
import com.demo.bottle.service.BottleServiceImpl;

public class BottleRunner extends Thread {

	private static BottleService service = new BottleServiceImpl();
	
	{
		super.start();
	}
	
//	public static void main(String[] args) {
//		
//		BottleDto d1 = new BottleDto(1, "Bisleri", "Plastic", 20);
//		BottleDto d2 = new BottleDto(2, "Meyser", "Plastic", 25);
//		BottleDto d3 = new BottleDto(3, "Vande Matharam", "Plastic", 18);
//		BottleDto d4 = new BottleDto(4, "Royal Challenge", "glass", 60);
//		
////		MyThread t = new MyThread();
////		t.start();
//		for(int i = 0;i < 10; i++) {
//			System.out.println("Main thread");
//		}
		
//		Thread.currentThread().setPriority(1);
//		System.out.println(Thread.currentThread().getPriority());
//		t.setPriority(10);
//		System.out.println(t.getPriority());
		
//		t.interrupt();
//		System.out.println("End Of Main Method");
//		if(service.save(d1, d2, d3, d4)) {
//			System.out.println("Saved Sucessfully");
//		} else {
//			System.out.println("Something went wrong While Saving");
//		}
		
//		System.out.println(service.findByType("Plastic"));
		
//		System.out.println(service.findById(1));
//		service.updateTypeAndPriceByName("Glass", 59, "Meyser");
		
//		System.out.println(service.readByPrice(20,59, 60));
//		service.deleteByPrice(18);
//		System.out.println(service.readAll());
	}

}
