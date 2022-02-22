package com.org.gen.day7;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "Reading the datra from the file and writing by machine ";
		// write data into file 
		try {
			FileOutputStream out = new FileOutputStream("D:\\eclipes\\OutStream.txt");
			
			
			byte[] arr = data.getBytes(); // converrt Stream to bytes;
			
			byte[] arr1 = new byte[5000];
			out.write(arr);
			
			
			// read data from file 
			FileInputStream file = new FileInputStream("D:\\eclipes\\OutStream.txt");
			System.out.println("Exist byte in my file "+file.available());
			System.out.println("Read file data");
			int i = file.read();
			System.out.println((char)i);

			file.read(arr);
			System.out.println("data read from the file");
			String data1 = new String(arr1);
			System.out.println(data1);
					
			
			
			System.out.println("Write data from Machine");
			out.close();
		}catch(Exception e) {
			
		}
	}

}
