package com.chs.stringPrograms;

public class StringCode4 {

	public static void main(String[] args) {
		String s1 = "sudheer";
		String s2 = "Sudheer";
		if(s1.compareTo(s2)==0) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println(s1.compareTo(s2));
			System.out.println("Strings are not equal");
		}
		String s3 = new String( "Sudheer");
		String s4 = new String ("sudheer");
		if(s3.compareTo(s4)==0) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println(s3.compareTo(s4));
			System.out.println("Strings are not equal");
		}

	}

}
