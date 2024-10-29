package com.chs.OopsPrograms;

class Dog{
	private String name;
	private int age ;
	private String color;
	private int cost;
	private String breed;
	// generic setter
	void setData(String name, int age, String color, int cost, String breed) {
		this.name = name;
		this.age = age;
		this.color = color;
		this.cost = cost ;
		this.breed = breed;
	}
	//generic getters
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(breed);
	}
}
public class EncapsulationGenericCode {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.setData("tomy", 4, "white", 7000, "lab");
		d.getData(); 
	}

}
