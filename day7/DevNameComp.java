package com.org.gen.day7;

import java.util.Comparator;

public class DevNameComp implements Comparator<Developer>{

	@Override
	public int compare(Developer o1, Developer o2) {
		// TODO Auto-generated method stub
		Developer d1 = o1;
		Developer d2 = o2;	
		return d1.devName.compareTo(d2.devName);  
	}

}
