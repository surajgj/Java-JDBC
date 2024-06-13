package com.demo.watch.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/watch", "root", "Xworkzodc@123");
			return con;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
		}
		
		return null;
		
	}

}
