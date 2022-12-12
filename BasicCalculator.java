package com.bnt.logical;

import java.util.Scanner;

public class BasicCalculator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter two number: ");
		double firstNumber = sc.nextDouble();
		double secondNumber = sc.nextDouble();

		System.out.print("Enter an operator (+, -, *, /): ");
		char operator = sc.next().charAt(0);

		double result;
		switch (operator) {
		case '+':
			result = firstNumber + secondNumber;
			break;
		case '-':
			result = firstNumber - secondNumber;
			break;
		case '*':
			result = firstNumber * secondNumber;
			break;
		case '/':
			result = firstNumber / secondNumber;
			break;
		default:

			return;
		}
		System.out.printf("%.1f %c %.1f = %.1f", firstNumber, operator, secondNumber, result);
	}
}
