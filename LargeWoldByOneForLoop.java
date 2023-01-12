package com.bnt.logical;

import java.util.Scanner;

public class LargeWoldByOneForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence:");
		String string=sc.nextLine();

		string =string + " "; 
		String word = "",large = "";

		for (int i=0;i<string.length();i++) {
			char c = string.charAt(i);
			if (c == ' ') {

				if (word.length()>large.length())
					large=word;

				word="";
			} else{
				word=word+c;
			}
		}

		System.out.println("Largest word : " + large);
	}

}
