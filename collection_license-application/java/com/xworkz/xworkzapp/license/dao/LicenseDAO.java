package com.xworkz.xworkzapp.license.dao;

import com.xworkz.xworkzapp.license.constants.VehicleType;
import com.xworkz.xworkzapp.license.dto.LicenseDTO;

public interface LicenseDAO {
	
	public void save(LicenseDTO dto);
	
	public LicenseDTO findByIdProofNo(String idProof);
	
	public boolean updateVehicleTypeByIdProofNo(String idProofNo, VehicleType type);
	
	public boolean deleteByIdProof(String idProof);


	
	
	
	

}
