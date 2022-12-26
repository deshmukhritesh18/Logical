package com.bnt.logical;

import java.util.Scanner;

public class Pattern11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows : ");
		
		int row = sc.nextInt();
		
		for (int i = 0; i <= row - 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= row - 1; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		for (int i = row - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= row - 1; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}

/*  * * * * * 
     * * * * 
      * * * 
       * * 
        * 
        * 
       * * 
      * * * 
     * * * * 
    * * * * *  */
