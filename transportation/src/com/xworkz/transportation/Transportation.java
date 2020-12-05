package com.xworkz.transportation;

public class Transportation {
	public String id; 
	public String name; 
	public String address[] = new String[5];  //another way of initialising array using new keyword
	public int noOfBranches;
	
	public void importAndExport() {
		System.out.println("exporting from bangalore and importing to bellery & mysore");
		}
	
	public void transport() {
		System.out.println("vacation to goa");
		
	}
	

}
