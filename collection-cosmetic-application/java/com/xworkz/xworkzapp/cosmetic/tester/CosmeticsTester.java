package com.xworkz.xworkzapp.cosmetic.tester;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.xworkzapp.cosmetic.constants.CosmeticType;

import com.xworkz.xworkzapp.cosmetic.constants.Shades;
import com.xworkz.xworkzapp.cosmetic.dao.CosmeticsDAO;
import com.xworkz.xworkzapp.cosmetic.dao.CosmeticsDAOImpl;
import com.xworkz.xworkzapp.cosmetic.dto.CosmeticsDTO;
import com.xworkz.xworkzapp.cosmetic.service.CosmeticService;
import com.xworkz.xworkzapp.cosmetic.service.CosmeticServiceImpl;

public class CosmeticsTester {

	public static void main(String[] args) {

		
		List<CosmeticsDTO> list = new LinkedList<CosmeticsDTO>();
		CosmeticsDAO dao = new CosmeticsDAOImpl(list);
		CosmeticService service = new CosmeticServiceImpl(dao);
		
		CosmeticsDTO dto = new CosmeticsDTO("maybelline", 784, CosmeticType.PRIMER, Shades.PINK, 50);

		
		dao.save(dto);
		// dao.updatePriceAndQuantityByBrand(1256, 45, "maybelline");
		// dao.deleteByBrand("maybelline");
		// dao.updatePriceByBrandAndType(999, "maybelline", CosmeticType.TONER);
		//dao.updateTypeByBrand("maybelline", CosmeticType.KAJAL);
		//dao.deleteAll();
		dao.getAll();
		//dao.totalSize();

	}

}
