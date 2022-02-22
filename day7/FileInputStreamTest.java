package com.org.gen.day7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		byte[] arr = new byte[100];
		
		try {	
			FileInputStream file = new FileInputStream("D:\\eclipes\\a.txt");
			System.out.println("Exist byte in my file "+file.available());
			System.out.println("Read file data");
			int i = file.read();
			System.out.println((char)i);
			
			

			file.read(arr);
			System.out.println("data read from the file");
			String data = new String(arr);
			System.out.println(data);
			
			
			file.close();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
