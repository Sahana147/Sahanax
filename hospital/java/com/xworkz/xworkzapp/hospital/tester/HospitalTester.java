package com.xworkz.xworkzapp.hospital.tester;

import com.xworkz.xworkzapp.hospital.dao.HospitalDAO;
import com.xworkz.xworkzapp.hospital.dao.HospitalDAOImpl;
import com.xworkz.xworkzapp.hospital.dto.HospitalDTO;

public class HospitalTester {
	
	public static void main(String[] args) {
		
		
		
		HospitalDTO dto = new HospitalDTO();
		
		dto.setName("suguna");
		dto.setAddress("bangalore");
		dto.setNoOfDoctors(40);
		dto.setNoOfWards(150);
		
		
		HospitalDAO dao = new HospitalDAOImpl();
		
		dao.save(dto);
		dao.findByAddress("bangalore");
		dao.updateByNoOfWards(100);
		dao.deleteByNoOfWards(150);
		
		
		
		
		
		
	}

}
