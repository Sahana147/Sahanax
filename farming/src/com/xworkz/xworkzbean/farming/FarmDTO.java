package com.xworkz.xworkzbean.farming;//working of array
//keyword  //custom package
public class FarmDTO {
	
 private String typeOfSoil;
 private String area;
 private String typeOfCrop;
 
 
// public FarmDTO(String typeOfSoil,String area,String typeOfCrop)//parameters is also another type of variables so we can say there are 4 types of variables local,static,instance,parameters
// {
//	 super(); // this super method pointing to object ie java.lang
//	 this.typeOfSoil =typeOfSoil;
//	 this.area = area;
//	 this.typeOfCrop = typeOfCrop;
//	 
// }
 
 
  public  String getTypeOfSoil()
   {
	  return typeOfSoil; 
   }
   
   public  void setTypeOfSoil(String typeOfSoil)
    {
    	this.typeOfSoil = typeOfSoil;
    }
    
   public  String getArea()
    {
    	return area;
    }
 
  public  void setArea(String area)
   {
	   this.area = area;
   }
   
   
  public String getTypeOfCrop()
   {
	   return typeOfCrop;
   }
   
  public  void setTypeOfCrop(String typeOfCrop)
   {
	   this.typeOfCrop = typeOfCrop;
   }
	

}
