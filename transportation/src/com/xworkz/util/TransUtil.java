package com.xworkz.util;

import com.xworkz.transportation.Transportation;

public class TransUtil{
	
	public static void main(String a[]) {
		
		Transportation transp = new Transportation();
		
		transp.id = "125sds";
		transp.name = "VRL";
		transp.noOfBranches = 5;
		System.out.println(transp.id + " " + transp.name + " " + transp.noOfBranches);
		
		  transp.address[0] = "Rajajinagar"; 
		  transp.address[1] = "jaynagar";
		  transp.address[2] = "vijaynagar";
		  transp.address[3] = "majestic";
		  transp.address[4] = "MG road";
		  for(int i=0; i<(transp.address).length ; i++)
		  {
			  System.out.println(transp.address[i]);
			  
		  }
		  
		  for(String address : transp.address) { // for each : we used when we have multiple data 
			    System.out.println(address);
			}
		  
		  transp.importAndExport();
		  transp.transport();
		 	
	}
	
}
















































