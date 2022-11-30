package com.bnt.logical;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main (String[] args) {
	        String original, reverse = "";
	        Scanner sc = new Scanner(System.in);
	        int length;
	        System.out.println("Enter the number or String");
	        original = sc.nextLine();
	        length = original.length();
	        for (int i =length -1; i>=0; i--) {
	            reverse = reverse + original.charAt(i);
	            
	        }
	        System.out.println("reverse is:" +reverse);
	         
	        if(original.equals(reverse)) 
	            System.out.println("This is example of palindrome");
	        else
	            System.out.println("Not a palindrome");
	         
	    }
}
