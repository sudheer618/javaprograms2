package com.chs.datastructure;

import java.util.Scanner;

class LinearSearch{
	int arr[];
	int flag = 0;
	int size ;
	Scanner sc = new Scanner(System.in);
	void createArray() {
		System.out.println("Enter the Array Size :");
		size = sc.nextInt();
		arr =  new int[size];
		System.out.println("Array is Ready");
		System.out.println("---------------------");
	}
	void addElement() {
		System.out.println("Adding Element Into The Array :");
		for(int i=0 ; i<size ;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Element Are Added");
		System.out.println("--------------------");
	}
	void linearSearch() {
		System.out.println("Enter The Element To Be Searched :");
		int ele = sc.nextInt();
		for(int i=0; i<size ; i++) {
			if(arr[i]==ele) {
				System.out.println("Element Found In Position Number :" +(i+1));
				flag++;
			}
		}
		if(flag<=0) {
			System.out.println("Element Not Found");
		}
	}

}
public class Launch1 {

	public static void main(String[] args) {
		LinearSearch ls = new LinearSearch();
		ls.createArray();
		ls.addElement();
		ls.linearSearch();
	}

}
