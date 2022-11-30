package com.bnt.logical;

import java.util.Scanner;

public class ReverseString {
	 
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        String original;
	        System.out.println("Enter the string to be reverse");
	        Scanner sc = new Scanner(System.in);
	        original = sc.nextLine();
	        
	        System.out.println("Reverse String is:");
	        
	        char chars[] = original.toCharArray();  
	        for(int i= chars.length-1; i>=0; i--) {
	            System.out.print(chars[i]);
	        }
	    }
	}
	 
