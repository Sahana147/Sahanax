package com.xworkz.util;

import com.xworkz.car.Car;

public class Carutil {
	public static void main(String[] args) {
		
		Car car = new Car();
		car.setBrand("mercedes - benz");
		car.setColor("black");
		car.setPrice(874700);
		
		System.out.println(car.getBrand() + " "+ car.getColor() + " "+ car.getPrice());
		System.out.println(car.date);
		
		
		
		
	}

}
