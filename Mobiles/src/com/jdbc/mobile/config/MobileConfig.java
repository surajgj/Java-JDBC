package com.jdbc.mobile.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.jdbc.mobile.credentials.SqlCredentials;

public class MobileConfig {

	public static Connection getConnection() {
		
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USER.getValue(), SqlCredentials.PASS.getValue());

			return c;
			
		} catch ( SQLException e) {
			System.out.println("Something Went Wrong with Configuration");
			return null;
		}

	}
	
}
