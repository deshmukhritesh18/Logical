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
/*      A 
       A B 
      A B C 
     A B C D 
    A B C D E 
   A B C D E F 
  A B C D E F G 
 A B C D E F G H 
A B C D E F G H I */ 
