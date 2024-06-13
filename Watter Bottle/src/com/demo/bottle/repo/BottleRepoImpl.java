package com.demo.bottle.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.bottle.config.BottleConfig;
import com.demo.bottle.dto.BottleDto;

public class BottleRepoImpl implements BottleRepo {

	@Override
	public boolean save(BottleDto... dto) {
		Connection c = BottleConfig.getConnection();

		try {
			PreparedStatement s = c.prepareStatement("Insert into bottle_info values (?, ?, ?, ?)");

			for (BottleDto dt : dto) {
				s.setInt(1, dt.getId());
				s.setString(2, dt.getName());
				s.setString(3, dt.getType());
				s.setInt(4, dt.getPrice());
				s.executeUpdate();

			}
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<BottleDto> readAll() {
		Connection c = BottleConfig.getConnection();
		List<BottleDto> l = new ArrayList<BottleDto>();
		try {
			PreparedStatement s = c.prepareStatement("Select * from bottle_info");
			ResultSet r = s.executeQuery();

			while (r.next()) {
				int i = r.getInt(1);
				String n = r.getString(2);
				String t = r.getString(3);
				int p = r.getInt(4);

				BottleDto dto = new BottleDto(i, n, t, p);
				l.add(dto);
			}
			return l;
		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}

	@Override
	public List<BottleDto> findByType(String type) {
		Connection c = BottleConfig.getConnection();
		List<BottleDto> l = new ArrayList<BottleDto>();
		try {
			PreparedStatement s = c.prepareStatement("Select * from bottle_info where type = ?");
			s.setString(1, type);
			ResultSet r = s.executeQuery();

			while (r.next()) {
				int i = r.getInt(1);
				String n = r.getString(2);
				String t = r.getString(3);
				int p = r.getInt(4);

				BottleDto dto = new BottleDto(i, n, t, p);
				l.add(dto);
			}
			return l;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public BottleDto findById(int id) {
		Connection c = BottleConfig.getConnection();
		try {
			PreparedStatement s = c.prepareStatement("Select * from bottle_info where id = ?");
			s.setInt(1, id);
			ResultSet r = s.executeQuery();

			r.next();
			int i = r.getInt(1);
			String n = r.getString(2);
			String t = r.getString(3);
			int p = r.getInt(4);
			BottleDto dto = new BottleDto(i, n, t, p);

			return dto;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updateTypeAndPriceByName(String type, int price, String name) {
		Connection c = BottleConfig.getConnection();
		try {
			PreparedStatement s = c.prepareStatement("Update bottle_info set type = ?, price = ? where name = ?");
			
			s.setString(1, type);
			s.setInt(2, price);
			s.setString(3, name);
			
			s.executeUpdate();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<BottleDto> readByPrice(int ... price) {
		List<BottleDto> dto = new ArrayList<BottleDto>();
		
		for(int i : price) {
			for(BottleDto dt : readAll()) {
				if(i == dt.getPrice()) {
					dto.add(dt);
				}
			}
		}
		return dto;
	}

	@Override
	public boolean deleteByPrice(int price) {
		Connection c = BottleConfig.getConnection();
		try {
			PreparedStatement s = c.prepareStatement("Delete from bottle_info where price = ?");
			s.setInt(1, price);
			s.executeUpdate();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return false;
	}

}
