package com.xworkz.xworkzapp.hospital.dao;

import com.xworkz.xworkzapp.hospital.dto.HospitalDTO;

public interface HospitalDAO {
	
	public void save(HospitalDTO dto);
	
    public boolean findByAddress(String address);
    
    public boolean updateByNoOfWards(int noOfWards);
    
    public boolean deleteByNoOfWards(int noOfWards);
    
}
