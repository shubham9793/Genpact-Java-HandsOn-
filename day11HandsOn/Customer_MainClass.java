package com.org.gen.day11HandsOn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

class Customer {
	
	// Login Methode
	boolean login(String name,int acc) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","Sahu9876@");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Bank where Cust_Accountno = '"+acc+"' and Cust_Name ='" +name+"'");
			if(rs.next()) {
				return true;
			}else {
				return false;
			}
			
		}catch(Exception e) {
			System.out.println("Exception is "+e.getMessage());
			return false;
		}
	}
	
	
	
	//Customer Info Display Method
	
	void Display_info(int acc) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","Sahu9876@");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Bank where Cust_Accountno = '"+acc+"'");
			
			if(rs.next()) {
				System.out.println("Customer Id. : "+rs.getInt(1));
				System.out.println("Account No. : "+acc);
				System.out.println("Name : "+ rs.getString(2));
				System.out.println("Avl Balance. : "+rs.getString(4));
				System.out.println("Phone No. : "+rs.getString(5));
	
			}		
		}catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
	}
	
	
	void withdraw(int acc) {
		
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","Sahu9876@");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Bank where Cust_Accountno ='"+acc+"'");
			int amt1=0;
			
			System.out.println("Enter The Amount : ");
			int amt2 = sc.nextInt();
			
			if(rs.next()) {
				amt1 = rs.getInt(4);
			}
				if(amt1-amt2 < 10000) {
					System.out.println("You cannot WithDraw");
				}else {
					 stmt.executeUpdate("update Bank set Avl_Balance='"+(amt1-amt2)+"' where Cust_Accountno ='"+acc+"'");
					 System.out.println("Money WithDrawn");
					 System.out.println("Current Avl Balance :"+(amt1-amt2));
				}
			
		}catch(Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}	
	}
	
	

	void Deposit(int acc) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","Sahu9876@");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Bank where Cust_Accountno ='"+acc+"'");
			int amt1=0;
			
			System.out.println("Enter The Amount : ");
			int amt2 = sc.nextInt();
			
			if(rs.next()) {
				amt1 = rs.getInt(4);
			}
				if(amt2 <= 0) {
					System.out.println("InVailid Amount ");
				}else {
					 stmt.executeUpdate("update Bank set Avl_Balance='"+(amt1+amt2)+"' where Cust_Accountno ='"+acc+"'");
					 System.out.println("Money WithDrawn");
					 System.out.println("Current Avl Balance :"+(amt1+amt2));
				}
			
		}catch(Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}	
	}
	
	
}



public class Customer_MainClass {
	private static String name;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Are You Customer ..??");
			System.out.println("Enter Y/N OR 1/0");
			int choice = sc.nextInt();
			int acc;
			
			switch(choice) {
			case 1:
				Customer objc = new Customer();
				System.out.print("Enter A/C # : ");
				acc = sc.nextInt();
				System.out.println("Enter Customer Name # : ");
				name = sc.next();
				boolean bb = objc.login(name, acc);
				if(bb) {
					while(choice !=4 ) {
						{
							 System.out.println("1-Display my details");    
			                  System.out.println("2-Withdraw money");  
			                  System.out.println("3-Deposit money");
			                  System.out.println("4-Exit");
			                  System.out.print("Enter your choice: ");
			                  int choice1 = sc.nextInt();
			                  switch(choice1) {
			                  case 1:
			                	  objc.Display_info(acc);
			                	  break;
			                  case 2:
			                	  objc.withdraw(acc);
			                	  break;
			                  case 3:
			                	  objc.Deposit(acc);
			                	  break;
			                  default:System.out.println("Wrong Choice");		  
			                  }
						}
					}
				}
					else {
					System.out.println("Wrong info provided by you contact  to 'Admin' ");
				} 
			}
			
		}catch(Exception e) {
			System.out.println("Main Method Exception "+e.getMessage());
		}

	}

}
