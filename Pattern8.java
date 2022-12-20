package com.bnt.logical;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row =sc.nextInt();
		for (int i = row; i >= 1; i--) {
			for (int j = row; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

/*   *****
      ****
       ***
        **
         *   */
