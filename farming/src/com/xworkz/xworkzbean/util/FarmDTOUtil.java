package com.xworkz.xworkzbean.util;

import java.util.Scanner;

import com.xworkz.xworkzbean.farming.FarmDTO;
import com.xworkz.xworkzbean.farming.Operation;

public class FarmDTOUtil {
	public static void main(String[] args) {

//		FarmDTO farm1 = new FarmDTO("Black soil", "67 acre", "peanuts");//hardcoding the data
//		FarmDTO farm2 = new FarmDTO("Red soil", "100 acre", "cotton");

		// Operation operation1 = new Operation(2);//size start with 1 and index start with 0
		// with 0;
		// two object
		// operation.addFarmDetails(farm);
//		operation.addFarmDetails(farm2);

		Scanner sc = new Scanner(System.in);//scanner helps us to  read the data from the console
		System.out.println("enter the farm size");
		int size = sc.nextInt();//to dispaly at run time we use sc.next
		
		Operation operation = new Operation(2);
		
		for (int i = 0; i < size; i++) {
			FarmDTO dto = new FarmDTO();
			System.out.println("Enter the " + (i + 1) + " Farm details");
			System.out.println("Enter the the type of soil");
			String typeOfSoil = sc.next();

			System.out.println("Enter the area");
			String area = sc.next();

			System.out.println("Enter the type of crop");
			String typeOfCrop = sc.next();

			dto.setTypeOfSoil(typeOfSoil);
			dto.setArea(area);
			dto.setTypeOfCrop(typeOfCrop);
			 
			operation.addFarmDetails(dto); //dto is called passing by value or refernce

		}
		sc.close();
		operation.showAllFarmDetails();
		operation.accessingValuebyCrop();
		
		
		/*
		 * System.out.println("enter type of crop"); String typeCrop = sc.next();
		 */
	}

}




//note: hospital-patient - one to many relationship
//   bulb-filament - one to one relationship;
// pen-refill - one to one; 