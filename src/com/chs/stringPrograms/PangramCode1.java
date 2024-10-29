package com.chs.stringPrograms;

import java.util.HashSet;
import java.util.Scanner;

public class PangramCode1 {

	public static boolean isPangram(String str) {
		HashSet<Character> letters = new HashSet<>();

		// Convert the string to lowercase to handle case insensitivity
		str = str.toLowerCase();

		// Iterate through each character in the string
		for (char c : str.toCharArray()) {
			// Check if the character is an alphabet letter
			if (c >= 'a' && c <= 'z') {
				letters.add(c);
			}
		}

		// Check if we have all 26 letters
		return letters.size() == 26;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string :");
		String s1 = sc.nextLine();

		if (isPangram(s1)) {
			System.out.println("The given string is a pangram.");
		} else {
			System.out.println("The given string is not a pangram.");
		}

		sc.close();
	}

}
