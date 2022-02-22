package com.org.gen.day6;

import java.util.Arrays;
import java.util.List;

public class EmailSearch {
	
//	private boolean isValid(String Email) {
//		List<String> vE = Arrays.asList("gmail.com","genpact.com","outlook.com");
//		
//		if(vE.contains(Email.substring(Email.indexOf("@")+1))) {
//			return true;
//		}
//		return false;
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		EmailSearch c1 = new EmailSearch();
//		System.out.println(c1.isValid("xyz@genpact.com"));
//		
//		System.out.println(c1.isValid("xyz@abc.com"));
//
//	}
	
	
	public static void main(String []args) {
		String Email = "shubham.sahoo@gmail.com";
		if(Email.endsWith("@gnpact.com")) {
			System.out.println("It is true");
		}
		else {
			System.out.println("It is false");
		}
	}
}
