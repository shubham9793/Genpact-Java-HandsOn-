package com.org.gen.day3;


class LoanClass implements Home, Education,Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoanClass l = new LoanClass();
		l.HomeLoan();
		l.carlone();
		l.education();
	}

	@Override
	public void carlone() {
		// TODO Auto-generated method stub
		System.out.println("Car Lone");
		
		
	}

	@Override
	public void education() {
		// TODO Auto-generated method stub
		System.out.println("Educatio Lone");
		
	}

	@Override
	public void HomeLoan() {
		// TODO Auto-generated method stub
		System.out.println("Home Lone");
		
	}

}
