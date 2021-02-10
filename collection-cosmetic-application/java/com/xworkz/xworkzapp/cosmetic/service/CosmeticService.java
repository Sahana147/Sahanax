package com.xworkz.xworkzapp.cosmetic.service;

import com.xworkz.xworkzapp.cosmetic.dto.CosmeticsDTO;

public interface CosmeticService {

	public boolean validateAndSave(CosmeticsDTO cosmeticsDTO);

	void deleteByBrand(String brand);

	int cosmeticsSize();

}
