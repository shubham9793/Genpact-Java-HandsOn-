package com.org.gen.day7;

import java.io.BufferedReader;
import java.io.FileReader;

public class BuffrereaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] arr = new char[100];
		try {
			FileReader file = new FileReader("D:\\eclipes\\OutStream.txt");
	
			BufferedReader bb = new BufferedReader (file);
			
			
			// bb.skip(100);
			bb.read(arr);
			System.out.println("Data in the file");
			System.out.println(arr);
			bb.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
