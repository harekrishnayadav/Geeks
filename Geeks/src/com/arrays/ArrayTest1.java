package com.arrays;

public class ArrayTest1 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		shift(arr);

	}

	static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}

	static void shift(int[] arr) {
		int k = 0;
		int z = 0;
		int n = arr.length;
		for (int j = 0; j < arr.length; j++) {

			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];

			}
			arr[z] = arr.length-j;
			print(arr);
			System.out.println();
		}

	}

}
