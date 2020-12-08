package com.xworkz.util;

import com.xworkz.church.Church;

public class ChurchUtil {
	public static void main(String[] args) {
		Church c = new Church("st.philomenas", "mysore", 32);
		System.out.println(c.getName()+ "\n" + c.getAddress()+ "\n" + c.getNoOfFathersAndSisters());
		
		
	}

}
