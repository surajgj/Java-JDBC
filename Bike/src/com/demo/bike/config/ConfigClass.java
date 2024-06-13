package com.demo.bike.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigClass {

	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bike", "root", "Xworkzodc@123");
			return con;
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Exception in Configuration");
		}
		
		return null;
	}
	
}
