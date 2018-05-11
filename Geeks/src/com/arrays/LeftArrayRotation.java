package com.arrays;

public class LeftArrayRotation {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		int d = 2;
		reverseArray(arr, d, n);
		Print(arr, d);

	}

	static void Print(int[] arr, int d) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}

	static void reverseArray(int[] arr, int d, int n) {
		for (int i = 0; i < d - 1; i++) {
			int temp = arr[i + 1];
			arr[i + 1] = arr[i];
			arr[i] = temp;

		}
		for (int i = d, j = n - 1; i < j - 1; j--, i++) {
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;

		}
		for (int i = 0, j = n - 1; i < j - 1; j--, i++) {
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;

		}

	}

}
