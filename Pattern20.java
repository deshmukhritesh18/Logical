package com.bnt.logical;

import java.util.Scanner;

public class Pattern20 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of alphabet");
		int alphabetno=sc.nextInt();
		int ch = 65;
		for (int i = alphabetno-1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (ch + j) + " ");
			}
			System.out.println();
		}
		for (int i = 0; i <= alphabetno-1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (ch + j) + " ");
			}
			System.out.println();
		}
	}

}
