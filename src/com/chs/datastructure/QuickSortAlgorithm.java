package com.chs.datastructure;

import java.util.Scanner;

class QuickSort{
	public void quickSort(int[] arr, int start , int end) {
		if(start < end) {
			int pivot = partition(arr,start,end);
			quickSort(arr,start,pivot-1);
			quickSort(arr,pivot+1,end);
		}
	}

	private int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int i = start-1;

		for(int j=start ; j<=end-1 ; j++) {
			if(arr[j]< pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = temp;

		return(i+1);
	}
}
class ArrayOps{
	int arr[];
	int size;
	Scanner sc = new Scanner(System.in);
	void createArray() {
		System.out.println("enter the array size : ");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("array is created");
		System.out.println("---------------");
	}
	void collectArrayData() {
		System.out.println("collecting array data:");
		for(int i=0; i<size ;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("array data is collected");
		System.out.println("---------------");
	}
	void display() {
		System.out.println("array elements are :");
		for(int i=0; i<size ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("---------------");
	}
	void sorting() {
		QuickSort qs = new QuickSort(); 
		qs.quickSort(arr , 0, size-1);
	}
}
public class QuickSortAlgorithm {

	public static void main(String[] args) {
		ArrayOps ao = new ArrayOps();
		ao.createArray();
		ao.collectArrayData();
		System.out.println("before sorting");
		ao.display();
		ao.sorting();
		System.out.println("After sorting");
		ao.display();
		

	}

}
