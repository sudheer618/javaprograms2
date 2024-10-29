package com.chs.OopsPrograms;

class DogDetails{
	private String name ;
	private int age ;
	private String color ;
	private int cost ;
	private String breed ;
	
	//generic setters
	void setData(String name , int age , String color , int cost , String breed) {
		this.name = name ;
		this.age = age ;
		this.color = color ;
		this.cost = cost ;
		this.breed = breed ;
	}
	//specific setters
	void setName(String name) {
		this.name = name ;
	}
	void setAge(int age) {
		this.age = age ;
	}
	void setColor(String color) {
		this.color = color ;
	}
	void setCost(int cost) {
		this.cost = cost ;
	}
	void setBreed(String breed) {
		this.breed = breed ;
	}
	//generic getters
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(breed);
	}
	//specific getters
	String getName() {
		return name ;
	}
	int getAge() {
		return age ;
	}
	String getColor() {
		return color ;
	}
	int getCost() {
		return cost ;
	}
	String getBreed() {
		return breed ;
	}
}

public class Shodowing {

	public static void main(String[] args) {
		DogDetails d = new DogDetails();
		d.setData("tommy", 4, "white", 7000, "GR");
		d.getData();
		
		DogDetails d1 = new DogDetails();
		d1.setName("Rocky");
		d1.setAge(5);
		d1.setColor("Brown");
		d1.setCost(9000);
		d1.setBreed("Lab");
		System.out.println("-----------");
		System.out.println(d1.getName());
		System.out.println(d1.getAge());
		System.out.println(d1.getColor());
		System.out.println(d1.getCost());
		System.out.println(d1.getBreed());

	}

}
