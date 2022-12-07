package com.bnt.logical;

import java.util.Scanner;

public class LargestSmallestNumberInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();
		int array[] = new int[size];

		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < size; i++) {

			array[i] = sc.nextInt();
		}
		int smallElement = array[0];
		int largeElement = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > largeElement)
				largeElement = array[i];
			else if (array[i] < smallElement)
				smallElement = array[i];

		}
		System.out.println("Smallest Number is : " + smallElement);
		System.out.println("Largest Number is : " + largeElement);
	}
}