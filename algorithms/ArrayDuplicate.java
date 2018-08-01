package com.nukkadcode.algorithms;

import java.util.Scanner;

public class ArrayDuplicate {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int arraySize = scanner.nextInt();

		int[] A = new int[arraySize];
		
		for (int i = 0; i < arraySize; i++) {
			A[i] = scanner.nextInt();
		}
		
		int[] B = new int[7];
		
		
		findDuplicates(A, B);

		
	}

	private static void findDuplicates(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++)  {
			b[a[i]]++;
		}
		
		printDuplicates(b);
	}

	private static void printDuplicates(int[] b) {
		for (int i = 0; i < b.length; i++) {
			
			if ( b[i] > 1) {
				System.out.println(i);
			}
		}
		
	}
	



	
}
