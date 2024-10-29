package com.chs.datastructure;

import java.util.Arrays;
import java.util.Scanner;

class BinarySearch{
	int arr[];
	int flag = 0;
	int size;
	Scanner sc = new Scanner(System.in);
	void createArray() {
		System.out.println("Enter The Array Size :");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("Array Is Ready");
		System.out.println("------------------");
	}
	void addElement() {
		System.out.println("Adding Element Into Array :");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Element Are added");
		System.out.println("----------------");
		//Arrays.sort(arr);
	}
	
	void binarySearch() {
		System.out.println("Enter The Element To Be Searched :");
		int ele = sc.nextInt();
		int first =0;
		int last = size-1;
		while(first<=last) {
			int mid = (first+last)/2;
			if(arr[mid]==ele) {
				System.out.println("Element Is Founded In Postion Number :" + (mid+1));
				System.exit(0);
			}
			else if(arr[mid]>ele) {
				last = mid-1 ; 
			}
			else if(arr[mid]<ele) {
				first = mid+1;
			}
		}
		System.out.println("Element Not Found");
	}
}
public class Launch2 {

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		bs.createArray();
		bs.addElement();
		bs.binarySearch();

	}

}
