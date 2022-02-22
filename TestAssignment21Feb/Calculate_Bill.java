package com.org.gen.TestAssignment21Feb;

import java.util.Scanner;

// Question 1

 class UserMainCode {

	public static int calculateElectricityBill(String s1,String s2,int c){
		int a = Integer.parseInt(s1.substring(5));
		int b =Integer.parseInt(s2.substring(5));
		int res=Math.abs((b-a)*c);
			return res;
		}

}


public class Calculate_Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the First Input");
		String str1=sc.nextLine(); 
		System.out.println("Enter the second Input");
		String str2=sc.nextLine(); 
		System.out.println("Enter the third Input");
		int a =sc.nextInt(); 
		System.out.println(UserMainCode.calculateElectricityBill(str1,str2, a));

	}

}





