package com.org.gen.day7HandsOn;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputHandsOn__2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String data = "Hey hello hi this is File named Data 1 in drive D eclipes";
		
		byte[] arr = data.getBytes(); // converrt Stream to bytes;
		byte[] arr1 = new byte[5000];
		
		try {
			System.out.println("file Created Name Data1 in D");
			System.out.println("\n");
			// creating a file 
			FileOutputStream out = new FileOutputStream("D:\\eclipes\\data1.txt");
	         for (int i = 0; i < 10; i++) {
	             out.write(i);
	         }
			
			out.close();
			
			// reading the data from existing file 
			
			FileInputStream file = new FileInputStream("D:\\eclipes\\data1.txt");
			int i = file.read();
			System.out.println((char)i);
			String data1 = new String(arr);
			System.out.println(data1);
			file.read(arr);

			
		}catch(Exception e){
			 System.out.println("No file exist  "+e);
		}
	}

}

