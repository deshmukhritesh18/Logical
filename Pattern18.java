package com.bnt.logical;

import java.util.Scanner;

public class Pattern18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of row: ");

		int row = sc.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int j = row; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int k = 1; k < 2 * (i - 1); k++) {
				System.out.print(" ");
			}
			if (i == 1) {
				System.out.println("");
			} else {
				System.out.println("*");
			}
		}
		for (int i = row - 1; i >= 1; i--) {
			for (int j = row; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int k = 1; k < 2 * (i - 1); k++) {
				System.out.print(" ");
			}
			if (i == 1)
				System.out.println("");
			else
				System.out.println("*");
		}
	}

}

  /*     *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *    */

