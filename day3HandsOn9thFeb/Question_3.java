package com.org.gen.day3HandsOn9thFeb;

/*
 * Question 3
We have to calculate the percentage of marks obtained in three subjects (each out of 100)
 by student A and in four subjects (each out of 100) by student B. Create an abstract class
  'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A'
   and 'B' each having a method with the same name which returns the percentage of the students.
    The constructor of student A takes the marks in three subjects as its parameters and the marks
     in four subjects as its parameters for student B. Create an object for eac of the two classes
      and print the percentage of marks for both the students.

 * */




abstract class Marks{
	abstract double getPercentage();
}
class Student1 extends Marks {

	double s1,s2,s3;
	public Student1(double s1, double s2, double s3) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}


	@Override
	double getPercentage() {
		// TODO Auto-generated method stub
		double sum = ((s1+s2+s3)/(double)300)*100;
		
		return sum;
	}
	
}


class Student2 extends Marks {
	double s1,s2,s3,s4;
	

	public Student2(double s1, double s2, double s3,double s4) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
	}

	@Override
	double getPercentage() {
		// TODO Auto-generated method stub
		double sum = ((s1+s2+s3+s4)/(double)400)*100;
		return sum;
	}
	
}


public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1(60.0,80.0,82.0);
		System.out.println("total % of Student1 "+s1.getPercentage());
		Student2 s2 = new Student2(60 ,80,82, 65);
		System.out.println("total % of Student1 "+s2.getPercentage());
		
	}

}
