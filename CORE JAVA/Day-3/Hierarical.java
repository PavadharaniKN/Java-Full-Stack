package com.example;

class vehicle1{
	void noOfEngine() {
		System.out.println("I have one engine");
	}
}
class Twowheeler extends vehicle1{
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}

class Bike extends Twowheeler{
	void brandName() {
		System.out.println("Brand Name is Honda");
	}
}
class Scooty extends Twowheeler{
	void brandName() {
		System.out.println("Brand Name is Activa");
	}
}


public class Hierarical {
	public static void main(String args[]) {
		Bike bike = new Bike();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();
		
		
		Scooty scooty = new Scooty();
		   scooty.noOfEngine();
             scooty.noOfWheels();
		    scooty.brandName();
			
		}
	}


