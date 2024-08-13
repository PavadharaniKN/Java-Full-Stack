package com.example;

import java.util.Scanner;

class Student{
	int Student_RegNo;
	String Student_Name;
	int Student_mark[]=new int[5];


Student(int Student_Regno, String Student_Name) {
	this.Student_RegNo=Student_RegNo;
	this.Student_Name=Student_Name;
}


 void GetMarks(){
	Scanner scan=new Scanner(System.in);
	for (int i=0;i<5;i++) {
		Student_mark[i]=scan.nextInt();
	}
	
 }
	void displayGrade() {
		int sum=0;
		float avg;
		
		for(int i=0;i<5;i++) {
			sum+=Student_mark[i];
			
		}
		avg=sum/5;
			System.out.println("average:"+avg);
					if(avg>=90) {
						System.out.println("Grade A");
					}
					else if(avg>=80 && avg<=89) {
						System.out.println("Grade B");
					}
					else if(avg>=70 && avg<=79) {
						System.out.println("Grade C");
					}
					else if(avg>=60 && avg>69) {
						System.out.println("Grade D");
					}
					else {
						System.out.println("Grade E");
					}		
		
	}

}
public class Assignment {
public static void main(String args[]) {
	
	Student std1= new Student(14,"pava");
	std1.GetMarks();
	std1.displayGrade();
	
}
}
