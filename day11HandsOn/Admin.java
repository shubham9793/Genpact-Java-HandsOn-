package com.org.gen.day11HandsOn;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Admin {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated main block
		try{
			//step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connecting....");
			
			//step 2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","Sahu9876@");
			System.out.println("Connecting to DataBase....");
			
			System.out.println("Enter cust I'D : ");
			int id = sc.nextInt();
			
			System.out.println("Enter Account Holder's name: ");
			String name = sc.next();
			
			System.out.println("Enter Account No : ");
			int acc = sc.nextInt();
			
			System.out.println("Enter Balance : ");
			int balance=sc.nextInt();
			
			System.out.println("Enter Mobile No: ");
			int  mob = sc.nextInt();
			
			System.out.println("Entered details : "+id+"  "+name +"  "+acc+" "+balance +"  "+mob);
			
			//step 3
			PreparedStatement pr =con.prepareStatement("insert into Bank values(?,?,?,?,?)");
			pr.setInt(1, id);
			pr.setString(2, name);
			pr.setInt(3, acc);
			pr.setInt(4, balance);
			pr.setInt(5, mob);
			
			//step 4
			int data = pr.executeUpdate();
			System.out.println("record executed.."+data);
			pr=con.prepareStatement("select * from Bank");
			ResultSet rs=pr.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
			}
			con.close();
//			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("This is the Exception "+e.getMessage());
			}
		}

}