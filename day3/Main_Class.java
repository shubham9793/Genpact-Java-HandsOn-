package com.org.gen.day3;

class Car1 {
	String carName;
	String carType;
	

	public Car1(String carName, String carType) {
		super();
		this.carName = carName;
		this.carType = carType;
	}


	private String getCarName () {
		return this.carName;
	}
	
	
	
	//inner class
	class Engin {
		String enginType;
		
		void setengin() {
			// access the car type
			if(Car1.this.carType.equals("4WD")) {
				if(Car1.this.getCarName().equals("Crysler")) {
					this.enginType= "Smaller";
				}else {
					this.enginType = "Bigger";
				}
			}
			else {
				this.enginType = "Bigger";
			}
		}
		String getenginType() {
			return this.enginType;
		}
	}
}



public class Main_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 car = new Car1("Mazda","*WD");
		Car1.Engin eng = car.new Engin();
		System.out.println("Engin type for 8WD = "+eng.getenginType());
		
		
		Car1 c = new Car1("Crysler","4WD");
		Car1.Engin en = c.new Engin();
		en.setengin();
		System.out.println("Engin type for 4WD "+en.getenginType());
	}

}
