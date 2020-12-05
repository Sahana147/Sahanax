package com.xworkz.util;

import com.xworkz.library.Library;

public class LibraryUtil {
	public static void main(String[] args) {
		
		 String[] sectionWiseAuthors = {"Gour gopal", "Jayshetty"};
		 
		 Library library = new  Library("xworkz", sectionWiseAuthors, "public");
		
		 
		 for (String string : sectionWiseAuthors) {
			 System.out.println(string);
			
			
		}
		
		 //for (int i = 0; i < sectionWiseAuthors.length; i++) {
			// System.out.println(sectionWiseAuthors[i]); 
		//}
			 
		 System.out.println(library.name + " " + library.type);
		 
		 
		 
		 
		
	}

}
