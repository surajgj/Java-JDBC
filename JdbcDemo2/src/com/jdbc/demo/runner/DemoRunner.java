package com.jdbc.demo.runner;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.jdbc.demo.dto.DemoDto;
import com.jdbc.demo.service.JdbcService;
import com.jdbc.demo.service.JdbcServiceIml;

public class DemoRunner {
		
	public static void main(String[] args) {
			
//			System.out.println("Hello iam running");
			
			JdbcService serv = new JdbcServiceIml();
			
//			DemoDto dto = new DemoDto(2, "Vamshi S", 2, "Male");
//			DemoDto dto1 = new DemoDto(3, "Kamala", 25, "Female");
//			DemoDto dto2 = new DemoDto(4, "Vimala", 24, "Female");
//			DemoDto dto3 = new DemoDto(5, "Kushal", 28, "Male");
//			DemoDto dto4 = new DemoDto(6, "Pramoda", 21, "Male");
			DemoDto dto6 = new DemoDto(2, "Jhon", 23, "Male");
			
			serv.save(dto6);
			
//			List<DemoDto> addList = Arrays.asList(dto1,dto2,dto3,dto4);
			
//			Iterator iterator = addList.iterator();
//			while(iterator.hasNext()) {
//				System.out.println(iterator.next());
////				serv.save(iterator.next());
//			}
//			
//			for ( ) {
//				DemoDto demoDto = (DemoDto) iterator.next();
//				
//			}
//			
//			for(int i= 0; i>0; i++) {
//				addList.add(dto)
//			}
//			
//			if(serv.save(dto)) {
//				System.out.println("Saved Sucessfully");
//			} else {
//				System.out.println("Something went wrong");
//			}
			
//			System.out.println(serv.read());
			
//			if(serv.deleteById(1)) {
//				System.out.println("Deleted sucessfully");
//			} else {
//				System.out.println("Something went wrong");
//			}

		}
}
