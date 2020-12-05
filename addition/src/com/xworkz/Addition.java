package com.xworkz;

public class Addition {
	
	
	static int s =12;
	
	static{
	 int s1 = 234; 
	 s= 452;
	 System.out.println(Addition.s);
	 System.out.println(s1);
	}
	 
	 public static void main(String a[]) {
	 Addition add = new Addition(); //non static blocks can access using object only
	 System.out.println(add); 
	 System.out.println(Addition.s);
	  }
	  
{
		
	System.out.println("placed"); 
	//non static blocks can be accessed using objects only
}

{
	
	System.out.println("placed"); 
	//non static blocks can be accessed using objects only
}

{
	
	System.out.println("placed"); 
	//non static blocks can access using objects only
}

{
	
	System.out.println("placed"); //non static and access using object only
}

	static{ //static block or class block
		// int s = 234
		s = 24;
		System.out.println(Addition.s);
		int  p=4; //static variable changes its font;
		int  q =2;
	    int  r = p+q;
		System.out.println("hi");//static block will be print first then non static variable will print
		System.out.println(r);
		System.out.println(Addition.s);
		}
		
  static{
		int  p=134;
		int q =20;
		int r = p+q;
        System.out.println("hi");//static variable print first then non static variable will print
		System.out.println(r);
		}
}



