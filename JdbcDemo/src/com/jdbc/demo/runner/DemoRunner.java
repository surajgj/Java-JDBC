package com.jdbc.demo.runner;

import com.jdbc.demo.dto.JdbcDto;
import com.jdbc.demo.service.JdbcService;
import com.jdbc.demo.service.JdbcServiceIml;

public class DemoRunner {

	public static void main(String[] args) {
		
		System.out.println("Hello iam running");
		
		JdbcService serv = new JdbcServiceIml();
		
		JdbcDto dto = new JdbcDto(1, "Suraj S", 23, "Male");
		
		if(serv.save(dto)) {
			System.out.println("Saved Sucessfully");
		} else {
			System.out.println("Something went wrong");
		}
		
//		System.out.println(serv.read());
		
//		if(serv.deleteById(1)) {
//			System.out.println("Deleted sucessfully");
//		} else {
//			System.out.println("Something went wrong");
//		}

	}

}
