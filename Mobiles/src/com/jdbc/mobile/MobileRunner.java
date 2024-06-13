package com.jdbc.mobile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.jdbc.mobile.dto.MobileDto;
import com.jdbc.mobile.service.MobileServiceImpl;
import com.jdbc.mobile.service.MoobileService;

public class MobileRunner {

	public static void main(String [] args) {
		
		MoobileService service = new MobileServiceImpl();
		
		MobileDto d1 = new MobileDto(1, "Apple", 256, 2, "Apple Chip", 35000);
		MobileDto d2 = new MobileDto(2, "Redmi", 128, 6, "Snapdragon", 19999);
		MobileDto d3 = new MobileDto(3, "Realme", 256, 8, "MediaTek", 24999);
		MobileDto d4 = new MobileDto(4, "Vivo", 64, 4, "Snapdragon", 9999);
		MobileDto d5 = new MobileDto(5, "Lava", 64, 6, "Eronow", 8999);
		MobileDto d6 = new MobileDto(6, "Oppo", 128, 8, "Mediatek", 18999);
		
		MobileDto[] dtos = {d1, d2, d3, d4, d5, d6};
		
		List<MobileDto> l = Arrays.asList(dtos);
		
		List<MobileDto> ll = new  ArrayList<MobileDto>();
		ll.add(d1);
		ll.add(d2);
		ll.add(d3);
		ll.add(d4);
		ll.add(d5);
		ll.add(d6);

		
		for (MobileDto dto : dtos) {
			System.out.println(service.save(dto));
		}
		
		
		System.out.println(service.save(ll));
		
		System.out.println(service.readAll());
		
		System.out.println(service.redByStorage(256));
		
		System.out.println(service.updatePriceByStorage(8999, 64));
		
		System.out.println(service.deleteByProcessor("Eronow"));
		
	}
	
}
