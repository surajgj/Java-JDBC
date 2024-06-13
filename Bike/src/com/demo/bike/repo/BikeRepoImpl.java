package com.demo.bike.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.demo.bike.config.ConfigClass;
import com.demo.bike.dto.BikeDto;

public class BikeRepoImpl implements BikeRepo {

	@Override
	public boolean save(BikeDto dto) {
		try {
			Connection con = ConfigClass.getConnection();
			if (con != null) {
				PreparedStatement state = con.prepareStatement("Insert Into bike_info values(?, ?, ?, ?, ?)");

				state.setInt(1, dto.getId());
				state.setString(2, dto.getBrand());
				state.setInt(3, dto.getCc());
				state.setInt(4, dto.getTopSpeed());
				state.setInt(5, dto.getPrice());

				state.executeUpdate();
				return true;
			}
			System.out.println("Connection is null");
			return false;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public List<BikeDto> readAll() {
		try {
			Connection con = ConfigClass.getConnection();
			if (con != null) {
				PreparedStatement state = con.prepareStatement("Select * from bike_info");

				ResultSet result = state.executeQuery();
				List<BikeDto> list = new ArrayList<BikeDto>();

				while (result.next()) {
					int id = result.getInt(1);
					String name = result.getString(2);
					int cc = result.getInt(3);
					int speed = result.getInt(4);
					int price = result.getInt(5);

					BikeDto dt = new BikeDto(id, name, cc, speed, price);
					list.add(dt);
				}

				return list;
			}
			System.out.println("Connection is null");
			return null;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public boolean saveAll(BikeDto[] arr) {
		try {
			Connection con = ConfigClass.getConnection();
			if (con != null) {
				PreparedStatement state = con.prepareStatement("Insert Into bike_info values(?, ?, ?, ?, ?)");

				for (BikeDto dto : arr) {
					state.setInt(1, dto.getId());
					state.setString(2, dto.getBrand());
					state.setInt(3, dto.getCc());
					state.setInt(4, dto.getTopSpeed());
					state.setInt(5, dto.getPrice());

					state.executeUpdate();
				}
				return true;
			}
			System.out.println("Connection is null");
			return false;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public List<BikeDto> findByPrice(int price) {
		try {
			Connection con = ConfigClass.getConnection();
			if (con != null) {
				PreparedStatement state = con.prepareStatement("Select * from bike_info where price <= ?");

				state.setInt(1, price);

				ResultSet result = state.executeQuery();
				List<BikeDto> list = new ArrayList<BikeDto>();

				while (result.next()) {
					int id = result.getInt(1);
					String name = result.getString(2);
					int cc = result.getInt(3);
					int speed = result.getInt(4);
					int pricee = result.getInt(5);

					BikeDto dt = new BikeDto(id, name, cc, speed, pricee);
					list.add(dt);
				}

				return list;
			}
			System.out.println("Connection is null");
			return null;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public boolean updateSpeedAndPriceByCC(int speed, int price, int cc) {
		try {
			Connection con = ConfigClass.getConnection();
			if (con != null) {
				PreparedStatement state = con.prepareStatement("update bike_info set topSpeed=?, price=? where cc=?");

				state.setInt(1, speed);
				state.setInt(2, price);
				state.setInt(3, cc);
				
				if (state.executeUpdate() >  0) {
					return true;
				} else
					System.out.println("Given Dto Doesn't exist");

				return false;

			}
			System.out.println("Connection is null");
			return false;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public boolean deleteByNameAndCCAndPrice(String name, int cc, int price) {
		try {
			Connection con = ConfigClass.getConnection();
			if (con != null) {
				PreparedStatement state = con.prepareStatement("delete from bike_info where brand = ? and cc = ? and price=? ");

				state.setString(1, name);
				state.setInt(2, cc);
				state.setInt(3, price);
				if (state.executeUpdate() >  0) {
					System.out.println("Matching "+name+", "+cc+"cc and rs= "+price+" is Deleted from database");
					return true;
				} else
					{System.out.println("Given Properties are Doesn't Match any Existing data");}

				return false;

			}
			System.out.println("Connection is null");
			return false;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

}
