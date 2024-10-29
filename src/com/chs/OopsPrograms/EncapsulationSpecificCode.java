package com.chs.OopsPrograms;

class Dog1{
	private String name;
	private int age ;
	private String color;
	private int cost;
	private String breed;

	//specific setter
	void setName(String a) {
		name = a;
	}
	void setAge(int b) {
		age = b;
	}
	void setColor(String c) {
		color = c;
	}
	void setCost(int d) {
		cost = d;
	}
	void setBreed(String e) {
		breed = e;
	}
	//specific getter
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
public class EncapsulationSpecificCode {

	public static void main(String[] args) {
		Dog1 d1 = new Dog1();
		d1.setName("tomy");
		d1.setAge(4);
		d1.setColor("black");
		d1.setCost(10000);
		d1.setBreed("lab");
		System.out.println(d1.getName());
		System.out.println(d1.getAge());
		System.out.println(d1.getColor());
		System.out.println(d1.getCost());
		System.out.println(d1.getBreed());
	}

}
