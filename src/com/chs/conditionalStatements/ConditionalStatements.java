package com.chs.conditionalStatements;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		Scanner sc  = new Scanner (System.in);
		System.out.println("enter the age : ");
		int age = sc.nextInt();
		if(age<18) {
			System.out.println("you are a still  kid. you are not eligible");
		}
		if(age <8) {
			System.out.println("you are a still kiddoo.you are not eligible");
		}
		else if(age>60) {
			System.out.println("you are a already a senior citizen.you are not eligible");
		}
		else {
			System.out.println("eligible for marriage");
		}
	}

}
