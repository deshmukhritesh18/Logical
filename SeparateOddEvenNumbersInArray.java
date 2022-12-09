package com.bnt.logical;

import java.util.Scanner;

public class SeparateOddEvenNumbersInArray {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < size; i++) {

			array[i] = sc.nextInt();
		}

		System.out.println("Original Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		int evenSize = 0;
		int oddSize = 0;
		for (int i = 0; i < size; i++) {
			if (array[i] % 2 == 0)
				evenSize++;
			else
				oddSize++;
		}

		int[] even = new int[evenSize];
		int[] odd = new int[oddSize];

		int j = 0, k = 0;
		for (int i = 0; i < size; i++) {
			if (array[i] % 2 == 0)
				even[j++] = array[i];
			else
				odd[k++] = array[i];
		}

		System.out.print("Even Array contain: ");
		printArray(even);
		System.out.print("Odd Array contain: ");
		printArray(odd);
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}
