package com.tablet.jdbc.config;

import java.sql.Connection;
import java.sql.DriverManager;

import com.tablet.jdbc.credentials.SqlCredentials;

public class TabletConfig {
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection(SqlCredentials.URL.getGetValue(), SqlCredentials.USER.getGetValue(), 
					SqlCredentials.PASS.getGetValue());
			return c;
		} catch (Exception e) {
			System.out.println("Exception in Connection");
		}
		return null;
		
	}

}
