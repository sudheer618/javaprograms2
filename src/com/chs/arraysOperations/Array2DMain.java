package com.chs.arraysOperations;

import java.util.Scanner;

public class Array2DMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Array2DOps ao = new Array2DOps();
		System.out.println("enter the school count : ");
		int scl = sc.nextInt();
		System.out.println("enter the class count:");
		int cls =sc.nextInt();
		System.out.println("enter the student count in each class ");
		int stu = sc.nextInt();
		ao.creatArray(scl,cls,stu);
		ao.insertData(scl,cls,stu);
		ao.displayData(scl,cls,stu);
	}

}
