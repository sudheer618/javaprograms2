package com.chs.patternprograms;

import java.util.Scanner;

public class NamePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();

		for(int i= 0 ;i<n;i++) {
			for(int j = 0 ;j<n;j++) {
				if(i==0 && j!=0 && j!=(n-1) ||j==0 && i!=0 ||j==(n-1) && i!=0
						||i==(n/2) ){
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i= 0 ;i<n;i++) {
			for(int j = 0 ;j<n;j++) {
				if(i==0 && j!=(n-1)  || i==(n-1) && j!=(n-1) || j==0 || i==n/2 && j!=(n-1)  || 
						j==n-1 && i!=0  && i!=n/2 && i!=(n-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i= 0 ;i<n;i++) {
			for(int j = 0 ;j<n;j++) {
				if(i==0  && j!=0|| j==0 && i!=0 && i!=(n-1) || i==(n-1)
						&& j!=0 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i= 0 ;i<n;i++) {
			for(int j = 0 ;j<n;j++) {
				if(i==0 && j!=0 && j!=(n-1)|| j==0 && i!=0 && i!=(n-1) || i==n-1
						&& j!=0 && j!=(n-1) || j==(n-1) && i!=0 && i!=(n-1) || i==j && i>=n/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
