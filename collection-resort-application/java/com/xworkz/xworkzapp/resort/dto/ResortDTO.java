package com.xworkz.xworkzapp.resort.dto;



public class ResortDTO {
	
	private String location;
	private String name;
	private double pricePerHead;
	private double rating;
	private long phoneNo;
	private boolean offers;
	private String managerName;
	private int noOfEmployees;
	private boolean poolExist;
	private int noOfRooms;
	
	public ResortDTO(){
		
	}
	
	public ResortDTO(String location, String name, String managerName, int noOfRooms) {
		super();
		this.location = location;
		this.name = name;
		this.managerName = managerName;
		this.noOfRooms = noOfRooms;
	}
	
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location= location;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPricePerHead() {
		return pricePerHead;
	}


	public void setPricePerHead(double pricePerHead) {
		this.pricePerHead = pricePerHead;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	public long getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}


	public boolean isOffers() {
		return offers;
	}


	public void setOffers(boolean offers) {
		this.offers = offers;
	}


	public String getManagerName() {
		return managerName;
	}


	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}


	public int getNoOfEmployees() {
		return noOfEmployees;
	}


	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}


	public boolean getPoolExist() {
		return poolExist;
	}


	public void setPoolExist(boolean poolExist) {
		this.poolExist = poolExist;
	}


	public int getNoOfRooms() {
		return noOfRooms;
	}


	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}


	@Override
	public String toString() {
		return "ResortDTO [location=" + location + ", name=" + name + ", pricePerHead=" + pricePerHead + ", rating="
				+ rating + ", phoneNo=" + phoneNo + ", offers=" + offers + ", managerName=" + managerName
				+ ", noOfEmployees=" + noOfEmployees + ", poolExist=" + poolExist + ", noOfRooms=" + noOfRooms + "]";
	}
	
	
	
	@Override
	
	public boolean equals(Object obj) {
		if(obj == null) {
			System.out.println("obj is null");
		return false;
		}
		if(obj instanceof ResortDTO) {
			ResortDTO casting = (ResortDTO) obj;
			if(this.location != null && this.location.equals(casting.getLocation())) {
				System.out.println("location is not null");
				return true;
			}
		
		}
		return false;
	}
	
}



			
	


	
      
	
	














	
