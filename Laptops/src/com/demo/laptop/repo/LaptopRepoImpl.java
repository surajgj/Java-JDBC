package com.demo.laptop.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.laptop.dto.LaptopDto;
import com.demo.laptop.utils.DbUtils;

public class LaptopRepoImpl implements LaptopRepo {

	@Override
	public boolean save(LaptopDto dto) {

		try (Connection c = DbUtils.getConnection();
				PreparedStatement ps = c.prepareStatement("Insert into laptop_data Values (?,?,?,?,?,?)")) {

			ps.setInt(1, dto.getId());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getProcessor());
			ps.setInt(4, dto.getRam());
			ps.setInt(5, dto.getStorage());
			ps.setDouble(6, dto.getPrice());

			ps.execute();
			return true;

		} catch (SQLException e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public List<LaptopDto> findByName(String name) {

		try (Connection c = DbUtils.getConnection();
				PreparedStatement ps = c.prepareStatement("Select * From laptop_data where name = ?")) {

			List<LaptopDto> db = new ArrayList<LaptopDto>();

			ps.setString(1, name);
			ResultSet set = ps.executeQuery();

			while (set.next()) {
				int id = set.getInt(1);
				String naam = set.getString(2);
				String process = set.getString(3);
				int ram = set.getInt(4);
				int storage = set.getInt(5);
				double price = set.getDouble(6);
				LaptopDto d = new LaptopDto(id, naam, process, ram, storage, price);
				db.add(d);
			}
			return db;
		} catch (SQLException e) {
			// TODO: handle exception
		}

		return null;
	}

	@Override
	public List<LaptopDto> readAll() {
		try (Connection c = DbUtils.getConnection();
				PreparedStatement ps = c.prepareStatement("Select * From laptop_data")) {

			List<LaptopDto> db = new ArrayList<LaptopDto>();

			ResultSet set = ps.executeQuery();
			while (set.next()) {
				int id = set.getInt(1);
				String naam = set.getString(2);
				String process = set.getString(3);
				int ram = set.getInt(4);
				int storage = set.getInt(5);
				double price = set.getDouble(6);
				LaptopDto d = new LaptopDto(id, naam, process, ram, storage, price);
				db.add(d);
			}
			return db;
		} catch (SQLException e) {
			// TODO: handle exception
		}

		return null;
	}

	@Override
	public boolean updateRamByStorage(int ram, int storage) {
		try (Connection c = DbUtils.getConnection();
				PreparedStatement ps = c.prepareStatement("Update laptop_data Set ram = ? Where storage = ?")) {

			ps.setInt(1, ram);
			ps.setInt(2, storage);
			
			ps.execute();
			return true;
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public boolean deleteByRam(int ram) {
		try (Connection c = DbUtils.getConnection();
				PreparedStatement ps = c.prepareStatement("Delete From laptop_data Where ram = ?")) {

			ps.setInt(1, ram);
			
			ps.execute();
			return true;
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return false;
	}

}
