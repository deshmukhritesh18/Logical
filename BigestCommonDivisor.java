package com.bnt.logical;

import java.util.Scanner;

public class BigestCommonDivisor {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number to find Bigest Common Divisor");
		int number1 = scanner.nextInt();
		System.out.println("Enter second number to find Bigest Common Divisor");
		int number2 = scanner.nextInt();
		System.out.println("Bigest Common Divisor of two numbers " + number1 + " and " + number2 + " is :" + findBigestCommonDivisor(number1, number2));
		/*
		 * if(number2==0) {
		 * System.out.println(" 1 Bigest Common Divisor of two numbers " + number1 +
		 * " and " + number2 + " is :"+ number1 ); }else if(number1==0){
		 * System.out.println(" 2 Bigest Common Divisor of two numbers " + number1 +
		 * " and " + number2 + " is :"+ number2 ); }else if(number1>number2) {
		 * System.out.println(" 3 Bigest Common Divisor of two numbers " + number1 +
		 * " and " + number2 + " is :"+ (number2 % number1) ); }else {
		 * System.out.println(" 3 Bigest Common Divisor of two numbers " + number1 +
		 * " and " + number2 + " is :"+ (number1 % number2) );
		 * 
		 * }
		 */

	}

	private static int findBigestCommonDivisor(int number1, int number2) {
		if (number2 == 0) {
			return number1;
		}
		return findBigestCommonDivisor(number2, number1 % number2);
	}

}
