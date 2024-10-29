package com.chs.stringPrograms;

import java.util.Scanner;

class VowelOperations{
	Scanner sc = new Scanner(System.in);
	void countVowelConsonant(String s) {
		int vowel_count = 0;
		int consonant_count = 0;
		System.out.println("calculating the vowel and consonant :");
		for(int i=0; i<s.length() ; i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
					s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
				vowel_count++;
			}
			else {
				consonant_count++;
			}
		}
		System.out.println("the vowel count is :" + vowel_count);
		System.out.println("the consonant count :" +consonant_count);
		System.out.println("--------------------------------------");
	}
	void lowerCaseVowels(String s) {
		int lower_vowel_count = 0;
		System.out.println("calculating the lower case vowel count : ");
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				lower_vowel_count++;
			}
		}
		System.out.println("the lower case vowel count is :" +lower_vowel_count);
		System.out.println("--------------------------------------");
	}
	void upperCaseVowels(String s) {
		int upper_vowel_count = 0;
		System.out.println("calculating the upper case vowel count : ");
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
				upper_vowel_count++;
			}
		}
		System.out.println("the upper case vowel count is :" + upper_vowel_count);
		System.out.println("--------------------------------------");
	}
	void replaceAllVowels(String s) {
		String str_temp = "";
		System.out.println("replacing all the vowel with a special character :");
		for(int i=0; i<s.length() ; i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
					s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
				str_temp +='@';
			}
			else {
				str_temp += s.charAt(i);
			}
		}
		System.out.println("the replaced string is :" + str_temp );
		System.out.println("-------------------------------------");
	}
	void replaceUpperCaseVowels(String s) {
		String str_temp = "";
		System.out.println("replacing  the upper case vowel with a special character :");
		for(int i=0; i<s.length() ; i++) {
			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
				str_temp =str_temp +'@';
			}
			else {
				str_temp = str_temp +s.charAt(i);
			}
		}
		System.out.println("the replaced string is :" + str_temp );
		System.out.println("-------------------------------------");
	}
	void replaceLowerCaseVowels(String s) {
		String str_temp = "";
		System.out.println("replacing the lower case vowel with a special character :");
		for(int i=0; i<s.length() ; i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				str_temp =str_temp +'@';
			}
			else {
				str_temp = str_temp +s.charAt(i);
			}
		}
		System.out.println("the replaced string is :" + str_temp );
		System.out.println("------------------------------------");
	}
	void indivitualVowels(String s) {
		String str_temp = "";
		System.out.println("replacing indivitual vowel with an indivitual special character :");
		for(int i=0; i<s.length() ; i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='A') {
				str_temp += '@';
			}
			else if(s.charAt(i)=='e'||s.charAt(i)=='E') {
				str_temp += '$';
			}
			else if(s.charAt(i)=='i'||s.charAt(i)=='I') {
				str_temp += '#';
			}
			else if(s.charAt(i)=='o'||s.charAt(i)=='O') {
				str_temp += '*';
			}
			else if(s.charAt(i)=='u'||s.charAt(i)=='U') {
				str_temp += '&';
			}
			else {
				str_temp += s.charAt(i);
			}
		}
		System.out.println("the replaced string is :" + str_temp);
		System.out.println("------------------------------------");
	}
}
public class VowelCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the string :");
		String s = sc.nextLine();
		
		VowelOperations vo = new VowelOperations();
		vo.countVowelConsonant(s);
		vo.lowerCaseVowels(s);
		vo.upperCaseVowels(s);
		vo.replaceAllVowels(s);
		vo.replaceUpperCaseVowels(s);
		vo.replaceLowerCaseVowels(s);
		vo.indivitualVowels(s);
	}

}
