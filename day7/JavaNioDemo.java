package com.org.gen.day7;

import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaNioDemo {

	private Path path;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Path path = Paths.get("D:\\eclipes");
		
		JavaNioDemo exp = new JavaNioDemo();
		exp.creatPath();
		exp.getPathinfo();
		exp.ConvertPaths();
		
		exp.comparePaths();

	}
	private void comparePaths() {
		// TODO Auto-generated method stub
		Path path = Paths.get("D:\\eclipes\\file1.txt");
		boolean check = path.equals(path);
		System.out.println("Are these Two path are Equal "+check);
	}
	
	private void ConvertPaths() {
		// TODO Auto-generated method stub
		Path relative = Paths.get("Day4.txt");
		System.out.println("relative path "+relative);
		Path absolute = relative.toAbsolutePath();
		System.out.println("Absolute Path "+absolute);
		
		
		
	}
	
	private void getPathinfo() {
		// TODO Auto-generated method stub
		Path filename = path.getFileName();
		System.out.println("File name "+ filename);
		Path  name1 = path.getName(0);
		System.out.println("Name "+ name1);
		Path sub = path.subpath(0, 2);
		System.out.println("Sub path "+ sub);
		int p =  path.getNameCount();
		System.out.println("NameCount " +p);
		
	}
	private void creatPath() {
		// TODO Auto-generated method stub
		path = Paths.get("D:\\eclipes\\file1.txt");
		System.out.println("path created "+path.toString() );
	}

}
