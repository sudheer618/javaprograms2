package com.chs.Constructors;

class Dog{
	private String name ;
	private String color;
	private int age ;
	private int cost ;
	private String breed ;
	
	public Dog() {
		super();
		System.out.println("showing values after executing zero parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
		System.out.println(cost);
		System.out.println(breed);
		System.out.println("--------------------");
	}
	public Dog(String name) {
		this("tommy" , "yellow");
		this.name = name ;
		System.out.println("showing values after executing 1 parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
		System.out.println(cost);
		System.out.println(breed);
		System.out.println("--------------------");

	}
	public Dog(String name,String color) {
		this("shocky" , "brown" ,4);
		this.name = name ;
		this.color = color;
		System.out.println("showing values after executing 2 parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
		System.out.println(cost);
		System.out.println(breed);
		System.out.println("--------------------");

	}
	public Dog(String name, String color , int age) {
		this("rocky" , "white",5,7000);
		this.name = name ;
		this.color = color ;
		this.age = age ;
		System.out.println("showing values after executing 3 parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
		System.out.println(cost);
		System.out.println(breed);
		System.out.println("--------------------");

	}
	public Dog(String name, String color , int age, int cost) {
		this("bunty" , "black",6,7000 ,"GR");
		this.name = name ;
		this.color = color ;
		this.age = age ;
		this.cost = cost ;
		System.out.println("showing values after executing 4 parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
		System.out.println(cost);
		System.out.println(breed);
		System.out.println("--------------------");

	}
	public Dog(String name, String color , int age, int cost, String breed) {
		this();
		this.name = name ;
		this.color = color ;
		this.age = age ;
		this.cost = cost ;
		this.breed = breed;
		System.out.println("showing values after executing 5 parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
		System.out.println(cost);
		System.out.println(breed);
		System.out.println("--------------------");
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getAge() {
		return age;
	}
	public int getCost() {
		return cost;
	}
	public String getBreed() {
		return breed;
	}
	
}
public class ConstructorExample {

	public static void main(String[] args) {
		
		Dog d = new Dog("vicky");
		System.out.println(d.getName());
		System.out.println(d.getColor());
		System.out.println(d.getAge());
		System.out.println(d.getCost());
		System.out.println(d.getBreed());
	}

}
