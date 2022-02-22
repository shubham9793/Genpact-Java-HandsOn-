package com.org.gen.day2HandsOn8thFeb;


/* 
 * Question 4
 * a) Write a statement that declares a string array initialized with the following strings:
"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
b) Write a loop that displays the contents of each element in the array that you declared.

 * 
 * */



public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" , "Saturday"};      
        
		 // Displays the contents of each element
		 for (String str : s)
		 {
		    System.out.println(str);
		 }
	}

}
