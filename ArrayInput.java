package com.bnt.logical;

import java.util.Scanner;

public class ArrayInput {
	public static void main(String args[]) {
		int m, n, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		m = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		n = sc.nextInt();
		int array1[][] = new int[m][n];
		int array2[][] = new int[m][n];
		System.out.println("Enter the elements of the array1: ");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				array1[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Enter the elements of the array2: ");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				array2[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Elements of the array1 are: ");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++)
				System.out.print(array1[i][j] + " ");
			System.out.println();
		}
		System.out.println("Elements of the array2 are: ");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++)
				System.out.print(array2[i][j] + " ");
			System.out.println();
		}
	}
}