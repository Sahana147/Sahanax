package com.xworkz.util;

import com.xworkz.journey.Journey;

public class Journeyutil {
	
	public static void main(String a[]) {
		
		Journey jr = new Journey();
		
		jr.vehicleName = "Ferrari";
		System.out.println(jr.vehicleName);
		
		jr.noOfVehicle = 4;
		System.out.println(jr.noOfVehicle);
		
		jr.visitingPlaces[0] = "paris";
		jr.visitingPlaces[1] = "landon";
		jr.visitingPlaces[2] = "USA";
		jr.visitingPlaces[3] = "canada";
		
		for(int i=0; i<(jr.visitingPlaces).length ; i++) {
			
			System.out.println(jr.visitingPlaces[i]);
			}
		
		jr.refreshment();
	}
}


