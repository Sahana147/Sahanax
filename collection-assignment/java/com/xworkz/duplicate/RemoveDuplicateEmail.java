package com.xworkz.duplicate;
import java.util.ArrayList;

import java.util.Collection;

		public class RemoveDuplicateEmail {
		public static void main(String [] args) {
			
		
		
		private static ArrayList removeDuplicates(ArrayList email) {
			ArrayList newEmail=new ArrayList();
	    	for (Object emailList : email) {
				if(!newEmail.contains(emailList)) {
					newEmail.add(emailList);
				}
	    	}
	    	return newEmail;
		}
		public static void main(String[] args) {
			
			String email1="nagashree33@gmail.com";
			String email2="nagashree98@gmail.com";
			String email3="nagashree10@gmail.com";
			String email4="nagashree30@gmail.com";
			String email5="nagashree10@gmail.com";
			String email6="nagasri@gmail.com";
			String email7="kavitha@gmail.com";
			String email8="shilpa99@gmail.com";
			String email9="vidya22@gmail.com";
			String email10="harshi56@gmail.com";
			String email11="vidya21@gmail.com";
			String email12="shweetha98@gmail.com";
			String email13="sahana12@gmail.com";
			String email14="nagashree14@gmail.com";
			String email15="shree48@gmail.com";
			String email16="nagu20@gmail.com";
			String email17="nagashree14@gmail.com";
			String email18="nagashree98@gmail.com";
			String email19="nagashree@gmail.com";
			String email20="shalini53@gmail.com";
			
			ArrayList email=new ArrayList();
			email.add(email1);
			email.add(email2);
			email.add(email3);
			email.add(email4);
			email.add(email5);
			email.add(email6);
			email.add(email7);
			email.add(email8);
			email.add(email9);
			email.add(email10);
			email.add(email11);
			email.add(email12);
			email.add(email13);
			email.add(email14);
			email.add(email15);
			email.add(email16);
			email.add(email17);
			email.add(email18);
			email.add(email19);
			email.add(email20);
			System.out.println("ArrayList with duplicates:"+email);
		
			System.out.println(email.size());
			
			ArrayList newEmail=removeDuplicates(email);
			System.out.println("ArrayList with duplicates removed:"+newEmail);
			System.out.println(newEmail.size());
		}
	

}
}

