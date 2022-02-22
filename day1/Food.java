package com.org.gen.day1;

import java.util.Scanner;

public class Food {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you hungry?");
		//boolean str = true;
		boolean str = sc.nextBoolean();
		if(str == true) {
			System.out.println("eat pizza");
			System.out.println("eat sandwitch");
			System.out.println("eat burger");
		}else {
			System.out.println("Do  your homework");
		}
		
	}

}
