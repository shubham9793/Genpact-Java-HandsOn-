package com.org.gen.day11;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

// prepareStatement interface it is a subinterface statement, and used for excute paramitrized query


public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//step 1;
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loading.....");
			
			
			//step 2;
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","Sahu9876@");
			System.out.println("Connecting to DB.....");
			
			
			// step 3;
			PreparedStatement pr =con.prepareStatement("Insert in abc value (?,?)");
			pr.setInt(1, 5);
			pr.setString(2, "Ram");
			
			// step 4
			System.out.println("Record Saved......");
			
		
			int data = pr.executeUpdate();
			
			System.out.println("Record Data "+ data);
			

		}catch(Exception e) {
			
		}
	}



}



	// prepare bank tabel with customer id, name, acc no., avl balance, phone no.
	//create application through that customer can see there account info and can deposit or withdraw balance 
	
	
	
	// developer should write done restrication to check there limit
		// a. customer can not withdraw balance if less than avl bal
		// b. whenever cust see update bal and deposit amount must display as to the customer
		// c. dev should enter the cust deltails at rum time at cmd line.
	
	
	
	
	
	
	
	
	