package com.org.gen.day3HandsOn9thFeb;


/*
 * 
 * Question 5 
Given an inteface in1 which includes a method display which takes an integer as input .
interface in1
{
    void display(int p);
}
Task is to write a class testClass which implements interface in1 and has a method named display
 which takes an integer as input and total number of prime numbers between 2 and integer k
  (including it). Main function in written for you in the editor.
  
Input: 
The first line will contain an integer T (number of test cases). Each test case consists of an integer n.
Output: 
Print total number of prime numbers between 2 and the given number ( including them ).
Constraints: 
1 < = T < = 1000
2<= n <= 104
Example:
Input:
2
13
19
Output:
6
8

 * 
 * */



import java.util.Scanner;
interface In1 {
	
	void Display(int p);
}


class TestClass1 implements In1{

	@Override
	public void Display(int p) {
		// TODO Auto-generated method stub
		int ans = 1;
		int cnt = 0;
		for(int i=2;i<=p;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					cnt = 0;
					break;
				}
				else {
					cnt = 1;
				}
			}
			if(cnt == 1) {
				ans++;
			}
		}
		System.out.println(ans);
		
	}
	
}

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int k = sc.nextInt();
			TestClass1 obj = new TestClass1();
			obj.Display(k);
		}
	}

}
