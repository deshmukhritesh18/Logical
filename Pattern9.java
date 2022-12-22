package com.bnt.logical;

import java.util.Scanner;

public class Pattern9 {
	public static void main(String[] args) {
		int i;
		int j;
		int rows;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		rows = sc.nextInt();
		for (i = 0; i <= rows - 1; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for (i = rows - 1; i >= 0; i--) {
			for (j = 0; j <= i - 1; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
 
/* * 
   * * 
   * * * 
   * * * * 
   * * * * * 
   * * * * * * 
   * * * * * * * 
   * * * * * * * * 
   * * * * * * * 
   * * * * * * 
   * * * * * 
   * * * * 
   * * * 
   * * 
   *       */ 

