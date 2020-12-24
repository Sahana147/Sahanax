package com.xworkz.xworkzapp.util;

import java.util.Scanner;

import com.xworkz.xworkzapp.dto.CarDTO;
import com.xworkz.xworkzapp.showroom.Showroom;

public class Showroomutil {
	public static void main(String[] args) {
		
		Showroom showroom = new Showroom(); //created to access properties and methods of main class
		
		Scanner sc = new Scanner(System.in);//scanner helps us to read the data from console 
		System.out.println("Enter the car array size");
		int size = sc.nextInt(); //sc.next helps to print at run time
		
		
		for(int i=0; i<size; i++)
		{
			CarDTO carDTO = new CarDTO();
			System.out.println("Enter the " + (i+1) + "car details :\n");
			System.out.println("enter the car name");
			String name = sc.next();
//			System.out.println("enter the value");,
//			String name1 = sc.next();
			
			System.out.println("enter the model name");
			String modelName = sc.next();
			
			System.out.println("enter the price");
			double price = sc.nextDouble();
			
			
			carDTO.setName(name);
			carDTO.setModelName(modelName);
			carDTO.setPrice(price);
			showroom.addCars(carDTO);
			
		}
	
		showroom.displayCars();
		System.out.println("enter the deleting name");
		String name = sc.next();
		showroom.deleteCarName(name);
		showroom.displayCars();
		
		
		System.out.println("enter the updated price by using car name ");
		String name1 = sc.next();
		
		System.out.println("enter the updated price");
		double price = sc.nextDouble();
		showroom.UpdatedCarPriceByName(name1, price);
		showroom.displayCars();
		
		showroom.addCarByName(name1);
			
		
		
		

		//showroom.displayCars();
		sc.close();
		
		
		}
	
		
	//memory location is stored inside array
	
	//DIFFERNCE BETWEEN HAS A RELATIONSHIP AND IS A RELATIONSHIP
	//IN ONE CLASS HAVING REFERENCE OF ANOTHER CLASS IS CALLED HAS A RELATIONSHIP
	

}
