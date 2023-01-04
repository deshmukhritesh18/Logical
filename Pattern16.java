package com.bnt.logical;

public class Pattern16 {

	public static void main(String[] args) {
		for (int i = 0; i <= 8; i++) {
			int word = 65;
			for (int j = 8; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print((char) (word + k) + " ");
			}
			System.out.println();
		}
	}
}