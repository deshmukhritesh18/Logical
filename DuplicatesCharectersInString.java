package com.bnt.logical;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicatesCharectersInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Sentence");
		String sentence=sc.nextLine();
		duplicates(sentence);
	}

	public static void duplicates(String sentence) {
		int count=0;
		
		ArrayList<Character>list =new ArrayList<Character>();

		for(int i=0;i<sentence.length();i++) {

			char ch=sentence.charAt(i);

			for (int j=0;j<sentence.length();j++) {
				if (sentence.charAt(j) !=ch) {
					continue;
				}
				count++;

			}

			if (!list.contains(ch)) {
				if (count>1 && ch !=' ') {

					System.out.println("Count of Character " + ch + " is : " + count);
					list.add(ch);
				}
			}

			count=0;
		}
	}

}
