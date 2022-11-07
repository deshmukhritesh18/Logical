package com.bnt;

import java.util.Scanner;

public class FactorialPattern1 {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ënter Number");
		int no=scanner.nextInt();
		System.out.println("Factorial between no 1 to no "+no);
		for(int i=1;i<=no;i++) {
			int count=i;
			int fact=1;
			for(int j=1;j<=count;j++) {
				fact=fact*j;
				
			}
			System.out.println(count+"!= "+fact);
		}
	}

}
