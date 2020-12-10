package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.ButterScotch;
import com.xworkz.xworkzapp.Chocolate;



public class IceCreamUtil {
	public static void main(String[] args) {
		
		
		ButterScotch b = new ButterScotch();
		b.setCost(45.0);
		b.setType("cup");
		System.out.println(b.getCost() + " \n" + b.getType());
		
		Chocolate c = new Chocolate();
		c.setCost(54.02);
		c.setType("cone");
		System.out.println(c.getCost() + "\n" + c.getType());
		
		
		
		
		
	}

}
