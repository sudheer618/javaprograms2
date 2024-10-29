package com.desti.basic.variables;

import java.util.Scanner;

class Details{
	String name;
	double number;
	float address;
	double mobileno;
	
	void collectDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		name = sc.toString();
		System.out.println("enter number");
		number = sc.nextDouble();
		System.out.println("enter the address");
		address = sc.nextFloat();
		System.out.println("enter mobile number");
		mobileno  = sc.nextDouble();
	}
	
}
public class Adhaar {

	public static void main(String[] args) {
		Details d1 = new Details();
		Details d2 = new Details();
		Details d3 = new Details();
		
		d1.collectDetails();
		d2.collectDetails();
		d3.collectDetails();

	}

}
