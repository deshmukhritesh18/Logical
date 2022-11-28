package com.bnt.logical;

import java.util.Scanner;

public class MatrixAdition {

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number of rows: ");
			int rows= sc.nextInt();
			System.out.print("Enter the number of columns: ");
			int columns= sc.nextInt();
	        int[][] firstMatrix = new int[rows][columns];
	        int[][] secondMatrix = new int[rows][columns];
	    	System.out.println("Enter the elements of the firstMatrix: ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					firstMatrix[i][j] = sc.nextInt();
				}
				System.out.println();
			}
			System.out.println("Enter the elements of the secondMatrix: ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					secondMatrix[i][j] = sc.nextInt();
				}
				System.out.println();
			}
			System.out.println("Elements of the firstMatrix are: ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++)
					System.out.print(firstMatrix[i][j] + " ");
				System.out.println();
			}
			System.out.println("Elements of the secondMatrix are: ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j <columns; j++)
					System.out.print(secondMatrix[i][j] + " ");
				System.out.println();
			}
	        int[][] sum = new int[rows][columns];
	        for(int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
	            }
	        }
	        System.out.println("Sum of two matrices is: ");
	        for(int[] row : sum) {
	            for (int column : row) {
	                System.out.print(column + "    ");
	            }
	            System.out.println();
	        }
	    }
	}