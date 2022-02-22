package com.org.gen.day4;



interface my_interface{
	   static void static_fun(){
	      System.out.println("In the newly created static method");
	   }
	   void method_override(String str);
	}

	public class MainClass1 implements my_interface{
		
	   public static void main(String[] args){
		   
		   
		   MainClass1 demo = new MainClass1();
		   
	      my_interface.static_fun();
	      
	      demo.method_override("In the override method");
	   }
	   @Override
	   public void method_override(String str){
	      System.out.println(str);
	   }
	}