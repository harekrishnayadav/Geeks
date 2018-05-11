package com.arrays;

public class RotationArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		int d = 2;
		leftRotation(arr, n, d);
		display(arr,n);

	}

	static void display(int[] arr, int n) {
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
		
	}
		
	}

	static void leftRotation(int[] arr, int n, int d) {
		for (int i = 0; i < d; i++) {
			leftRotationOne(arr, n);

		}

	}

	static void leftRotationOne(int[] arr, int n) {
		int i, temp = arr[0];
		for (i = 0; i < arr.length - 1; i++)
			arr[i] = arr[i + 1];
		arr[i] = temp;

	}

}
