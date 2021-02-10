package com.xworkz.xworkzapp.license.license_tester;

import com.xworkz.xworkzapp.license.constants.BloodGroup;

import com.xworkz.xworkzapp.license.constants.Gender;
import com.xworkz.xworkzapp.license.constants.IDProof;
import com.xworkz.xworkzapp.license.constants.VehicleType;
import com.xworkz.xworkzapp.license.dao.LicenseDAO;
import com.xworkz.xworkzapp.license.dao.LicenseDAOImpl;
import com.xworkz.xworkzapp.license.dto.AddressDTO;
import com.xworkz.xworkzapp.license.dto.DateOfBirthDTO;
import com.xworkz.xworkzapp.license.dto.LicenseDTO;

public class LicenseTester {
	public static void main(String[] args) {

		AddressDTO addressDTO = new AddressDTO(497, "janathanagar", "TK layout", 570009, "Mysore", "Karnataka");
		System.out.println(addressDTO);

		DateOfBirthDTO dob = new DateOfBirthDTO(14, "july", 1999);
		System.out.println(dob);

		LicenseDTO dto = new LicenseDTO("sahana", 21, addressDTO, dob, 7349336652l, BloodGroup.B_POSITIVE,
				Gender.FEMALE);
		dto.setIDProof(IDProof.AADHAAR);
		dto.setIDProofNo("7845 2125 5678");
		dto.setVehicleType(VehicleType.TWO_WHEELER);
		dto.setDisability(false);
		dto.setCommercial(false);

		LicenseDAO dao = new LicenseDAOImpl();
		dao.save(dto); // DAO

		// CRUD

		LicenseDTO dtoFound = dao.findByIdProofNo("7845 2125 5678");
		System.out.println(dtoFound);

		boolean updatedVehicle = dao.updateVehicleTypeByIdProofNo("7845 2125 5678", VehicleType.TWO_WHEELER);
		System.out.println("updatedVehicle:" + updatedVehicle);

		LicenseDTO updatedVehicleType = dao.findByIdProofNo("1223 4556 1223");
		System.out.println("updatedVehicleType"+ updatedVehicleType);
		
		
		
//		LicenseDTO deletedIdProof = dao.deleteByIdProof(IDProof.AADHAAR);
//        System.out.println(deletedIdProof);
	}

}
