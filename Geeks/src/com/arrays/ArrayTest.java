package com.arrays;

public class ArrayTest {

	public static void main(String[] args) {
		int arr[] = { 10, 7, 9, 2, 8, 3, 5, 4, 6, 1 };

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (i != (arr[i] - 1)) {
				int temp = arr[i];
				arr[i] = arr[arr[i] - 1];
				arr[arr[i] - 1] = temp;
			}

		}
		for (int i : arr) {
			System.out.print(i+" ");
			
		}

	}

}
