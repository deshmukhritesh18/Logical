package com.bnt.logical;

import java.util.Scanner;

public class SwipeTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber;
		int secondNumber;
		int temp;
		System.out.println("Enter 1st Number and 2nd Number");
		Scanner sc = new Scanner(System.in);
		firstNumber = sc.nextInt();
		secondNumber = sc.nextInt();
		System.out.println("Before Swapping" + firstNumber + secondNumber);
		temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
		System.out.println("After Swapping" + firstNumber + secondNumber);

	}
}