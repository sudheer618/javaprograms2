package com.desti.basic.variables;

public class InstanceVariableExample {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.display();
		System.out.println();
		d.addData();
		d.display();
	}
}
class Dog{
	String name ;//instance variable
	String color;
	int cost;
	int age;
	void addData() {
		name = "rocky";
		color = "brown";
		cost = 5000;
		age = 4;
	}
	void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
	}
}
