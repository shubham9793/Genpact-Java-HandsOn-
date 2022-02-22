package com.org.gen.TestAssignment21Feb;

import java.util.Scanner;




public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
        String s1 = sc.next();
        boolean b = colorCodeValidation(s1);
        if (b == true)
            System.out.println("Valid");
        else
            System.out.println("Invalid");

	}


	public static boolean colorCodeValidation(String str1) {
	    boolean flag = false, b1 = false;
	    String str2 = str1.substring(1, str1.length());
	    if (str1.length() == 7)
	        if (str1.charAt(0) == '#')
	        b1 = true;
	    if (b1 == true)
	        for (int i = 0; i < str2.length(); i++) {
	        char c = str2.charAt(i);
	        if (c != '#') {
	            if (str2.matches("[A-Fa-f0-9]{6}|[A-Fa-f0-9]{3}"))
	                flag = true;
	            else {
	                flag = false;
	                break;
	            }
	        }
	    }
	    return flag;
	}
}


