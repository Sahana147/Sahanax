package com.xworkz.xworkzbean.monuments;

public class ArtGallery {
	public MonumentsDTO[] monumentsDTOs;
	
	public int index;
	
	public ArtGallery(int size)
	{
	  monumentsDTOs	= new MonumentsDTO[size]; //array object is created
	}
	
	public void  addMonumentsdetails(MonumentsDTO dto)
	{
		System.out.println("adding monuments details");
		monumentsDTOs[index++] = dto;
		System.out.println("added all details");
	}
	public void exhibitAllMonumentsDetails()
	{
		for(MonumentsDTO monumentsDTO : monumentsDTOs)
		{
			if(monumentsDTO != null)
			{
				System.out.println(monumentsDTO.getPlaceName() + " " + monumentsDTO.getMonumentName());
			}
			
			else
			{
				System.out.println("please monuments details");
			}
		}
	}
	
	
    
}
