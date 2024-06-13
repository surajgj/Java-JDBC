package com.demo.watch.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.watch.dto.WatchDto;

public class WatchRepoImpl implements WatchRepo {

	@Override
	public boolean save(WatchDto dto) {

		try (Connection c = DbUtils.getConnection();
				PreparedStatement statement = c.prepareStatement("Insert into watch_data values(?,?,?,?,?)")) {

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getBrandName());
			statement.setString(3, dto.getType());
			statement.setString(4, dto.getStrap());
			statement.setDouble(5, dto.getPrice());

			statement.executeUpdate();
			return true;

		} catch (SQLException e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public WatchDto findById(int id) {
		try (Connection c = DbUtils.getConnection();
				PreparedStatement statement = c.prepareStatement("Select * From watch_data where id = ?")) {
			statement.setInt(1, id);

			ResultSet set = statement.executeQuery();

			set.next();
			int ids = set.getInt(1);
			String dfg = set.getString(2);
			String type = set.getString(3);
			String strap = set.getString(4);
			double price = set.getDouble(5);

			WatchDto a = new WatchDto(ids, dfg, type, strap, price);

			return a;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<WatchDto> readAll() {
		try (Connection c = DbUtils.getConnection();
				PreparedStatement statement = c.prepareStatement("Select * From watch_data")) {

			List<WatchDto> database = new ArrayList<WatchDto>();

			ResultSet set = statement.executeQuery();
			while (set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String type = set.getString(3);
				String strap = set.getString(4);
				double price = set.getDouble(5);

				WatchDto data = new WatchDto(id, name, type, strap, price);
				database.add(data);
			}
			return database;

		} catch (SQLException e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		try (Connection c = DbUtils.getConnection();
				PreparedStatement statement = c.prepareStatement("Delete from watch_data where id = ?")) {

			statement.setInt(1, id);

			statement.executeUpdate();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public List<WatchDto> findMoreById(int... id) {
		try (Connection c = DbUtils.getConnection();
				PreparedStatement statement = c.prepareStatement("Select * From watch_data Where id = ?")) {

			List<WatchDto> database = new ArrayList<WatchDto>();

			for (int i : id) {
				statement.setInt(1, i);
				ResultSet set = statement.executeQuery();

				while (set.next()) {
					int ids = set.getInt(1);
					String name = set.getString(2);
					String type = set.getString(3);
					String strap = set.getString(4);
					double price = set.getDouble(5);

					WatchDto data = new WatchDto(ids, name, type, strap, price);
					database.add(data);
				}
			}
			if (database.isEmpty()) {
				return null;
			}
			return database;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updateStrapByPrice(String strap, double price) {
		try (Connection c = DbUtils.getConnection();
				PreparedStatement state = c.prepareStatement("Update watch_data set strap = ? Where price = ?")) {

			state.setDouble(2, price);
			state.setString(1, strap);

			if(state.executeUpdate() == 1) {
				return true;				
			} else {
				return false;
			}

		} catch (SQLException e) {
			// TODO: handle exception
		}
		return false;
	}

}
