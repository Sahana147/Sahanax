package com.xworkz.xworkzbean.util;

import java.util.Scanner;

import com.xworkz.xworkzbean.monuments.ArtGallery;
import com.xworkz.xworkzbean.monuments.MonumentsDTO;

public class MonumentsDTOutil {
	public static void main(String[] args) {
		ArtGallery art = new ArtGallery(2);//created 2 object 1 is for mainclass & sub class
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number of visited monuments");
		int size = sc.nextInt(); //to display at run time we use sc.next
		
		for(int i=0; i<size; i++) 
		{
		  MonumentsDTO dto = new MonumentsDTO();
		  
		  System.out.println("enter the " +(i+1) + " monument details");
		  
		  System.out.println("enter the place name");
		  String placeName = sc.next();
		  
		  System.out.println("enter the monument name");
		  String monumentName = sc.next();//sc.intnext(), sc.charnext(),sc.doublenext();
		  
		  dto.setMonumentName(monumentName);
		  dto.setPlaceName(placeName);
		  
		  art.addMonumentsdetails(dto);
		 
		  }
		 sc.close();
		art.exhibitAllMonumentsDetails();
		
	}

}
