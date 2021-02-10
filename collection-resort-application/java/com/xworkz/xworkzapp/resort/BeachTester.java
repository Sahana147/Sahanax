package com.xworkz.xworkzapp.resort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.xworkzapp.resort.dto.BeachDTO;

public class BeachTester {
	
public static void main(String[] args) {
		
		BeachDTO beach1=new BeachDTO("Om", 43,3);
		
		BeachDTO beach2=new BeachDTO("Maple", 43,56);
		
		
		int value=beach1.compareTo(beach2);
		if(value==0)
		{
			System.out.println("both beahce are same");
		}
		if(value>0)
		{
			System.out.println("beach1 is greater");
		}
		if(value<0)
		{
			System.out.println("beach2 is greater");
		}
		
		
		BeachDTO beach3=new BeachDTO("Marina", 70,32);
		
		BeachDTO beach4=new BeachDTO("Juhu", 7,7);
		
		List<BeachDTO> beachDTOs=new ArrayList<BeachDTO>();
		beachDTOs.add(beach1);
		beachDTOs.add(beach2);
		beachDTOs.add(beach3);
		beachDTOs.add(beach4);
		
		for (BeachDTO beachDTO : beachDTOs) {
			System.out.println(beachDTO);
		}
		
		BeachNoOfResortsComparator comparator=new BeachNoOfResortsComparator();
		Collections.sort(beachDTOs,comparator);
		
 		System.out.println("After Sorting ");
 		
 		for (BeachDTO beachDTO : beachDTOs) {
			System.out.println(beachDTO);
		}
	}

}
