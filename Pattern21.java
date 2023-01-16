package com.bnt.logical;

import java.util.Scanner;

public class Pattern21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of row");

		int row = sc.nextInt();
		int i;
		int j;
		int k;

		for (i = 1; i <= row; i++) {
			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= row; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

/*   *****
      *****
       *****
        *****
         *****    */
 