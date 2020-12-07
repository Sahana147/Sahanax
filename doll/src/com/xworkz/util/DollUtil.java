package com.xworkz.util;

import com.xworkz.doll.Doll;

public class DollUtil {
	public static void main(String[] args) {
		Doll d = new Doll();
		d.setName("barbie");
		d.setPrice(800.0);
		System.out.println(d.getName() + " " + d.getPrice());
		System.out.println(d.date);
		
	}

}
