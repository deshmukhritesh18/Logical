package com.bnt.logical;

import java.util.Scanner;

public class DuplicateCharectorInString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String");
		String s = sc.nextLine();
		int count = 0;
		char[] ch = s.toCharArray();
		System.out.println("Duplicate characters in Entered String is :");
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (ch[i] == ch[j]) {
					System.out.print(ch[j] + ",");
					count++;
					break;
				}
			}
		}
	}
}
