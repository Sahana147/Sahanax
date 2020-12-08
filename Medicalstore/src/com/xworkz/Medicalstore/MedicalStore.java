package com.xworkz.Medicalstore;

public class MedicalStore {
	
	private String address;
	private String name;
	private String  typeOfMedicine;
	
	public MedicalStore() {
	System.out.println("to get medicine instatly");
		}
	
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
		
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
		}
	
	public String gettypeOfMedicine() {
		return typeOfMedicine;
	}
	
	
	public void settypeOfMedicine(String typeOfMedicine) {
		this.typeOfMedicine = typeOfMedicine;
		
	}

}

	


