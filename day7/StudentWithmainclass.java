package com.org.gen.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentWithmainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StudentCompratable> student = new ArrayList<>();
		student.add(new StudentCompratable("shubham",123,300,12));
		student.add(new StudentCompratable("amit",253,500,52));
		student.add(new StudentCompratable("Akash",150,352,32));
		student.add(new StudentCompratable("ashok",140,422,30));
		student.add(new StudentCompratable("billo",190,342,25));
		
		student.add(new StudentCompratable("kallu",156,389,36));
		
		Collections.sort(student,new MarksCompare());
		Collections.sort(student,new AgeCompare());
		Collections.sort(student,new NameCompare());
		
		Iterator <StudentCompratable> it = student.iterator();
		while(it.hasNext()) {
			StudentCompratable st = it.next();
			System.out.println(st.roll+" "+st.name+" "+st.age+" "+st.marks);
		}
		
	}

}
