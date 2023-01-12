package com.bnt.logical;

import java.util.Scanner;

public class LargeWold {

	public static void main(String[] args) {
		System.out.println("Enter sentence");
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		String word = "", small = "", large = "";
		String[] words = new String[100];
		int length = 0;

		string = string + " ";

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ') {
				word = word + string.charAt(i);
			} else {
				words[length] = word;
				length++;
				word = "";
			}
		}

		small = large = words[0];

		for (int k = 0; k < length; k++) {
			// if (small.length() > words[k].length())
			// small = words[k];
			if (large.length() < words[k].length())
				large = words[k];
		}
		// System.out.println("Smallest word: " + small);
		System.out.println("Largest word: " + large);
		
		
		//by one for loop
	/*	Scanner sc = new Scanner(System.in);
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
		
		*/
		
		
	}
}
