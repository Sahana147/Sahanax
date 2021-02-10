package com.xworkz.xworkzapp.license.dto;

public class AddressDTO {
	
	private int doorNo;
	private String street;
	private String area;
	private int pincode;
	private String city;
	private String state;
	
	@Override
	public String toString() {
		return "AddressDTO[doorNo ="+doorNo+", street = "+street+", area ="+area+", pincode ="+pincode+", city="+city+",state = "+state+"]";
		
	}
	
	
	public AddressDTO() {
		System.out.println("address obj created");
	}


	public AddressDTO(int doorNo, String street, String area, int pincode, String city, String state) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.area = area;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
	}


	public int getDoorNo() {
		return doorNo;
	}


	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}
	
}
