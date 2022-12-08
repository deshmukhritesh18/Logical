package com.bnt.logical;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int num = sc.nextInt();

		int b = num - 1;
		int space = num;
		int space1 = 0;

		for (int i = 1; i <= num; i++) {
			int a = 1;
			int c = b;
			for (int j = 1; j < num * 2; j++) {
				if (j <= num) {
					if (j <= num - space1) {
						System.out.print(a + " ");
						a++;
					} else {
						System.out.print("  ");
					}
				} else {

					if (j > space) {
						System.out.print(c + " ");
						c--;
					} else {
						System.out.print("  ");
					}

				}
			}
			space1 = space1 + 1;
			if (i >= 2) {
				space++;
				b--;
			}
			System.out.println();
		}

	}

}// OutPut
/*1 2 3 4 5 4 3 2 1 
  1 2 3 4   4 3 2 1 
  1 2 3       3 2 1 
  1 2           2 1 
  1               1 */