package com.xworkz.xworkzapp.cosmetic.service;

import com.xworkz.xworkzapp.cosmetic.constants.CosmeticType;

import com.xworkz.xworkzapp.cosmetic.constants.Shades;
import com.xworkz.xworkzapp.cosmetic.dao.CosmeticsDAO;
import com.xworkz.xworkzapp.cosmetic.dto.CosmeticsDTO;

public class CosmeticServiceImpl implements CosmeticService {
	
	private CosmeticsDAO cosmeticsDAO;
	// private String company;

	public CosmeticServiceImpl(CosmeticsDAO cosmeticsDAO) {
		System.out.println("Created CosmeticServiceImpl");
		this.cosmeticsDAO = cosmeticsDAO;
		// this.company=company;
	}


	@Override
	public boolean validateAndSave(CosmeticsDTO cosmeticsDTO) {
		boolean validate = false;
		if (cosmeticsDTO != null) {
			System.out.println("dto is  not null");

			String brand = cosmeticsDTO.getBrand();
			if (brand != null && !brand.isEmpty() && brand.length() >= 3 && !brand.contains(" ")) {

				System.out.println("brand is valid");
				validate = true;

			} else {
				System.out.println("brand is not valid");
				validate = false;
			}

			if (validate) {
				int quantity = cosmeticsDTO.getQuantity();
				if (quantity > 0 && quantity >= 100) {
					System.out.println("quantity is valid");
					validate = true;
				} else {
					System.out.println("quantity is invalid");
					validate = false;
				}
			}

			if (validate) {
				
				
				CosmeticType cosmeticsType = cosmeticsDTO.getCosmeticType();
				if (cosmeticsType != null) {
					System.out.println("type is valid");
					validate = true;
				} else {
					System.out.println("type is invalid");
					validate = false;
				}
			}

			if (validate) {
				Shades shades = cosmeticsDTO.getShades();
				if (shades != null) {
					System.out.println("shades is valid");
					validate = true;
				} else {
					System.out.println("shades id valid");
					validate = false;
				}
			}

			if (validate) {

				double price = cosmeticsDTO.getPrice();
				if (price > 0 && price <= 100) {
					System.out.println("price is valid");
					validate = true;
				} else {
					System.out.println("price is invalid");
					validate = false;
				}
			}

		}
		return false;
	}

	@Override
	public void deleteByBrand(String brand) {
		System.out.println("invoked deleteByBrand");
		if (brand != null && !brand.isEmpty() && !brand.contains(" ") && brand.length() >= 3) {
			System.out.println("brand is valid, can delete" + brand);
			this.cosmeticsDAO.deleteByBrand(brand);
		} else {
			System.out.println("invalid brand");
		}

		
	}

	@Override
	public int cosmeticsSize() {
		
		return 0;
	}
	
	
    
}
