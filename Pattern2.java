package com.bnt;

public class Pattern2 {

	public static void main(String[] args) {
		
		int charNo=0;
		int height=5;
		int space=height-1;
		
		for(int i=0;i<height;i++) {
			for(int j=space;j>i;j--) {
				System.out.print(" ");
				}
			for(int k=0;k<=charNo;k++) {
				System.out.print((char)(charNo+65));
			}
			charNo+=2;
			System.out.println(" ");
		}

	}

}
