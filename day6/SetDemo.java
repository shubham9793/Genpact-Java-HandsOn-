package com.org.gen.day6;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> a = new HashSet<String>();
	    a.add("x");
	    a.add("y");
	    a.add("z");
	    
	    Set<String> b = new HashSet<String>();
	    b.add("x");
	    b.add("p");
	    b.add("q");
	    
		
	   a.retainAll(b);

	   
	   System.out.println("InterSection "+a);
	   
	   
	   if(b.containsAll(a)) {
		   System.out.println("Yes it is Subset");
		   
	   }else  {
		   System.out.println("Not a Subset");
	   } 
	}

}
