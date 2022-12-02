package com.bnt.logical;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 1;
		int number;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number for length of series");
		number = in.nextInt();
		System.out.println("Fibonacci Number Series is:");
		for (int i = 0; i < number; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(a + ",");
		}
	}
}