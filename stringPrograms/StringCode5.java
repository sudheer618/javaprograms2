package com.chs.stringPrograms;

public class StringCode5 {

	public static void main(String[] args) {
		String s1 = "rama";
		String s2 = "rava";
		if(s1.compareToIgnoreCase(s2)==0) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println(s1.compareTo(s2));
			System.out.println("Strings are not equal");
		}
		String s3 = new String( "Rama");
		String s4 = new String ("Raba");
		if(s3.compareToIgnoreCase(s4)==0) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println(s3.compareTo(s4));
			System.out.println("Strings are not equal");
		}

	}

}
