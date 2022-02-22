package com.org.gen.day3;

interface CreditCard{
	void Ruppes();
	void Doller();
	void pound();
	
}

class BankAcc implements CreditCard{

	@Override
	public void Ruppes() {
		// TODO Auto-generated method stub
		System.out.println("want to pay in Rupees");
		
	}

	@Override
	public void Doller() {
		// TODO Auto-generated method stub
		System.out.println("want to pay in Doller");
	}

	@Override
	public void pound() {
		// TODO Auto-generated method stub
		System.out.println("want to pay in Pound");
	}
	
}





public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAcc b = new BankAcc();
		
	}

}
