package com.demo.snaks.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtils {
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/snaks", "root", "Xworkzodc@123");
			
			return c;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}

}
