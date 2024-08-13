package com.example;

class vehicle{
	void noOfEngine() {
		System.out.println("I have one engine");
	}
}
class Bike1 extends vehicle{
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}

class Bike2 extends Bike1{
	void brandName() {
		System.out.println("Brand Name is Honda");
	}
}



public class MultiLevelInheritance {
	public static void main(String args[]) {
		Bike2 bike = new Bike2();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();
	}

}
