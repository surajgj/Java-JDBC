package com.jdbc.mobile.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.jdbc.mobile.config.MobileConfig;
import com.jdbc.mobile.dto.MobileDto;

public class MobileRepoImpl implements MobileRepo {

	@Override
	public String save(MobileDto dto) {
		
		
		try (Connection c = MobileConfig.getConnection();
			PreparedStatement state = c.prepareStatement("Insert into mobile_info values(?, ?, ?, ?, ?, ?)")){
			
			state.setInt(1, dto.getId());
			state.setString(2, dto.getBrand());
			state.setInt(3, dto.getStorage());
			state.setInt(4, dto.getRam());
			state.setString(5, dto.getProcessor());
			state.setInt(6, dto.getPrice());
			
			state.executeUpdate();
		
			
			return "Saved Sucessfully to Database ";
			
		} catch (SQLException e) {
			return "Something went wrong in Repository "+e.getMessage();
		}
	}

	@Override
	public String save(List<MobileDto> list) {
		
		try (Connection c = MobileConfig.getConnection();
			PreparedStatement state = c.prepareStatement("Insert into mobile_info values(?, ?, ?, ?, ?, ?)")){
			
			ListIterator<MobileDto> itr = list.listIterator();
			
			while(itr.hasNext()) {
				
				MobileDto dt = itr.next();
				
				state.setInt(1, dt.getId());
				state.setString(2, dt.getBrand());
				state.setInt(3, dt.getStorage());
				state.setInt(4, dt.getRam());
				state.setString(5, dt.getProcessor());
				state.setInt(6, dt.getPrice());
				state.executeUpdate();
			}
			
//			for(MobileDto dt : list) {
//				state.setInt(1, dt.getId());
//				state.setString(2, dt.getBrand());
//				state.setInt(3, dt.getStorage());
//				state.setInt(4, dt.getRam());
//				state.setString(5, dt.getProcessor());
//				state.setInt(6, dt.getPrice());
//				state.executeUpdate();
//			}
			return "Saved Sucessfully to Database ";
			
		} catch (SQLException e) {
			return "Something went wrong in Repository "+e.getMessage();
		}
	}

	@Override
	public List<MobileDto> readAll() {
		
		try(Connection c = MobileConfig.getConnection();
				PreparedStatement state = c.prepareStatement("select * from mobile_info")){
			
			ResultSet result = state.executeQuery();
			List<MobileDto> list = new ArrayList<MobileDto>();
			System.out.println(result.next());
			while(result.next()) {
				int id = result.getInt(1);
				String brand = result.getString(2);
				int storage = result.getInt(3);
				int ram = result.getInt(4);
				String processor = result.getString(5);
				int price = result.getInt(6);
				
				MobileDto dt = new MobileDto(id, brand, storage, ram, processor, price);
				list.add(dt);
			}
			
			return list;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}

	@Override
	public List<MobileDto> readByStorage(int storage) {
		
		try(Connection c = MobileConfig.getConnection();
				PreparedStatement state = c.prepareStatement("select * from mobile_info where storage = ?")){
						
			state.setInt(1, storage);
			
			ResultSet result = state.executeQuery();
			List<MobileDto> list = new ArrayList<MobileDto>();
		
			while(result.next()) {
				int id = result.getInt(1);
				String brand = result.getString(2);
				int rom = result.getInt(3);
				int ram = result.getInt(4);
				String processor = result.getString(5);
				int price = result.getInt(6);
				
				MobileDto dt = new MobileDto(id, brand, rom, ram, processor, price);
				list.add(dt);
			}
			if(list.isEmpty()) {
				System.out.println("List is Empty");
			}
			return list;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}

	@Override
	public String updatePriceByStorage(int price, int storage) {
		try (Connection c = MobileConfig.getConnection();
				PreparedStatement state = c.prepareStatement("update mobile_info set price = ? where storage = ?")){
				
				state.setInt(1, price);
				state.setInt(2, storage);
				
				state.executeUpdate();
			
				return "Updated Sucessfully to Database ";
				
			} catch (SQLException e) {
				return "Something went wrong in Repository "+e.getMessage();
			}
	}

	
	@Override
	public String deleteByProcessor(String processor) {
		try (Connection c = MobileConfig.getConnection();
				PreparedStatement state = c.prepareStatement("delete from mobile_info where processor = ?")){
				
				state.setString(1, processor);
				
				state.executeUpdate();
			
				return "Deleted Sucessfully to Database ";
				
			} catch (SQLException e) {
				return "Something went wrong in Repository "+e.getMessage();
			}
		
	}
}
