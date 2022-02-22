package com.org.gen.day7;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BuffredInputDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File name");
		String name = sc.nextLine();
		
		
		try {
			FileOutputStream f = new FileOutputStream(name,true); // true for append mode
			System.out.println("Write data into your file ");
			String str = sc.nextLine();
			byte[]b = str.getBytes();
			f.write(b);
			System.out.println("Success");
			f.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		try {
			FileInputStream f = new FileInputStream("D:\\eclipes\\a.txt");
			BufferedInputStream fs = new BufferedInputStream(f);
			
			//skip is set on the stream
			// fs.skip(190);
			
			// Mark is set on the stream
			fs.mark(10);
			  
	        System.out.println("Char : " + (char)fs.read());
	  
	        // Reset() is invoked
	        fs.reset();
	        
	     //   System.out.println("Char : " + (char)fs.read());
			
			int i = fs.read();
			while(i!=-1) {
				System.out.print((char )i);
				i = fs.read();
			}fs.close();
		} catch(Exception e) {
			
		}
		
	}

}
