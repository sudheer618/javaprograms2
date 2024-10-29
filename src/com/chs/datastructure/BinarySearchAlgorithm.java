package com.chs.datastructure;

import java.util.Arrays;
import java.util.Scanner;

class BinarySearch2{
	int arr[];
	int size;
	Scanner sc = new Scanner(System.in);
	void createArray() {
		System.out.println("enter the array size :");
		size = sc.nextInt();
		arr=new int[size];
		System.out.println("array is created....");
		System.out.println("-----------------");
	}
	void collectData() {
		System.out.println("collecting array data");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("array is created");
		Arrays.sort(arr);
		System.out.println("array is sorted");
		System.out.println("-------------------");
	}
	void binarySearch() {
		int first=0;
		int last = size-1;
		int flag = 0;
		System.out.println("enter the element to be searched :");
		int key =sc.nextInt();
		while(first<=last) {
			int mid = (first + last)/2;
			if(arr[mid]==key) {
				System.out.println("element found in position :" +(mid+1));
				flag++;
				break;
			}
			else if(arr[mid]<key) {
				first = mid+1;
			}
			else if(arr[mid]>key) {
				last = mid-1;
			}
		}
		if(flag<=0) {
			System.out.println("element not found");
		}
	}
}

public class BinarySearchAlgorithm {
	
	public static void main(String[] args) {
		BinarySearch2 bs = new BinarySearch2();
		bs.createArray();
		bs.collectData();
		bs.binarySearch();
	}
	
}
