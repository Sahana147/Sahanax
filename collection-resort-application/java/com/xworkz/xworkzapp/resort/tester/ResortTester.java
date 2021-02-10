package com.xworkz.xworkzapp.resort.tester;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.xworkzapp.resort.dao.ResortDAO;
import com.xworkz.xworkzapp.resort.dao.ResortDAOImpl;
import com.xworkz.xworkzapp.resort.dto.ResortDTO;
import com.xworkz.xworkzapp.resort.service.ResortService;
import com.xworkz.xworkzapp.resort.service.ResortServiceImpl;

public class ResortTester {

	public static void main(String[] args) {

		List<ResortDTO> list = new LinkedList<ResortDTO>();

		ResortDAO dao = new ResortDAOImpl(list);

		ResortService service = new ResortServiceImpl(dao);

		ResortDTO dto = new ResortDTO("Bangalore", "Royal orchid", "basavaraj", 60);

		dto.setNoOfEmployees(120);
		dto.setOffers(true);
		dto.setPhoneNo(9945665072l);
		dto.setPoolExist(true);
		dto.setPricePerHead(2350);
		dto.setRating(4.5);

//		 dao.save(dto);
//		 dao.updateLocationByName("Mysore", "Royal orchid");
//		 dao.updateLocationByNameAndRating("chikkamagalur", "sahana",4.5);
//	
//		 dao.getAll();
//		 dao.totalResortSize();
//		 dao.addMultipleResorts(list);
//		 dao.deleteByNameAndLocation("Royal orchid", "Bangalore");
//		 
		 
		 service.validateAndSave(dto);
		 service.validateAndupdateLocationByName("kanpur", "Royal orchid");
		 service.validateAndupdateLocationByNameAndRating("udupi", "Royal orchid", 4.5);
		 service.validateAndaddMultipleResorts(list);
		 service.validateAnddeleteByNameAndLocation("Royal orchid", "Bangalore");
		 service.validategetAll();
		 service.validatetotalResortSize();
		 
	}

}
