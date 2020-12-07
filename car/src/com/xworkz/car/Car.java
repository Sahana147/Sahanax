package com.xworkz.car;

import java.util.Date;

public class Car {
	private String brand;
    private String color;
	private double price;
	public Date date = new Date();
	
	public Car() {
		System.out.println("everyone's dream");
		}
	
	public Car(String brand, String color, double price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
		
	}
	
	public String getColor() {
		return color;
	}
	
	
	public void setColor(String color) {
		this.color = color;
		}
	
	public double getPrice() {
		return price;
	}
	
	
	public void setPrice(double price) {
		this.price = price;
		
	}

}
