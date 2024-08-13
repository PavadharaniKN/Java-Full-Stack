package com.example;

class Vehicles{
	void drive() {
		System.out.println("Driving a vehicles");
	}
	
}
class Car{
	void drive() {
		System.out.println("Repairing a car");
	}
}



public class Transport {
	public static void main(String args[]) {
	Vehicles veh=new Vehicles();
	veh.drive();
	Car car=new Car();
	car.drive();
	
	
	}
	
	

}
