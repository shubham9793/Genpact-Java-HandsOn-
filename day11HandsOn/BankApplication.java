package com.org.gen.day11HandsOn;

import java.sql.*;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//step1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Data is loading...");
			
			//Step2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","Sahu9876@");
			System.out.println("Connecting to Bank DataBase...");
			
			//Step 3
			Statement stmt = con.createStatement();
			System.out.println("Excuting Quarry...");
			
			//Step 4
			ResultSet rs = stmt.executeQuery("select * from Bank");
			System.out.println("Fatch Data is....");
			
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"   "+ rs.getString(2)+"   "+rs.getString(3) +"   "+ rs.getString(4)+"   "+rs.getString(5));
			}
			
			con.close();
			
			
		}catch(Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
		
	}

}
