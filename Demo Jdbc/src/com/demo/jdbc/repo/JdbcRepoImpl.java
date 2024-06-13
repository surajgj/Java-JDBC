package com.demo.jdbc.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.demo.jdbc.dto.Dto;

public class JdbcRepoImpl implements JdbcRepo {

	@Override
	public boolean save(Dto dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			PreparedStatement statement = con.prepareStatement("INSERT INTO jdbc_demo values(?,?,?,?)");

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setInt(3, dto.getAge());
			statement.setString(4, dto.getGender());

			statement.executeUpdate();
			return true;

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Dto> readAll() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			PreparedStatement statement = con.prepareStatement("SELECT * FROM jdbc_demo");
			ResultSet result = statement.executeQuery();
			
			List<Dto> list = new ArrayList<Dto>();
			int count = 0;
			while(result.next()) {
				int id = result.getInt(1);
				String name = result.getString(2);
				int  age = result.getInt(3);
				String gender = result.getString(4);
				
				Dto d = new Dto(id, name, age, gender);
				list.add(d);
				count++;
				System.out.println(count);
			}
			return list;
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteByName(String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			PreparedStatement statement = con.prepareStatement("DELETE FROM jdbc_demo WHERE name = ?");
			statement.setString(1, name);
			
			statement.executeUpdate();
			return true;

		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public boolean updateAgeByName(String name, int age) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			PreparedStatement statement = con.prepareStatement("Update jdbc_demo SET age = ? WHERE name = ?");
			statement.setInt(1, age);
			statement.setString(2, name);
			
			statement.executeUpdate();
			return true;

		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
		}
		return false;
	}

}
