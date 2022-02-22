package com.org.gen.day7HandsOn;


public class Developer {

	int devId;
	String devName;
	int devexp;
	int devSal;
	public Developer(int devId, String devName, int devexp, int devSal) {
		super();
		this.devId = devId;
		this.devName = devName;
		this.devexp = devexp;
		this.devSal = devSal;
	}
	 public int getBalance() { return devSal; }
	
	
}
