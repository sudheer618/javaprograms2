package com.chs.stringPrograms;

import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();

		// Remove leading whitespace and count words
		int wordCount = countWordsIgnoringFirstSpace(str);
		System.out.println("Number of words (ignoring first space): " + wordCount);
	}

	public static int countWordsIgnoringFirstSpace(String str) {
		// Trim leading spaces
		str = str.trim();

		// If the string is empty after trimming, return 0
		if (str.isEmpty()) {
			return 0;
		}

		// Split the string into words
		String[] words = str.split("\\s+");

		// If there's a space at the start, we ignore the first word
		return words.length > 0 ? words.length - 1 : 0;
	}

}
