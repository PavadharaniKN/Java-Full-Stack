package com.example;


public class Person {
	String Name;
	int age;
	
	
	Person(String Name,int age){
		this.Name=Name;
		this.age=age;
	}
	void display() {
		System.out.println("Person Name : " +Name );
		System.out.println("Age : " +age );
		
	}
	
	

	
	public static void main(String args[]) {
		Person obj= new Person("Pava",20);
		obj.display();
		
		
	}
}

