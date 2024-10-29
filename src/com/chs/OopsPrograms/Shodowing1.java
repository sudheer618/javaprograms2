package com.chs.OopsPrograms;

class Cricketer{
	private String name ;
	private int age ;
	private String position ;
	
	void setData(String name , int age , String position) {
		this.name = name ;
		this.age = age ;
		this.position = position ;
	}
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(position);
	}
	void setName(String name) {
		this.name = name ;
	}
	void setAge(int age) {
		this.age = age ;
	}
	void setPosition(String position) {
		this.position = position ;
	}
	String getName() {
		return name ;
	}
	int getAge() {
		return age ;
	}
	String getPosition() {
		return position ;
	}
}

public class Shodowing1 {

	public static void main(String[] args) {
		Cricketer c =new Cricketer();
		c.setData("Virat Kohli", 35, "batsman");
		c.getData();
		
		Cricketer c1 =new Cricketer();
		c1.setName("dhoni");
		c1.setAge(45);
		c1.setPosition("Batsman");
		System.out.println("-----------");
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getPosition());
	}

}
