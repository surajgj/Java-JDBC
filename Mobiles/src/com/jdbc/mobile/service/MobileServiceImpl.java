package com.jdbc.mobile.service;

import java.awt.Stroke;
import java.util.List;

import com.jdbc.mobile.dto.MobileDto;
import com.jdbc.mobile.repo.MobileRepo;
import com.jdbc.mobile.repo.MobileRepoImpl;

public class MobileServiceImpl implements MoobileService {

	private MobileRepo repo = new MobileRepoImpl();
	
	@Override
	public String save(MobileDto dto) {
		if(dto.getId() > 0) {
			if(dto.getBrand().length() >= 2) {
				if(dto.getRam() >= 2) {
					if(dto.getStorage() >= 64) {
						if(dto.getPrice() > 8998) {
							return repo.save(dto);
						}
					}
				}
			}
		}
		return "ID must be Non-Zero number";
	}

	@Override
	public String save(List<MobileDto> list) {
		return repo.save(list);
	}

	@Override
	public List<MobileDto> readAll() {
		return repo.readAll();
	}

	@Override
	public List<MobileDto> redByStorage(int storage) {
		if(storage >= 64) {
			return repo.readByStorage(storage);
		}
		return null;
	}

	@Override
	public String updatePriceByStorage(int price, int storage) {
		if(price > 8998) {
			if(storage >= 64) {
				return repo.updatePriceByStorage(price, storage);
			}
		}
		return null;
	}

	@Override
	public String deleteByProcessor(String processor) {
		if(processor.length() > 5) {
			return repo.deleteByProcessor(processor);
		}
		return null;
	}

}
