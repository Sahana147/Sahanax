package com.xworkz.util;

import com.xworkz.laptop.Laptop;

public class LaptopUtil {
	public static void main(String[] args) {
		Laptop lap = new Laptop();
		lap.setRamSize("4 GB");
		lap.setProcessor("i3 processor");
		lap.setSystemType("64 bit Os");
		 System.out.println(lap.getRamSize() + "\n" + lap.getProcessor() + "\n" + lap.getSystemType());
		
		
	}

}
