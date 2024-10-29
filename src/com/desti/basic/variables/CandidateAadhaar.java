package com.desti.basic.variables;

import java.util.Scanner;

class CDetails{
	String name ;
	int age;
	String dob ;
	String addre;
	String city;
	String state;
	static String country;
	static {
		country = "India";
	}

	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name : ");
		name = sc.next();
		System.out.println("enter the age : ");
		age = sc.nextInt();
		System.out.println("enter the dob : ");
		dob = sc.next();
		System.out.println("enter the address : ");
		addre = sc.next();
		System.out.println("enter the city : ");
		city = sc.next();
		System.out.println("enter the state : ");
		state = sc.next();
		System.out.println("enter the country : ");
		country = sc.next();
		System.out.println("----------------");
	}
	void display() {
		System.out.println("name is : " + name);
		System.out.println("age is : " + age);
		System.out.println("date of birth is : " + dob);
		System.out.println("address is : " + addre);
		System.out.println("city is : " + city);
		System.out.println("state is : " + state);
		System.out.println("country is : " + country);
	}
}
public class CandidateAadhaar {

	public static void main(String[] args) {
		CDetails d1 = new CDetails();
		CDetails d2 = new CDetails();
		CDetails d3 = new CDetails();
		d1.collectData();
		d1.display();
		System.out.println("----------");
		d2.collectData();
		d2.display();
		System.out.println("-----------");
		d3.collectData();
		d3.display();
	}

}
