package com.desti.basic.variables;

import java.util.Scanner;

class Farmer{
	double P;
	double T;
	double R;
	double S_T;
	void collectData() {
		Scanner s = new Scanner(System.in);
			System.out.println("enter the P");
			P =s.nextDouble();
			System.out.println("enter the T needed");
			T = s.nextDouble();
		System.out.println("enter the R needed");
		R = s.nextDouble(); 
	}
	void calulate() {
		S_T = (P * T * R)/100 ;
	}
	void display() {
		System.out.println("simple inerest is : " +S_T);
	}
}
public class StaticVariableApplication {

	public static void main(String[] args) {
		Farmer f1 = new Farmer();
		Farmer f2 = new Farmer();
		Farmer f3 = new Farmer();
		//Farmer f4 = new Farmer();
		
		f1.collectData();
		f1.calulate();
		f1.display();
		System.out.println("------------");
		
		f2.collectData();
		f2.calulate();
		f2.display();
		System.out.println("------------");

		f3.collectData();
		f3.calulate();
		f3.display();
		System.out.println("------------");
		
//		f4.collectData();
//		f4.calulate();
//		f4.display();
//		System.out.println("------------");


	}

}
