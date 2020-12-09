package com.xworkz.util;

import com.xworkz.industry.SteelIndustry;

public class IndustryUtil {
	public static void main(String[] args) {
	SteelIndustry industry = new SteelIndustry( "Sales","HSR layout", 456 );
		 
System.out.println(industry.area + "\n" + industry.noOfWorker + "\n" + industry.type);
	 //industry.production();
	 System.out.println(industry.production());
	}
	
	

}
