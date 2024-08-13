package com.example;

//types of variable in java
public class Variable {
	int b=20;
	static int c=30;	
	public static void main(String args[]) {
		int a=10;  //local variable
		System.out.println("Local Variable :" +a);
		
		Variable obj =new Variable();
		System.out.println(obj.b);
		
		System.out.println(Variable.c);
	}

}
