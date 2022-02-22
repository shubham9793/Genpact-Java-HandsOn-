package com.org.gen.day7;

import java.util.Comparator;

public class MarksCompare implements Comparator<StudentCompratable>{

	@Override
	public int compare(StudentCompratable o1, StudentCompratable o2) {
		// TODO Auto-generated method stub
		StudentCompratable s1 = o1;
		StudentCompratable s2 = o2;
		
		if(s1.marks == s2.marks) return 0;
		else if(s1.marks > s2.marks) return 1;
		else return -1;
	}
	

}
