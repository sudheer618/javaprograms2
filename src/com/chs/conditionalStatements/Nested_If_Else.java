package com.chs.conditionalStatements;

import java.util.Scanner;

public class Nested_If_Else {

	public static void main(String[] args) {
		int accno = 222;
		int pwd = 111;

		int accno_new ;
		int pwd_new ;

		try(Scanner sc = new Scanner(System.in)){
		System.out.println("enter the account number");
		accno_new = sc.nextInt();
		System.out.println("enter the password");
		pwd_new = sc.nextInt();

		if(accno==accno_new) {
			if(pwd==pwd_new) {
				System.out.println("valid credentials");
			}
			else {
				System.out.println("invalid password");			
			}
		}
			else {
				System.out.println("invalid account number");
			}
		}
	
	}
}
