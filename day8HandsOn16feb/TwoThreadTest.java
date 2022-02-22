//package com.org.gen.day8HandsOn16feb;
//
///*public class TwoThreadTest extends Thread {
//
//	public void run() {
//		for(int i=0;i<=3;i++) {
//			System.out.println("Child Thread "+i);
//		}
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		TwoThreadTest thread1 = new TwoThreadTest();
//		TwoThreadTest thread2 = new TwoThreadTest();
//		
//		thread1.start();
//		thread2.start();
//		
//	}
//
//}
//*/
//class PrintEvenTask implements Runnable{
//	
//	  TwoThreadTest printer;
//	  int max;
//	  PrintEvenTask(TwoThreadTest printer, int max){
//	    this.printer = printer;
//	    this.max = max;
//	  }
//	  @Override
//	  public void run() {
//	    for(int i = 2; i <= max; i+=2){		
//	      printer.printEven(i);
//	    }   
//	  }
//}
//
//
//class PrintOddTask implements Runnable{
//	  TwoThreadTest printer;
//	  int max;
//	  PrintOddTask(TwoThreadTest printer, int max){
//	    this.printer = printer;
//	    this.max = max;
//	  }
//	  @Override
//	  public void run() {
//	    for(int i = 1; i <= max; i+=2){
//	      printer.printOdd(i);
//	    }   
//	  }
//}
//
//public class TwoThreadTest {
//	  boolean evenFlag = false;
//	  //Prints even numbers 
//	  public void printEven(int num){
//	    synchronized (this) {
//	      while(!evenFlag){
//	        try {
//	          wait();
//	        } catch (InterruptedException e) {
//	          System.out.println("Thread Interrupted" + e.getMessage());
//	        }
//	      }
//	      System.out.println(Thread.currentThread().getName() + " - " + num);
//	      evenFlag = false;
//	      // notify thread waiting for this object's lock
//	      notify();
//	    }
//	  }
//		
//	  //Prints odd numbers
//	  public void printOdd(int num){
//	    synchronized (this) {
//	      while(evenFlag){
//	        try {
//	          //make thread to wait
//	          wait();
//	        } catch (InterruptedException e) {
//	          System.out.println("Thread Interrupted" + e.getMessage());
//	        }
//	      }
//	      System.out.println(Thread.currentThread().getName() + " - " + num);
//	      evenFlag = true;
//	      // notify thread waiting for this object's lock
//	      notify();
//	    }
//	  }
//	  public static void main(String[] args) {
//	    TwoThreadTest printer = new TwoThreadTest();
//	    // creating two threads
//	    Thread t1 = new Thread(new PrintOddTask(printer, 10), "Odd");
//	    Thread t2 = new Thread(new PrintEvenTask(printer, 10), "Even");
//	    t1.start();
//	    t2.start();
//	  }
//	}