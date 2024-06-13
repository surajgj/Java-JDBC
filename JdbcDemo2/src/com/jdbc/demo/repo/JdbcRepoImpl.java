package com.jdbc.demo.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.jdbc.demo.dto.DemoDto;

public class JdbcRepoImpl implements JdbcRepo {

	@Override
	public boolean save(DemoDto dto) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Xworkzodc@123");
			PreparedStatement statement = con.prepareStatement("Insert into demo_data values(?,?,?,?)");
			
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setInt(3, dto.getAge());
			statement.setString(4, dto.getSex());
			
			statement.executeUpdate();
			return true;
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<DemoDto> read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
