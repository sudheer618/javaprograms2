package com.chs.datastructure;

import java.util.Scanner;

class Bubble{
	int arr[];
	int size;
	Scanner sc = new Scanner(System.in);
	void createArray() {
		System.out.println("enter the array size :");
		size = sc.nextInt();
		arr = new int [size];
		System.out.println("array is created.......");
		System.out.println("---------------------");
	}
	public void addElements() {
		System.out.println("collecting the array data");
		for(int i=0 ; i<size ; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("array is collected.....");
		System.out.println("---------------------");
	}

	public void display() {
		System.out.println("the elements inside the array are :");
		for(int i=0 ; i<size ; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public void sort() {
		System.out.println("sorting process is intiated...");
		int temp = 0;
		for(int i=0; i<size ; i++) {
			for(int j=i+1; j<size ;j++){
				if(arr[i]>arr[j]) {
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
public class BubbleSort {

	public static void main(String[] args) {
		Bubble bs = new Bubble();
		bs.createArray();
		bs.addElements();
		bs.sort();
		bs.display();
	}

}
