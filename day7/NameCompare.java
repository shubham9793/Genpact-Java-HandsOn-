package com.org.gen.day7;

import java.util.Comparator;

public class NameCompare implements Comparator<StudentCompratable>{

	@Override
	public int compare(StudentCompratable o1, StudentCompratable o2) {
		// TODO Auto-generated method stub
		StudentCompratable s1 = o1;
		StudentCompratable s2 = o2;
		return s1.name.compareTo(s2.name);
	}

}
