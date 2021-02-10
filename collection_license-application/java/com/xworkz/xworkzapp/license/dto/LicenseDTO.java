package com.xworkz.xworkzapp.license.dto;

import com.xworkz.xworkzapp.license.constants.BloodGroup;

import com.xworkz.xworkzapp.license.constants.Gender;
import com.xworkz.xworkzapp.license.constants.IDProof;
import com.xworkz.xworkzapp.license.constants.VehicleType;

public class LicenseDTO extends CommonDTO {

	public LicenseDTO(String name, int age, AddressDTO addressDTO, DateOfBirthDTO DOB, long mobileNo,
			BloodGroup bloodGroup, Gender gender) {
		super(name, age, addressDTO, DOB, mobileNo, bloodGroup, gender);

	}

	private IDProof idProof;
	private String idProofNo;
	private VehicleType vehicleType;
	private boolean disability;
	private boolean commercial;

	public IDProof getIdProof() {
		return idProof;
	}

	public void setIDProof(IDProof idProof) {
		this.idProof = idProof;
	}

	public String getIDProofNo() {
		return idProofNo;
	}

	public void setIDProofNo(String idProofNo) {
		this.idProofNo = idProofNo;
	}

	public VehicleType getVehicletype() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public boolean getDisability() {
		return disability;
	}

	public void setDisability(boolean disability) {
		this.disability = disability;
	}

	public boolean getCommercial() {
		return commercial;
	}

	public void setCommercial(boolean commercial) {
		this.commercial = commercial;
	}

	@Override
	public String toString() {
		return "[" + idProof + ", idProofNo = " + idProofNo + ", vehicleType = " + vehicleType
				+ ", disability = " + disability + ", commercial = " + commercial + "]";

	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			System.out.println("object is null");
			return false;
		}
		if (obj instanceof LicenseDTO) {
			LicenseDTO converted = (LicenseDTO) obj;

			if (this.idProofNo != null && this.idProofNo.equals(converted.getIDProofNo())) {
				return true;
			}
		}
		return false;
	}
		
	}


