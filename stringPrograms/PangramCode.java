package com.chs.stringPrograms;

import java.util.Scanner;

public class PangramCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentsnce");
		String s = sc.nextLine();
		s= s.toUpperCase();
		// int arr[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int arr[] = new int[26];
		for(int i=0 ;i<arr.length; i++) {
			arr[i]=0;
		}
		int temp;
		for(int i=0; i<s.length();i++) {
			temp = s.charAt(i)-65;
			arr[temp] = 1;
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i]!=1) {
				System.out.println("not pangram");
				System.exit(0);
			}
		}
		System.out.println("pangram");
	}

}
