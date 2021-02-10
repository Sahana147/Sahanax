package com.xworkz.xworkzapp.cosmetic.dao;

import java.util.List;

import com.xworkz.xworkzapp.cosmetic.constants.CosmeticType;
import com.xworkz.xworkzapp.cosmetic.dto.CosmeticsDTO;


public interface CosmeticsDAO {
	
	public boolean save(CosmeticsDTO dto);
	public boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand);
	public boolean updatePriceByBrandAndType(double price, String brand, CosmeticType type);
	public boolean updateTypeByBrand(String brand, CosmeticType type);
	public boolean deleteByBrand(String brand);
	void deleteAll();
	public List<CosmeticsDTO> getAll();
	
	int totalSize();
	
	
	

	

}
