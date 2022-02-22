package com.org.gen.day7HandsOn;



import java.util.Comparator;

public class DevpExpComp implements Comparator<Developer> {

	@Override
	public int compare(Developer o1, Developer o2) {
		// TODO Auto-generated method stub
		Developer d1 = o1;
		Developer d2 = o2;
		
		if(d1.devexp == d2.devexp) return 0;
		else if(d1.devexp > d2.devexp) return 1;
		else return -1;
		
	}

}
