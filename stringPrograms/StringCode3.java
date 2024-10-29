package com.chs.stringPrograms;

public class StringCode3 {

	public static void main(String[] args) {
		String s1 = "sudheer";
		String s2 = "sudheer";
		if(s1==s2) {
			System.out.println("addresses are equal");
		}
		else {
			System.out.println("addresses are not equal");
		}
		String s3 = new String( "sudheer");
		String s4 = new String ("sudheer");
		if(s3==s4) {
			System.out.println("addresses are equal");
		}
		else {
			System.out.println("addresses are not equal");
		}
	}

}
