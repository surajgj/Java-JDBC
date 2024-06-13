package com.demo.snaks.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.demo.snaks.config.DbUtils;
import com.demo.snaks.dto.SnaksDto;

public class SnaksRepoImpl implements SnaksRepo{

	@Override
	public boolean save(SnaksDto dto) {
		
		Connection con = DbUtils.getConnection();
		
		try {			
			PreparedStatement state = con.prepareStatement("insert into snaks_info values(?,?,?,?,?)");
			
			state.setInt(1, dto.getId());
			state.setString(2, dto.getSanksName());
			state.setString(3, dto.getFlavor());
			state.setString(4, dto.getTaste());
			state.setInt(5, dto.getPrice());

			state.executeUpdate();
			
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return false;
	}

}
