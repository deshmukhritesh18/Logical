package com.bnt.logical;

import java.util.Scanner;

public class PermutationOfString {
	static int o=0;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.next();
		String empty = "";
		permute(str, empty);
		System.out.println("Permutation Of String is: "+o);
	}

	static void permute(String str, String empty) {
		if (str.length() == 0) {
			o++;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String left_substr = str.substring(0, i);
			String right_substr = str.substring(i + 1);
			String rest = left_substr + right_substr;
			permute(rest, empty + ch);
		}
	}


	

}
