package com.chs.stringPrograms;

import java.util.Scanner;

public class PangramCode2 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string +:");
		String s = sc.nextLine();
		s = s.toUpperCase();

		int[] arr = new int[26];

		// Iterate through each character in the string
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			// Check if the character is an upper case letter
			if (ch >= 'A' && ch <= 'Z') {
				arr[ch - 'A'] = 1; // Mark this letter as found
			}
		}
		// Check if all letters from A to Z are present
		boolean isPangram = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 1) {
				isPangram = false;
				break; // Exit loop if any letter is missing
			}
		}
		// Print result
		if (isPangram) {
			System.out.println("Pangram");
		} else {
			System.out.println("Not a pangram");
		}

		sc.close();
	}

}
