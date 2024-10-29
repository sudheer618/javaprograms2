package com.chs.arraysOperations;

import java.util.Scanner;

public class Array2DOps {
public static String arr[][][];
Scanner sc = new Scanner(System.in);
	public void creatArray(int scl,int cls, int stu) {
		arr = new String[scl][cls][stu];		
	}
	public void insertData(int scl,int cls, int stu) {
		System.out.println("collecting student marks : " );
		for(int i=0; i<scl ;i++) {
			System.out.println("inside the school number:" + (i+1));
			for(int j=0 ; j<cls ;j++) {
				System.out.println("enter the class number : " +(j+1));
				for(int k=0 ; k<stu ; k++) {
					System.out.println("enter the student marks :"+(k+1));
				arr[i][j][k] = sc.next();
				}
			}
		}
		System.out.println("data is loaded on to the array.");
		System.out.println("----------------------");
	}
	public void displayData(int scl,int cls, int stu) {
		System.out.println("displaying  student name : " );
		for(int i=0; i<scl ;i++) {
			System.out.println("inside the school number:" + (i+1));
			for(int j=0 ; j<cls ;j++) {
				System.out.println("enter the class number : " +(j+1));
				for(int k=0 ; k<stu ; k++) {
					System.out.println("enter the  student marks :"+(k+1)+" is = " + arr[i][j][k]);
				}
				
			}
		}
		System.out.println("---------------------");		
	}

}
