package com.example;

public class Dog {
  String Dog_Name;
  String Breed_Name;
  
  Dog(String Dog_Name, String Breed_Name ){
	  this.Dog_Name=Dog_Name;
	  this.Breed_Name=Breed_Name;
	  
  }
  
  
  void get_Name() {
	  
	  System.out.println("Dog Name: " +Dog_Name);
	  
  }
	void get_Breed_Name() {
		 System.out.println("Breed Name: " +Breed_Name);
		  
	}
	void set_Dog_Name(String Dog_Name) {
		this.Dog_Name=Dog_Name;
		System.out.println(Dog_Name);
	}
	void set_Breed_Name(String Breed_Name) {
		this.Breed_Name=Breed_Name;
		System.out.println(Breed_Name);
	}
	
	
	
	public static void main(String args[]) {
		Dog obj=new Dog("Hardin","Labour Dog");
		obj. get_Name();
		obj.get_Breed_Name();
		obj.set_Dog_Name("Charliee");
		obj.set_Breed_Name("bullDog");
		
		
	}
}
