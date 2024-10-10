package com.chs.javaprograms;

import java.util.Arrays;
import java.util.Scanner;

class Binary{
	int arr[];
	int size;
	Scanner sc = new Scanner(System.in);
	public void createArray() {
		System.out.println("enter the array size :");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("array is crated...");
		System.out.println("---------------------");
	}
	void collectData() {
		System.out.println("collect the array eelements :");
		for(int i=0; i<size ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("array elements sre collected....");
		Arrays.sort(arr);
		System.out.println("array elements are sorted.....");
	}
	void binarySearch() {
		int first = 0;
		int last = size-1;
		int flag =0 ;
		System.out.println("enter the elements to be searched :");
		int key = sc.nextInt();
		while(first<=last) {
			int mid = (first + last)/2 ;
			if(arr[mid]==key) {
				System.out.println("element found in position :" + (mid+1));
				flag++ ;
				break;
			}
			else if(arr[mid]<key) {
				first = mid+1 ;
			}
			else if(arr[mid]>key) {
				last = mid-1 ;
			}
		}
		if(flag<=0) {
			System.err.println("elemnet are not found....");
		}
	}
}
public class BinarySearch3 {

	public static void main(String[] args) {
		Binary b = new Binary();
		b.createArray();
		b.collectData();
		b.binarySearch();
	}

}


