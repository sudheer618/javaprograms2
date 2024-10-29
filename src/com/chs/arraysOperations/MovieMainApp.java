package com.chs.arraysOperations;

import java.util.Scanner;

public class MovieMainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the language count :");
		int lang = sc.nextInt();
		System.out.println("enter the category count :");
		int cat = sc.nextInt();
		System.out.println("enter the movie count :");
		int mov = sc.nextInt();
		System.out.println("enter the overall investment :");
		long invested_amt = sc.nextLong();
		
		MovieOps mo = new MovieOps();
		mo.createArray(lang , cat ,mov);
		mo.collectAllData(lang , cat , mov);
		mo.displayAllData(lang , cat, mov);
		mo.totalRevenue();
		mo.totalRevenueBasedOnLanguage(lang);
		mo.checkProfit(invested_amt);
	}

}
