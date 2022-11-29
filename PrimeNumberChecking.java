package com.bnt.logical;

import java.util.Scanner;

public class PrimeNumberChecking {
	  public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        int temp;
	        int number;
	        boolean isPrime = true;
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter Number For prime number checking ");
	        number = in.nextInt();
	        for (int i = 2; i<= number/2; i++) {
	            temp = number%i;
	            if (temp == 0) {
	                isPrime = false;
	                break;
	            }
	        }
	        if(isPrime) 
	            System.out.println(number + ":number is prime");
	            else
	                System.out.println(number + " :number is not a prime");
	             
	         
	    }
	 
	}