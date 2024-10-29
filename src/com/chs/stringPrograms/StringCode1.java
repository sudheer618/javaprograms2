package com.chs.stringPrograms;

public class StringCode1 {

	public static void main(String[] args) {
		String s1 = "suDheeR";
		String s2 = "sudheer";
		
		if(s1.equals(s2)==true) {
			System.out.println("strings are equal");
		}
		else {
			System.out.println("strings are not equal");
		}
		System.out.println("-------------------");
		String s3 = new String("sudheer");
		String s4 = new String("sudheer");
		if(s3.equals(s4)==true) {
			System.out.println("strings are equal");
		}
		else {
			System.out.println("strings are not equal");
		}
	}

}
