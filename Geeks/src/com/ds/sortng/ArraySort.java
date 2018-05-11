package com.ds.sortng;

public class ArraySort {

	public static void main(String[] args) {
		int arr[] = { 10, 7, 9, 2, 8, 3, 5, 4, 6, 1 };
		int[] a = new int[arr.length];

		for (int j : a) {

			arr[j-1] = j;

		}
		for (int i : a) {
			System.out.print(i + " ");

		}

	}

}
