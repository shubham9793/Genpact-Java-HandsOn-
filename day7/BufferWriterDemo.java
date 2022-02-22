package com.org.gen.day7;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriterDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 String data = "This is the file for buffered write";
		try {
			FileWriter file = new FileWriter("D:\\eclipes\\BFWRITER.txt");
			BufferedWriter out =  new BufferedWriter(file); 
			out.write(data);
			out.flush();
			System.out.println("Data is flushed to the file");
			
			
			
			
			
			
			
			
			out.close();
		}catch(Exception e) {
			
		}
	}

}
