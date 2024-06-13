package com.tablet.jdbc.runner;

import com.tablet.jdbc.dto.TabletDto;
import com.tablet.jdbc.repo.TabletRepo;
import com.tablet.jdbc.repo.TabletRepoImpl;

public class TabletRunner {

	public static void main(String[] args) {
		
		TabletRepo repo = new TabletRepoImpl();
		
		TabletDto d1 = new TabletDto(1, "Samsung", 4, 128, 17000);
		TabletDto d2 = new TabletDto(2, "Redmi", 6, 256, 19999);
		TabletDto d3 = new TabletDto(3, "Oppo", 6, 128, 15899);
		TabletDto d4 = new TabletDto(4, "Oneplus", 8, 512, 21999);
		
//		repo.save(d1,d2,d3,d4);
		
//		System.out.println(repo.readAll());
		
//		System.out.println(repo.readByNameandPrice("redmi", 19999));
		
//		repo.updatePriceByRom(18000, 256);
		
//		repo.delteByPrice(18000);

	}

}
