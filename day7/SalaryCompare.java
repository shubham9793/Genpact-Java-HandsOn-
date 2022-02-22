package com.org.gen.day7;

import java.util.Comparator;

public class SalaryCompare implements Comparator<Developer> {

	@Override
	public int compare(Developer o1, Developer o2) {
		// TODO Auto-generated method stub
		Developer d1 = o1;
		Developer d2 = o2;
		
		if(d1.devSal == d2.devSal) return 0;
		else if(d1.devSal > d2.devSal) return 1;
		else return -1;
	}

}
