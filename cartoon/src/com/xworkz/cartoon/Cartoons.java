package com.xworkz.cartoon;

import java.util.Date;

public class Cartoons {
	
	private String name;
	private String episodes;
	public Date date = new Date();
	
	
	public Cartoons()
	{
		System.out.println("Entertainment for kids");
		
	}
	
	
	
	public String getName()
	{
		return name;
	}
	
    public void setName(String name)
    {
    	this.name = name;
    }
    
    public String getEpisodes()
    {
    	return episodes;
    }
    
    public void setEpisodes(String episodes)
       {
    	
    	this.episodes = episodes;
    	
       }
    
}
