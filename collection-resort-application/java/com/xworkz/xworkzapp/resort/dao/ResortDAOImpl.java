package com.xworkz.xworkzapp.resort.dao;

import java.util.Iterator;

import java.util.List;
import com.xworkz.xworkzapp.resort.dto.ResortDTO;

public class ResortDAOImpl implements ResortDAO {

	private List<ResortDTO> resortList;

	public ResortDAOImpl(List<ResortDTO> resortList) {
		System.out.println("ResortDAOImpl created");
		this.resortList = resortList;// local and instance are in same name if not :
		// this.resortList = resortDTOs // local and instance var are not in same name

	}

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("invoked save");
		boolean added = this.resortList.add(dto);
		System.out.println("added: " + added);
		return added;
	}

	@Override
	public boolean updateLocationByName(String location, String name) {
		System.out.println("invoked updateLocationByName");
		System.out.println("location: " + location);
		System.out.println("name: " + name);
		for (ResortDTO resortDTO : this.resortList) {
			String nameFromDTO = resortDTO.getName();
			if (nameFromDTO.length() > 3 && nameFromDTO.length() <= 15 && nameFromDTO.equals(name)) {
				System.out.println("name found, you can update location now");
				System.out.println("before updating location: " + resortDTO.getLocation());
				resortDTO.setLocation(location);
				System.out.println("after updated location: " + resortDTO.getLocation());

			}
		}
		return false;
	}

	@Override
	public boolean updateLocationByNameAndRating(String location, String name, double rating) {
		System.out.println("invoked updateLocationByNameAndRating");
		System.out.println("location: " + location);
		System.out.println("name: " + name);
		System.out.println("rating: " + rating);
		for (ResortDTO resortDTO : this.resortList) {
			String nameFromDTO = resortDTO.getName();
			double ratingFromDTO = resortDTO.getRating();

			if (nameFromDTO != null && nameFromDTO.equals(name) && ratingFromDTO == rating)
				;
			{

				System.out.println("name and rating found, update");
				System.out.println("before updating location: " + resortDTO.getLocation());
				System.out.println("before updating name: " + resortDTO.getName());
				resortDTO.setLocation(location);
				System.out.println("after updated location: " + resortDTO.getLocation());
				System.out.println("after updated name : " + resortDTO.getName());

			}

		}

		return false;
	}

	@Override
	public int totalResortSize() {
		System.out.println("invoked totalSize(): " + resortList.size());

		return this.resortList.size();
	}

	@Override
	public List<ResortDTO> getAll() {
		System.out.println("invoked getAll(): " + this.resortList);
		return this.resortList;
	}

	@Override
	public boolean addMultipleResorts(List<ResortDTO> dtos) {
		System.out.println("invoked addMultipleResorts: " + this.resortList.addAll(dtos));
		return this.resortList.addAll(dtos);
	}

	@Override
	public boolean deleteByNameAndLocation(String name, String location) {
		System.out.println("invoked deleteByNameAndLocation");
		System.out.println("name: " + name);
		System.out.println("location: " + location);

		Iterator<ResortDTO> iterator = this.resortList.iterator();
		while (iterator.hasNext()) {
			ResortDTO dto = iterator.next();

			if (dto.getLocation().equals(location) && dto.getName().equals(name)) {
				System.out.println("size before delete: " + resortList.size());
				iterator.remove();
				System.out.println("size after delete: " + resortList.size());
			}

		}

		return false;
	}

}
