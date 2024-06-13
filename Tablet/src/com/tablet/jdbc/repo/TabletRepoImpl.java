package com.tablet.jdbc.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.tablet.jdbc.config.TabletConfig;
import com.tablet.jdbc.dto.TabletDto;

public class TabletRepoImpl implements TabletRepo{

	@Override
	public boolean save(TabletDto ... dt) {
		try {
			Connection c = TabletConfig.getConnection();
			PreparedStatement s = c.prepareStatement("Insert into tablet_info values(? ,? ,? ,?, ?)");
			for(TabletDto dto : dt) {
				s.setInt(1, dto.getId());
				s.setString(2, dto.getName());
				s.setInt(3, dto.getRam());
				s.setInt(4, dto.getRom());
				s.setInt(5, dto.getPrice());
				
				s.executeUpdate();
			}
			
			
			return true;
			
		} catch (SQLException e) {
			
		}
		return false;
	}

	@Override
	public List readAll() {
		try {
			Connection c = TabletConfig.getConnection();
			PreparedStatement s = c.prepareStatement("Select * from tablet_info");
			
			List list = new ArrayList();
			ResultSet result = s.executeQuery();
			
			while(result.next()) {
				int id = result.getInt(1);
				String name = result.getString(2);
				int rom = result.getInt(3);
				int ram = result.getInt(4);
				int price = result.getInt(5);
				
				TabletDto d = new TabletDto(id, name, ram, rom, price);
				list.add(d);
				
			}
			
			
			return list;
			
		} catch (SQLException e) {
			
		}
		return null;
		
	}

	@Override
	public List readByNameandPrice(String name, int price) {
		try {
			Connection c = TabletConfig.getConnection();
			PreparedStatement s = c.prepareStatement("Select * from tablet_info  where name = ? and price = ?");
			
			s.setString(1, name);
			s.setInt(2, price);
			
			
			List list = new ArrayList();
			ResultSet result = s.executeQuery();
			
			while(result.next()) {
				int id = result.getInt(1);
				String n = result.getString(2);
				int rom = result.getInt(3);
				int ram = result.getInt(4);
				int pe = result.getInt(5);
				
				TabletDto d = new TabletDto(id, n, ram, rom, pe);
				list.add(d);
				
			}
			
			
			return list;
			
		} catch (SQLException e) {
			
		}
		return null;
	}

	@Override
	public boolean updatePriceByRom(int price, int rom) {
		try {
			Connection c = TabletConfig.getConnection();
			PreparedStatement s = c.prepareStatement("Update tablet_info set price = ? where rom = ?");

				s.setInt(2, rom);
				s.setInt(1, price);
				
				s.executeUpdate();
			
			
			return true;
			
		} catch (SQLException e) {
			
		}
		return false;
	}

	@Override
	public boolean delteByPrice(int price) {
		try {
			Connection c = TabletConfig.getConnection();
			PreparedStatement s = c.prepareStatement("Delete from tablet_info where price <= ?");

				s.setInt(1, price);
				
				s.executeUpdate();
			
			
			return true;
			
		} catch (SQLException e) {
			
		}
		return false;
	}

}
