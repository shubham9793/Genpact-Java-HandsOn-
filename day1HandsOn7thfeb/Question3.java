package com.org.gen.day1HandsOn7thfeb;

//w a p to print the leap year ,or not a leap year when user entering the year 


import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter year");
		int year = sc.nextInt();
		
		if ((year % 4 == 0  &&  year%100 != 0) || year%400 == 0 ) {
			System.out.println(" it is a leap Year ");
		}
		
		else {
			System.out.println(" it is not a leap year  ");
		}
	}

}
