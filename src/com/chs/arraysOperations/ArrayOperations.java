package com.chs.arraysOperations;

import java.util.Scanner;

public class ArrayOperations {
	public int arr[];
	Scanner sc = new Scanner(System.in);
	private int size;
	
	public void createArray() {
		System.out.println("Enter the array size : ");
		size = sc.nextInt();
		arr = new int [size];
		System.out.println("Array is created ");
		System.out.println("----------------");
	}
	public void insertIntoArray() {
		System.out.println("Enter the Array Data : ");
		for(int i=0; i<size ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Data Is Inserted Into The Array : ");
		System.out.println("---------------");	
	}
	public void displayArrayData() {
		System.out.println("The Array Data Is : ");
		for(int i=0; i<size;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-------------");
	}
	public void updateArrayData() {
		System.out.println("Enter The Position Where The New Data Has To Be Replaced : ");
		int pos = sc.nextInt();
		if(pos <0 || pos >size) {
			System.out.println("Invalid Position Mentioned ");
		}
		else {
			System.out.println("Enter The New Element :");
			int ele = sc .nextInt();
			
			arr[pos] = ele ;
			System.out.println("Data Is Updated In The Array");
			System.out.println("-----------------");
			displayArrayData();
		}
	}
	public void deleteArrayData() {
		
	}
	

}
