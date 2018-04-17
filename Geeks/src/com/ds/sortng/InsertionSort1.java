package com.ds.sortng;

import java.util.Scanner;

public class InsertionSort1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int a[] = new int[s];
		for (int i = 0; i < s; i++) {
			a[i] = sc.nextInt();
		}
		int i = s - 2;
		int key = a[s - 1];
		while (i >= 0 && a[i] > key) {
			a[i + 1] = a[i];
			i--;
			printArray(a);
		}
		a[i + 1] = key;
		printArray(a);
	}

	private static void printArray(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");

		}
		System.out.println();
	}

}
