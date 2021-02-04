package com.xworkz.xworkzapp.hospital.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.xworkzapp.hospital.dto.HospitalDTO;

public class HospitalDAOImpl implements HospitalDAO {

	private List<HospitalDTO> database;

	public HospitalDAOImpl() {
		this.database = new ArrayList<HospitalDTO>();
	}

	@Override
	public void save(HospitalDTO dto) {
		System.out.println("invoked save method");
		System.out.println("dto" + dto);
		boolean saved = this.database.add(dto);
		if (saved) {
			System.out.println("dto is saved");
		}

		else {
			System.out.println("dto is not saved");
		}

	}

	@Override
	public boolean findByAddress(String address) {
		System.out.println("invoked findByAddress");
		System.out.println("invoked address");

		for (HospitalDTO hospitalDTO : database) {

			String addressFromDto = hospitalDTO.getAddress();
			if (addressFromDto != null && addressFromDto.equals(address)) {
				System.out.println("address found: " + addressFromDto);
				return true;
			} else {
				System.out.println("address not found ");
			}

		}

		return false;
	}

	@Override
	public boolean updateByNoOfWards(int noOfWards) {
		System.out.println(" invoked updateByNoOfWards");
		System.out.println("before updating the wards: " + noOfWards);
		for (HospitalDTO hospitalDTO : database) {
			int wardsFromDTO = hospitalDTO.getNoOfWards();

			if (wardsFromDTO >= 0 && wardsFromDTO < 500) {
				System.out.println("updated wards: " + wardsFromDTO);
				return true;
			}

			else {
				System.out.println(" wards doesn't match so can't update: " + wardsFromDTO);
			  return false;
			}
				}
		return false;
	}

	@Override
	public boolean deleteByNoOfWards(int noOfWards) {
		System.out.println("invoked deleteByNoOfWards");
		System.out.println("noOfWards: " +  noOfWards);
		
		Iterator<HospitalDTO> iterator = this.database.iterator();
		while(iterator.hasNext()) {
			HospitalDTO  dto =iterator.next();
			
			if(dto.getNoOfWards() == noOfWards) {
				System.out.println("size before remove: " + database.size());
				iterator.remove();
				System.out.println("size after remove: " + database.size());
			}
		}
		
		return false;
	}
}
