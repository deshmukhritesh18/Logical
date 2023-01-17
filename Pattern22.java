package com.bnt.logical;

import java.util.Scanner;

public class Pattern22 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of stars ");
		int size=sc.nextInt();
		    
		    for (int i = 0; i < size; i++) {
	
		      for (int j = 0; j < size; j++) {
		       
		        if (i == 0 || i == size - 1) {
		          System.out.print("*");
		        }
		        else {
		       
		          if (j == 0 || j == size - 1) {
		            System.out.print("*");
		          }
		          else {
		            System.out.print(" ");
		          }
		        }
		      }
		      System.out.println();
		    }
	}

}
