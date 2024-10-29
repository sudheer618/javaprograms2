package com.chs.stringPrograms;

import java.util.Scanner;

public class PasswordCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a password:");
		String str= sc.nextLine();

		   int cond_1= 0;
		   int cond_2= 0;
		   int cond_3= 0;
		   int cond_4= 0;
		   if(str.charAt(0)>=48 && str.charAt(0)<=57) {
			   System.out.println("invalid password");
			   System.exit(0);
		   }
		   else {
			   for(int i=0 ; i<str.length(); i++) {
				   if(str.charAt(i)>=65  && str.charAt(i)<=90) {
					   cond_1 = 1;
				   }
				   else if(str.charAt(i)>=97 && str.charAt(i)<=122) {
					   cond_2 = 1;
				   }
				   else if(str.charAt(i)>=48 && str.charAt(i)<=57) {
					   cond_3 = 1;
				   }
				   else if(str.charAt(i)==' ') {
					  System.out.println("invalid paasword");
					  System.exit(0);
				   }
				   else {
					   cond_4=1;
				   }
			   }
		   }
		   if(cond_1==1 && cond_2==1 &&cond_3==1 &&cond_4==1 ) {
			   System.out.println("valid password");
		   }
		   else {
			   System.out.println("invalid password");
		   }
		}

	}