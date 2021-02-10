package com.xworkz.xworkzapp.cosmetic.validationtester;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.xworkzapp.cosmetic.constants.CosmeticType;

import com.xworkz.xworkzapp.cosmetic.constants.Shades;
import com.xworkz.xworkzapp.cosmetic.dao.CosmeticsDAO;
import com.xworkz.xworkzapp.cosmetic.dao.CosmeticsDAOImpl;
import com.xworkz.xworkzapp.cosmetic.dto.CosmeticsDTO;
import com.xworkz.xworkzapp.cosmetic.service.CosmeticService;
import com.xworkz.xworkzapp.cosmetic.service.CosmeticServiceImpl;

public class CosmeticServiceTester {
	public static void main(String[] args) {

		CosmeticsDTO cosmeticsDTO = new CosmeticsDTO();
		cosmeticsDTO.setBrand("Loreal");
		cosmeticsDTO.setCosmeticType(CosmeticType.KAJAL);
		cosmeticsDTO.setPrice(780);
		cosmeticsDTO.setQuantity(25);
		cosmeticsDTO.setShades(Shades.BLACK);

		List<CosmeticsDTO> list = new LinkedList<CosmeticsDTO>();

		CosmeticsDAO dao = new CosmeticsDAOImpl(list);
		
		CosmeticService service = new CosmeticServiceImpl(dao);

		service.validateAndSave(cosmeticsDTO);

		CosmeticsDTO cosmeticDTO2 = new CosmeticsDTO("colorbar", 850, CosmeticType.PRIMER, Shades.PINK, 88);

		service.validateAndSave(cosmeticDTO2);
		System.out.println(service.cosmeticsSize());

		service.deleteByBrand("colorbar");
		System.out.println(service.cosmeticsSize());

	}

}
