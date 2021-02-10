package com.xworkz.xworkzapp.cosmetic.dao;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.xworkz.xworkzapp.cosmetic.constants.CosmeticType;
import com.xworkz.xworkzapp.cosmetic.dto.CosmeticsDTO;

public class CosmeticsDAOImpl implements CosmeticsDAO {

	private List<CosmeticsDTO> cosmetics;

	
	
	public CosmeticsDAOImpl(List<CosmeticsDTO> list) {
		this.cosmetics = list;
		System.out.println("created CosmeticsDAOImpl");
	}

	@Override
	public boolean save(CosmeticsDTO dto) {
		System.out.println("invoked save");
		boolean contain = this.cosmetics.contains(dto);
		if (!contain) {
			this.cosmetics.add(dto);
			System.out.println("cosmetic added");
			return true;
		} else {
			System.out.println("cosmetic is already there");

		}
		return false;

	}

	@Override
	public boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand) {
		System.out.println("updatePriceAndQuantityByBrand");
		System.out.println("price: " + price);
		System.out.println("quantity: " + quantity);
		System.out.println("brand: " + brand);
		for (CosmeticsDTO cosmeticsDTO : this.cosmetics) {
			String brandFromDTO = cosmeticsDTO.getBrand();
			if (brandFromDTO != null && brandFromDTO.equals(brand)) {
				System.out.println("Brand found, can update");
				System.out.println("before updating price: " + cosmeticsDTO.getPrice());
				System.out.println("before updating quantity: " + cosmeticsDTO.getQuantity());
				cosmeticsDTO.setPrice(price);
				cosmeticsDTO.setQuantity(quantity);
				System.out.println("after updated price: " + cosmeticsDTO.getPrice());
				System.out.println("after updated quantity: " + cosmeticsDTO.getQuantity());
				return true;
			} else {
				System.out.println("brand not found");
			}
		}

		return false;
	}

	@Override
	public boolean updatePriceByBrandAndType(double price, String brand, CosmeticType type) {
		System.out.println("invoked updatePriceByBrandAndType");
		System.out.println("price: " + price);
		System.out.println("brand: " + brand);
		System.out.println("type: " + type);
		for (CosmeticsDTO cosmeticsDTO : this.cosmetics) {
			String brandFromDTO = cosmeticsDTO.getBrand();
			CosmeticType typeFromDTO = cosmeticsDTO.getCosmeticType();
			if (brandFromDTO != null && brandFromDTO.equals(brand)) {
				if (typeFromDTO != null && typeFromDTO.equals(type)) {
					System.out.println("brand&type found, can update");
					System.out.println("before updating price: " + cosmeticsDTO.getPrice());
					cosmeticsDTO.setPrice(price);
					System.out.println("after updated price: " + cosmeticsDTO.getPrice());

				}
			}
		}

		return false;
	}

	@Override
	public boolean updateTypeByBrand(String brand, CosmeticType type) {
		System.out.println("invoked updateTypeByBrand");
		System.out.println("brand: " + brand);
		System.out.println("type: " + type);
		for (CosmeticsDTO cosmeticsDTO : this.cosmetics) {
			String brandFromDTO = cosmeticsDTO.getBrand();
			if (brandFromDTO != null && brandFromDTO.equals(brand)) {
				System.out.println("brand found,can update");
				System.out.println("before updating type: " + cosmeticsDTO.getCosmeticType());
				cosmeticsDTO.setCosmeticType(CosmeticType.EYELINER);
				System.out.println("after updated type: " + cosmeticsDTO.getCosmeticType());
			}
		}

		return false;
	}

	@Override
	public boolean deleteByBrand(String brand) {
		System.out.println("invoked deleteByBrand");
		Iterator<CosmeticsDTO> iterator = this.cosmetics.iterator();
		while (iterator.hasNext()) {
			CosmeticsDTO dto = iterator.next();
			if (dto.getBrand().equals(brand)) {
				System.out.println("size before delete: " + cosmetics.size());
			    iterator.remove();
				System.out.println("size after delete: " + cosmetics.size());
			}
		}

		return false;
	}

	@Override
	public void deleteAll() {
		System.out.println("invoked deleteAll()");
		cosmetics.clear();
	}

	@Override
	public List<CosmeticsDTO> getAll() {
		System.out.println("invoked getAll()" + this.cosmetics);

		return this.cosmetics;
	}

	@Override
	public int totalSize() {
		System.out.println("invoked totalSize()");
		return this.cosmetics.size();
	}

}
