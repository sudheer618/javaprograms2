package com.chs.arraysOperations;

import java.util.Scanner;

public class ArrayDS {
	static int choice;
	static void ops() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Operation To Perform : \n"
				+ "1. Create An Array\n"
				+ "2. Add Data Into The Array\n"
				+ "3. Display The Array Data\n"
				+ "4. Update The Element Of An Array\n"
				+ "5. Delete The Element Of An Array\n"
				+ "6. Exit");
		choice = sc.nextInt();
	}
	public static void main(String[] args) {

		ArrayOperations ao = new ArrayOperations();
		ops();
		switch(choice) {
		case 1 :{
			ao.createArray();
			ops();
		}
		case 2 :{
			ao.insertIntoArray();
			ops();
		}
		case 3 :{
			ao.displayArrayData();
			ops();
		}
		case 4 :{
			ao.updateArrayData();
			ops();
		}
		case 5 :{
			ao.deleteArrayData();
			ops();
		}
		default :{
			System.out.println("Unexpected Value Given : " + choice);
		}
		}

	}
}
