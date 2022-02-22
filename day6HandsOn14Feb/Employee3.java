package com.org.gen.day6HandsOn14Feb;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Employee {
    int id,expyear;
	String name,skill;
	float salary;
	
	public Employee(int id, int expyear, String name, String skill, float salary) {
		super();
		this.id = id;
		this.expyear = expyear;
		this.name = name;
		this.skill = skill;
		this.salary = salary;
	}

}

class NewEmployee {
     // TODO Auto-generated method stub
	int id,expyear;
	String name,skill;
	float salary;
	
   public NewEmployee(int id, int expyear, String name, String skill, float salary) {
		super();
		this.id = id;
		this.expyear = expyear;
		this.name = name;
		this.skill = skill;
		this.salary = salary;
	}
}
public class Employee3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> hs = new HashSet<>();
		Set<NewEmployee> hs1 = new HashSet<>();
		
		Employee obj = new Employee(1, 1, "Kapil", "DB", 562365);
		Employee obj1 = new Employee(2, 5, "Ashok", "Java", 5544522);
		NewEmployee obj3 = new NewEmployee(106, 5, "Shubham", "Java", 54545445);
		
		hs.add(obj);
		hs.add(obj1);
		hs1.add(obj3);
		
		
		System.out.println("Total Employee : " + (hs.size() + hs1.size()));
		
		Iterator hsItr = hs.iterator();
		while(hsItr.hasNext()){
			Employee emp = (Employee) hsItr.next();
		 
			System.out.println(" id : "+emp.id +" expyear : "+ emp.expyear+"  name : "+ emp.name  +" Skill : "+emp.skill+ "  salary :  "+ emp.salary);
			if(emp.id == 106){
				System.out.println(emp.id+"  is working ");
			}
			if(emp.name.equalsIgnoreCase("Kapil")){
				System.out.println(emp.name +" is working ");
			}
			if(emp.expyear<4){
				hsItr.remove();
			}
			if(emp.skill.equalsIgnoreCase("Java")){
				System.out.println(emp.name + " has Java Skill ");
			}
			
		} 
		
		System.out.println(" New Employee List::");
		
		Iterator hsItr1 = hs1.iterator();
		while(hsItr1.hasNext()){
			NewEmployee newemp = (NewEmployee) hsItr1.next();
			System.out.println(" id : "+newemp.id +" expyear : "+ newemp.expyear+"  name : "+ newemp.name  +"  Skill : "+newemp.skill+ "  salary :  "+ newemp.salary);
			if(newemp.id == 106){
				System.out.println(newemp.id+"  is working ");
			}
			if(newemp.name.equalsIgnoreCase("Kapil")){
				System.out.println(newemp.name +" is working ");
			}
			if(newemp.expyear<4){
				hsItr1.remove();
			}
			if(newemp.skill.equalsIgnoreCase("Java")){
				System.out.println(newemp.name + " has Java Skill ");
			}
		}
		System.out.println(" Total Employee : "+(hs.size() + hs1.size()));
	}
}