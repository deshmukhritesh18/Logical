package com.bnt.logical;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of row ");
		int row = sc.nextInt();
		for (int i = 0; i < row; i++) {
			int number = 1;
			System.out.printf("%" + (row - i) * 2 + "s","");
			for (int j = 0; j <= i; j++) {
				System.out.printf("%4d", number);
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}

/*      1
      1   1
    1   2   1
  1   3   3   1
1   4   6   4   1  */