package com.org.gen.day7;

import java.util.Comparator;

public class AgeCompare implements Comparator<StudentCompratable>{

	@Override
	public int compare(StudentCompratable o1, StudentCompratable o2) {
		// TODO Auto-generated method stub\
		StudentCompratable s1 = o1;
		StudentCompratable s2 = o2;
		
		if(s1.age == s2.age) return 0;
		else if(s1.age >s2.age) return 1;
		else  return -1;
		
	}

}
