package com.demo.bottle.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class BottleConfig {

	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bottle", "root", "Xworkzodc@123");
			return c;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}
	
}
