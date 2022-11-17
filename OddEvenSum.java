//sum of the entered odd numbers and even numbers and its difference
package com.bnt.logical;

import java.util.Scanner;

public class OddEvenSum {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int startNo = sc.nextInt();
		System.out.println("EnterEnding Number");
		int endNo = sc.nextInt();
		int sumOdd = 0;
		int sumEven = 0;
		int diff;

		int number = startNo;
		while (number <= endNo) {
			if (number % 2 == 0) {
				sumEven += number;
			} else {
				sumOdd += number;
			}
			++number;
		}

		if (sumOdd > sumEven) {
			diff = sumOdd - sumEven;
		} else {
			diff = sumEven - sumOdd;
		}
		System.out.println("The sum of odd Numbers from " + startNo+ " to " + endNo + " is: " + sumOdd);
		System.out.println("The sum of even Numbers from " + startNo + " to " + endNo + " is: " + sumEven);
		System.out.println("The difference between the two sum : " + diff);
	}
}