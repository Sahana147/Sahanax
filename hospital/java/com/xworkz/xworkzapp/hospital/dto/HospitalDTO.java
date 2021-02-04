package com.xworkz.xworkzapp.hospital.dto;

public class HospitalDTO {
	
	private String name;
	private String address;
	private int noOfDoctors;
	private int noOfWards;
	
     public HospitalDTO(){
		
	}

	public HospitalDTO(String name, String address, int noOfDoctors, int noOfWards) {
		super();
		this.name = name;
		this.address = address;
		this.noOfDoctors = noOfDoctors;
		this.noOfWards = noOfWards;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNoOfDoctors() {
		return noOfDoctors;
	}

	public void setNoOfDoctors(int noOfDoctors) {
		this.noOfDoctors = noOfDoctors;
	}

	public int getNoOfWards() {
		return noOfWards;
	}

	public void setNoOfWards(int noOfWards) {
		this.noOfWards = noOfWards;
	}

	@Override
	public String toString() {
		return "HospitalDTO [name=" + name + ", address=" + address + ", noOfDoctors=" + noOfDoctors + ", noOfWards="
				+ noOfWards + "]";
	}
     
     //public boolean equals()
	

	

}
