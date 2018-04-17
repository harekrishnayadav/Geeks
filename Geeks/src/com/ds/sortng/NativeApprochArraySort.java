package com.ds.sortng;

public class NativeApprochArraySort {

	public static void main(String[] args) {
		int arr[] = { 10, 7, 9, 2, 8, 3, 5, 4, 6, 1 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		sort(arr);
		// printArray(arr);

	}

	/*
	 * static void printArray(int[] arr) { for (int i = 0; i < arr.length; i++)
	 * { System.out.print(arr[i] + " ");
	 * 
	 * }
	 * 
	 * }
	 */

	static void sort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			while (i != (arr[i] - 1)) {
				int temp = arr[i];
				System.out.print(arr[i] + " ");
				arr[i] = arr[arr[i] - 1];
				arr[arr[i] - 1] = temp;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}

}
