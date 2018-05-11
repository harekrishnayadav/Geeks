package com.arrays;

public class SortArray {

	public static void main(String[] args) {
		int arr[] = { 10, 7, 9, 3, 5, 2, 6, 8, 1, 4 };
		for (int i : arr) {
			System.out.print(i + " ");

		}
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			while (i != (arr[i] - 1) ) {
				int temp = arr[i];
				arr[i] = arr[arr[i] - 1];
				arr[arr[i] - 1] = temp;

			}

		}
		System.out.println("output:");
		for (int i : arr) {
			System.out.print(i + " ");

		}

	}

}
