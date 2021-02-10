package com.xworkz.xworkzapp.license.dao;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.xworkzapp.license.constants.VehicleType;                                                                   
import com.xworkz.xworkzapp.license.dto.LicenseDTO;

public class LicenseDAOImpl implements LicenseDAO {

	private List<LicenseDTO> database;

	public LicenseDAOImpl() {
		this.database = new ArrayList<LicenseDTO>();
	}

	@Override
	public void save(LicenseDTO dto) {
		System.out.println("invoked save in license dao impl");
		System.out.println("dto to save " + dto);
		boolean saved = this.database.add(dto);
		if (saved) {
			System.out.println("dto is saved");
		} 

		else {
			System.out.println("dto is not saved");
		}
	}

	@Override
	public LicenseDTO findByIdProofNo(String idProofNo) {
		System.out.println("invoked findByIDProofNo");
		System.out.println("idProof:" + idProofNo);

		for (LicenseDTO licenseDTO : this.database) {

			String idProofFromDTO = licenseDTO.getIDProofNo();
			if (idProofFromDTO.trim().equalsIgnoreCase(idProofNo)) {
				System.out.println("license found");
				return licenseDTO;
			}

		}

		return null;
	}

	@Override
	public boolean updateVehicleTypeByIdProofNo(String idProofNo, VehicleType typeOfVehicle) {
		System.out.println("invoked updateVehicletypeByIdProofNo");
		System.out.println("IdProofNo:" + idProofNo);
		System.out.println("typeOfVehicle:" + typeOfVehicle);

		LicenseDTO dtoFromDB = this.findByIdProofNo(idProofNo);
		if (dtoFromDB != null) {
			System.out.println("license found you can update");
			dtoFromDB.setVehicleType(typeOfVehicle);
			return true;
		}

		else {
			System.out.println("license not found, cannot update");
		}

		return false;

}
	
	@Override
	public boolean deleteByIdProof(String idProof) {
		System.out.println("invoked deleteByIdProofNo");
		System.out.println("idProof" + idProof);
		LicenseDTO idProofFromDB = this.findByIdProofNo(idProof);
		if(idProofFromDB != null) {
			this.database.remove(idProofFromDB);
		return true;
	}
		return false;

	}
}

