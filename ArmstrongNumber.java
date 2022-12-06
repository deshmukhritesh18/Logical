package com.bnt.logical;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number; // 8208,54748
		int sum = 0;
		int digits = 0;
		int t;
		int rem;

		
		System.out.println("Enter the number for checking the number is a Armstrong number or Not?");
		number = sc.nextInt();

		t = number;

		while (t != 0) {
			digits++;
			t = t / 10;
		}

		t = number;

		while (t != 0) {
			rem = t % 10;
			sum = sum + getPower(rem, digits);
			t = t / 10;
		}

		if (number == sum)
			System.out.println(number + " it is a Armstrong Number.");
		else
			System.out.println(number + " it is not a Armstrong Number.");
	}

	static int getPower(int number, int r) {
		int c, p = 1;

		for (c = 1; c <= r; c++)
			p = p * number;

		return p;
	}
}
