package com.demo.liquor.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.demo.liquor.config.LiquorDbUtils;
import com.demo.liquor.dto.LiquorDto;

public class LiquorRepoImpl implements LiquorRepo {

	@Override
	public boolean save(LiquorDto dto) {

		try {
			Connection con = LiquorDbUtils.getConnection();

			PreparedStatement state = con.prepareStatement("insert into liquor_info values(?,?,?,?,?)");

			state.setInt(1, dto.getId());
			state.setString(2, dto.getBrand());
			state.setString(3, dto.getMl());
			state.setDouble(4, dto.getAlcohol());
			state.setInt(5, dto.getPrice());

			state.executeUpdate();

			return true;

		} catch (Exception e) {
			// TODO: handle exception
		}

		return false;
	}

	@Override
	public List<LiquorDto> readAll() {
		try {
			Connection c = LiquorDbUtils.getConnection();
			PreparedStatement state = c.prepareStatement("select * from liquor_info");

			List<LiquorDto> list = new ArrayList<LiquorDto>();

			ResultSet result = state.executeQuery();

			while(result.next()) {
				int id = result.getInt(1);
				String brand = result.getString(2);
				String ml = result.getString(3);
				double alcohol = result.getDouble(4);
				int price = result.getInt(5);
				
				LiquorDto dto = new LiquorDto(id, brand, ml, alcohol, price);
				list.add(dto);
			}
			
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public List<LiquorDto> findByName(String name) {
		try {
			Connection c = LiquorDbUtils.getConnection();
			PreparedStatement state = c.prepareStatement("select * from liquor_info");

			List<LiquorDto> list = new ArrayList<LiquorDto>();

			ResultSet result = state.executeQuery();

			while(result.next()) {
				if(result.getString("brand").equals(name)) {	
					
					int id = result.getInt(1);
					String brand = result.getString(2);
					String ml = result.getString(3);
					double alcohol = result.getDouble(4);
					int price = result.getInt(5);
					
					LiquorDto dto = new LiquorDto(id, brand, ml, alcohol, price);
					list.add(dto);
				}
			}
			
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}

}
