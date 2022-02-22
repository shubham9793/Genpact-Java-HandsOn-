package com.org.gen.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class DevloperWithMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Developer> developer = new ArrayList<>();
		developer.add(new Developer(8500581,"Shubham",5,200000));
		developer.add(new Developer(8500582,"RAj   ",5,200562));
		developer.add(new Developer(8500583,"Bablu ",6,202541));
		developer.add(new Developer(8500584,"Rahul ",3,232021));
		developer.add(new Developer(8500585,"Aryan ",4,58456));
		developer.add(new Developer(8500586,"Ram   ",2,652152));
		developer.add(new Developer(8500587,"Ganesh",01,875552));
		developer.add(new Developer(8500588,"Anuj ",10,900000));
		
		Collections.sort(developer, new DevpExpComp()); // sort According Exprence
		
		Collections.sort(developer, new DevNameComp()); // sort name alphabetical order
		
		Developer maxSal = Collections.max(developer, new DevMaxSal());
		
		
		
		System.out.println("Expr  Name   ID    Salary ");
		System.out.println();
		Iterator <Developer> it = developer.iterator();
		while(it.hasNext()) {
			Developer st = it.next();
			System.out.println(st.devexp+"   "+st.devName+"  "+st.devId+"   "+st.devSal);
		}
		
		System.out.println("max Salary is "+ maxSal.devSal);
	}

}
