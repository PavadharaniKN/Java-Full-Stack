package com.example;

class Employee {
	int employeeId;
	String employeeName;
	float employeeSalary;
	
	
	//constructor
	Employee(int employeeId, String employeeName, float employeeSalary ){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}
	
	
	//method
	void display() {
		System.out.println("Employee Id : " +employeeId);
		System.out.println("Employee Name : " +employeeName);
		System.out.println("Employee Salary : " +employeeSalary);
	}
}


public class MyClass {
public static void main(String args[]) {
	System.out.println("Welcome to java");
	Employee emp1 = new Employee(101,"person1",20000);
	emp1.display();
	Employee emp2 = new Employee(102,"person2",30000);
	emp2.display();
}
}
