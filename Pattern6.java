package com.bnt.logical;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row ");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j = row; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= row - 1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = row - 1; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/* *
   **
   ***
   ****
   *****
   ****
   ***
   **
   *  */
