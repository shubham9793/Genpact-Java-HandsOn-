package com.org.gen.day1;
import java.util.*;
public class CtrlState {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Test Score");
		String Testscore = sc.nextLine();
		double marks = Double.parseDouble(Testscore);
		if(marks > 60 ) {
			System.out.println(" You are passed as an Excellent");
		}
		else if(marks == 60 ) {
			System.out.println(" You are barely passed ");
		}
		else {
			System.out.println(" try again latter ");
		}
	}
}
