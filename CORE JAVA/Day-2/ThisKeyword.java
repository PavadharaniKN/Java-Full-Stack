package com.example;
//this keyword refers current class object
public class ThisKeyword {
String Name;

ThisKeyword(String Name){
this(10,20);
this.Name=Name;
this.greeting();
}

ThisKeyword(int a,int b)
{
	System.out.println("sum :" + (a+b));
}
void greeting() {
	System.out.println("Welcome "+Name);
	
}
public static void main(String args[]) {
	ThisKeyword obj=new ThisKeyword("pava");
}
}