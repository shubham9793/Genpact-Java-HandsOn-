package com.org.gen.day7;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String file3 = "D:\\eclipes\\outWriter.txt";
		try {

			FileWriter out1 = new FileWriter(file3);
			
			FileWriter out2 = new FileWriter(file3, Charset.forName("UTF-8"));
			
			System.out.println("Charcter Ecncoding "+out1.getEncoding());
			System.out.println("Charcter Ecncoding "+out2.getEncoding());
			
			out1.close();
			out2.close();
		}catch(Exception e) {
			
		}
		
	}

}
