package com.demo.liquor.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class LiquorDbUtils {

	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/liquor", "root", "Xworkzodc@123");
			return con;
			
		} catch (Exception e) {
			
		}
		
		return null;
	}
	
}
