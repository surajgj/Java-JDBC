package com.demo.laptop.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics", "root", "Xworkzodc@123");
			
			return c;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
		}
		
		return null;
	}

}
