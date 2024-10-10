package com.chs.javaprograms;
class Animal{
	String name ;
	String color;
	double price;
	int age;
	public String breed;
	
	public void eat() {
		System.out.println("Animal is eating");
	}
	public void run() {
		System.out.println("Animal is running");
	}
	class Dog extends Animal{
		int no_of_legs;
		int breed;
		public void bark() {
			System.out.println("Dog is barking");
		}
		class Cat extends Animal{
			int no_of_legs;
			int breed;
			public void meow(){
				System.out.println("cat is sounds like meow");
			}
		}
	}
}
public class JavaProgram1 {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.age=4;
		a.color = "white";
		a.name = "rocky";
		a.price = 240.426565;
		a.breed = "lab";
		a.run();
		a.eat();
	System.out.println(a.name);
	System.out.println(a.age);
	System.out.println(a.price);
		
		
	}

}
