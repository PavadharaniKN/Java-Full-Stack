package com.example;

class Animal{
	void makeSound() {
		System.out.println("Sounds of the animal:");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("Cat will meow");
	}
}
class Dog1 extends Cat{
	void makeSound() {
		System.out.println("Dog will Bark");
	}
}


public class Sound {
	
public static void main(String args[]) {
	Animal ani = new Animal();
    ani.makeSound();
    Cat cat=new Cat();
    cat.makeSound();
    Dog1 dog=new Dog1();
    dog.makeSound();
}
}
