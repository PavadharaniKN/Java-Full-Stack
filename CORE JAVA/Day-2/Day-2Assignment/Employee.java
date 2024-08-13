package com.assignment;

public class Employee {
	
	String Emp_Name;
	String Job_Title;
	float Salary;
	
	Employee(String Emp_Name, String Job_Title, float Salary){
		this.Emp_Name=Emp_Name;
		this.Job_Title=Job_Title;
		this.Salary=Salary;
	}
	
	
	void calculate(int amount) {
		Salary+=amount;
	}
	
	void display() {
		System.out.println("Employee Name: " + Emp_Name);
		System.out.println("Job Title: "+Job_Title );
		System.out.println("Salary: " +Salary );
		
	}
	public static void main(String args[]) {
		
		Employee obj =new Employee("Pavadharani","Full Stack Developer",80000);
		obj.calculate(10000);
		obj.display();
		
		
	}

}
