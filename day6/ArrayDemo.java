package com.org.gen.day6;

import java.util.ArrayList;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> animals = new ArrayList<>();
		animals.add("Dog");
		animals.add("cat");
		animals.add("Bilao");
		animals.add(1,"tiger");
		animals.add(0,"lion");
		animals.add("cat");
		System.out.println("animals "+animals);
		System.out.println("animals "+animals.contains("cat"));
	}

}





