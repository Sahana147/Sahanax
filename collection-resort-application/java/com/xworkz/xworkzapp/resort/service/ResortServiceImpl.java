package com.xworkz.xworkzapp.resort.service;

import java.util.List;
import com.xworkz.xworkzapp.resort.dao.ResortDAO;
import com.xworkz.xworkzapp.resort.dto.ResortDTO;

public class ResortServiceImpl implements ResortService {

	private ResortDAO resortDAO;

	String specialChar = "^[^<>'\"/;%]*$";

	public ResortServiceImpl(ResortDAO resortDAO) {
		System.out.println("ResortServiceImpl created");
		this.resortDAO = resortDAO;
	}

	// Dandeli.contains("^[<>'\"/;%]*$");

	@Override
	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("invoked validateAndSave");
		System.out.println("arg1 " + dto);
		boolean valid = false;
		if (dto != null) {
			System.out.println("dto is not null, can save fields");
			String location = dto.getLocation();
			if (location != null && location.length() >= 3 && location.length() <= 15 && !location.isEmpty()
					&& !location.contains(" ") && !location.contains(specialChar)) {
				System.out.println("location is valid");
				valid = true;
			}

		} else {
			System.out.println("location is invalid");
			valid = false;
		}

		if (valid) {
			String name = dto.getName();
			if (name != null && name.length() >= 3 && name.length() <= 15 && !name.isEmpty() && !name.contains(" ")) {
				System.out.println("name is valid");
				valid = true;
			} else {
				System.out.println("name is invalid");
				return false;
			}

			if (valid) {
				double pricePerHead = dto.getPricePerHead();
				if (pricePerHead >= 999 && pricePerHead <= 2500) {
					System.out.println("pricePerHead is valid");
					valid = true;

				} else {
					System.out.println("pricePerHead is invalid");
					valid = false;
				}
			}

			if (valid) {
				double rating = dto.getRating();
				if (rating >= 0 && rating <= 5) {
					System.out.println("rating is valid ");
					valid = true;
				} else {
					System.out.println("rating is invalid");
					valid = false;
				}

			}

			if (valid) {
				long phoneNo = dto.getPhoneNo();
				int count = 0;
				while (phoneNo > 0) {
					phoneNo = phoneNo / 10;
					count++;
				}

				if (count == 10) {
					System.out.println("phone num is valid");
					valid = true;
				}

				else {
					System.out.println("phone num is invalid ");
					valid = false;
				}

			}

			if (valid) {
				String managerName = dto.getManagerName();
				if (managerName != null && managerName.length() >= 3 && managerName.length() <= 15) {
					System.out.println("managerName is valid");
					valid = true;
				} else {
					System.out.println("managerName is invalid");
					valid = false;
				}
			}

			if (valid) {
				int noOfEmployees = dto.getNoOfEmployees();
				if (noOfEmployees >= 5 && noOfEmployees <= 25) {
					System.out.println("noOfEmployees is valid");
					valid = true;
				}

				else {
					System.out.println("noOfEmployees is invalid");
					valid = false;
				}
			}

			if (valid) {
				boolean poolExist = dto.getPoolExist();
				if (poolExist == false) {
					System.out.println("poolexist is always false");
					valid = true;
				} else {
					System.out.println("poolExist is invalid");
					valid = false;
				}
			}

			if (valid) {
				System.out.println("All data is valid");
				this.resortDAO.save(dto);
			}
		}

		else {
			System.out.println("dto is null cann't save fields");
		}

		return false;

	}

	@Override
	public boolean validateAndupdateLocationByName(String location, String name) {
		System.out.println("invoked validateAndupdateLocationByName");
		System.out.println("location: " + location);
		System.out.println("name: " + name);
		if (name != null && name.length() >= 3 && name.length() <= 15 && !name.isEmpty() && !name.contains(" ")
				&& location != null && location.length() >= 3 && location.length() <= 15 && !location.isEmpty()
				&& !location.contains(" ") && !location.contains(specialChar)) {

			this.resortDAO.updateLocationByName(location, name);
			return true;

		}

		
		return false;
	}

	@Override
	public boolean validateAndupdateLocationByNameAndRating(String location, String name, double rating) {
		System.out.println(" invoked validateAndupdateLocationByNameAndRating");
		if (name != null && name.length() >= 3 && name.length() <= 15 && !name.isEmpty() && !name.contains(" ")
				&& location != null && location.length() >= 3 && location.length() <= 15 && !location.isEmpty()
				&& !location.contains(" ") && !location.contains(specialChar) && rating >= 0 && rating <= 5) {
			this.resortDAO.updateLocationByNameAndRating(location, name, rating);
			return true;
		}
		return false;
	}

	@Override
	public boolean validateAnddeleteByNameAndLocation(String name, String location) {
		System.out.println(" invoked validateAnddeleteByNameAndLocation");
		if (name != null && name.length() >= 3 && name.length() <= 15 && !name.isEmpty() && !name.contains(" ")
				&& location != null && location.length() >= 3 && location.length() <= 15 && !location.isEmpty()
				&& !location.contains(" ") && !location.contains(specialChar)) {
			this.resortDAO.deleteByNameAndLocation(name, location);
			return true;
		}
		return false;
	}

	@Override
	public boolean validateAndaddMultipleResorts(List<ResortDTO> dtos) {

		return this.resortDAO.addMultipleResorts(dtos);
	}

	@Override
	public int validatetotalResortSize() {

		return this.resortDAO.totalResortSize();
	}

	@Override
	public List<ResortDTO> validategetAll() {

		return this.resortDAO.getAll();
	}

}
