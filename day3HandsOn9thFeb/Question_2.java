package com.org.gen.day3HandsOn9thFeb;


/*
 * 
 * Question 2
Create an abstract class 'Bank' with an abstract method 'getBalance'. 
$100, $150 and $200 are deposited in banks A, B and C respectively. 
'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', 
each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.

 * 
 * */


abstract class Bank {
	abstract void getBalance();
}


class BankA extends Bank{

	@Override
	void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Deposited in BankA $100");
	}
	
}

class BankB extends Bank{

	@Override
	void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Deposited in BankA $150");
	}
	
}

class BankC extends Bank{

	@Override
	void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Deposited in BankA $200");
	}
	
}
public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BankA b1 = new BankA();
		b1.getBalance();
		
		BankB b2 = new BankB();
		b2.getBalance();
		
		BankC b3 = new BankC();
		b3.getBalance();
		
	}
}

