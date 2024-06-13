package com.jdbc.demo.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.demo.dto.JdbcDto;

public class JdbcRepoImpl implements JdbcRepo {

	@Override
	public boolean save(JdbcDto dto) {
		
		String query = "Insert into demo_data values(?,?,?,?)";
		
		try{	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "Xworkzodc@123");
			PreparedStatement state = con.prepareStatement(query);
			System.out.println( state);
			if( state != null ) {
				state.setInt(1,4);
				state.setString(2, dto.getName());
				state.setInt(3, dto.getAge());
				state.setString(4, dto.getSex());
				System.out.println(dto.getAge()+","+dto.getId()+","+dto.getName()+","+dto.getSex());
			}
			return true;
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<JdbcDto> read() {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "Xworkzodc@123");
				PreparedStatement state = con.prepareStatement("select * from demo_data");)
		{
			ResultSet set = state.executeQuery();
			List<JdbcDto> list = new ArrayList<JdbcDto>();
			
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				int age = set.getInt(3);
				String sex = set.getString(4);
				
				JdbcDto dto = new JdbcDto(id, name, age, sex);
				list.add(dto);
			}
			return list;
		} catch(SQLException e) {
			
		}
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "Xworkzodc@123");
				PreparedStatement state = con.prepareStatement("delete from demo_data where id=?");){	
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				if( state != null ) {
					state.setInt(1, id);
					return true;
				}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
