package com.org.gen.day6;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "hello";
		String s3 = "HELLO";
		String s4 = new String ("Hello");
		System.out.println(s1.compareTo(s4));
		System.out.println(" ".isBlank());
		System.out.println("xyz".isBlank());
		System.out.println(" ".isEmpty());
		
		
		System.out.println("s1-s2 "+s1.equals(s2));
		System.out.println("s1-s3 "+s1.equals(s3));
		System.out.println("s1-s4 "+s1.equals(s4));
		System.out.println("s2-s3 "+s2.equals(s3));
		System.out.println("s2-s4 "+s2.equals(s4));
		System.out.println("s3-s4 "+s3.equals(s4));
		
		System.out.println(s1.equalsIgnoreCase(s4));
		
		System.out.println(s1.length()+" "+s2.length());
		

	}

}
