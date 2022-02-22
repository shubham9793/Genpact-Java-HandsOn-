package com.org.gen.day11;



import java.sql.*;
public class DataConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//step 1;
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loading.....");
			
			
			//step 2;
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","Sahu9876@");
			System.out.println("Connecting to DB.....");
			
			//step 3
			Statement stmt = con.createStatement();
			System.out.println("Excuting Quarry ");
			
			
			// step 4
			ResultSet rs = stmt.executeQuery("select * from abc");
			System.out.println("Data");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + "   "+rs.getString(2));
						

						
			}
			
			
			//step 5
			con.close();
			
		}catch(Exception e) {
			//System.out.println(e.getMessage());
		}
	}

}

