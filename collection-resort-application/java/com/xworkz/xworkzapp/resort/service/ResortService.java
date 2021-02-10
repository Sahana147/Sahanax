package com.xworkz.xworkzapp.resort.service;

import java.util.List;
import com.xworkz.xworkzapp.resort.dto.ResortDTO;

public interface ResortService {


		public boolean validateAndSave(ResortDTO dto);

		public boolean validateAndupdateLocationByName(String location, String name);

		public boolean validateAndupdateLocationByNameAndRating(String location, String name, double rating);

		public boolean validateAnddeleteByNameAndLocation(String name, String location);

		public boolean validateAndaddMultipleResorts(List<ResortDTO> dtos);

		public int validatetotalResortSize();

		List<ResortDTO> validategetAll();

	}












