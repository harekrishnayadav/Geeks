package com.arrays;

public class LeftRotationArray1 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		int d = 2;
		rotation(arr, n, d);
		Print(arr);

	}

	static void rotation(int[] arr, int d, int n) {
		reverseArray(arr, 0, d - 1);
		reverseArray(arr, d, n - 1);
		reverseArray(arr, 0, n - 1);

	}

	static void Print(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	static void reverseArray(int[] arr, int start, int end) {
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

}
