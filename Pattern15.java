package com.bnt.logical;
import java.util.Scanner;

public class Pattern15 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,row;
		System.out.println("Enter no of rows");
		row=sc.nextInt();
		
		for(i=1;i<=row;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(i);
					}
			System.out.println("");
			
		}
		for(i =row-1;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		
	}

}
/*1
  22
  333
  4444
  55555
  4444
  333
  22
  1   */

