package com.org.gen.day1;
import java.util.Scanner;
public class UserInfo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter User's  VoterId, Name, Age,and location ");
		int Vid = sc.nextInt();
		String name = sc.next();
		int age = sc.nextInt();
		String loc = sc.next();
		
		System.out.println("User's VoterId is => "+Vid);
		System.out.println("User's VoterId is => "+name);
		System.out.println("User's VoterId is => "+age);
		System.out.println("User's VoterId is => "+loc);
	}
	
	
}