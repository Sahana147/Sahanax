package com.xworkz.xworkzapp.celebration.tester;

import com.xworkz.xworkzapp.celebration.service.DisplayService;
import com.xworkz.xworkzapp.celebration.service.DisplayServiceImpl;

public class TesterLakshmi {
	public static void main(String[] args) {
DisplayService service=new DisplayServiceImpl();
		
		service.printString((l,t)->{//lambda expression
			System.out.println("validating: "+ l + "t "+ t);
			if(l.contains("a") || l.contains("A"))
			{
				System.out.println(l+ " "+l.hashCode());
			}
		});
		
	}

}
