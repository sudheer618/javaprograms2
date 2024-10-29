package com.chs.stringPrograms;

import java.util.Scanner;

public class SpaceCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		// Remove the first space if present
		int firstSpaceIndex = str.indexOf(' ');
		if (firstSpaceIndex != -1) {
			str = str.substring(firstSpaceIndex + 1);
		}

		// Count words
		String[] words = str.trim().split("\\s+");
		int wordCount = words.length;

		// Output the result
		System.out.println("Number of words is : " + wordCount);
		
	}

}

