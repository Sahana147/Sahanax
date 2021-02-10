package com.xworkz.xworkzapp.resort.dao;

import java.util.List;

import com.xworkz.xworkzapp.resort.dto.ResortDTO;

    public interface ResortDAO {

	public boolean save(ResortDTO dto);

	public boolean updateLocationByName(String location, String name);

	public boolean updateLocationByNameAndRating(String location, String name, double rating);

	public boolean deleteByNameAndLocation(String name, String location);

	public boolean addMultipleResorts(List<ResortDTO> dtos);

	public int totalResortSize();

	List<ResortDTO> getAll();

}
