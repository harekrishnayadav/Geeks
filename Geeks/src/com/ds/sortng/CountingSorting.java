package com.ds.sortng;

public class CountingSorting {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		System.out.println("input array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		CountingSorting c = new CountingSorting();

		c.sorting(arr);

	}

	void sorting(int[] arr) {
		int n = arr.length;

		int k = 3;
		int b[] = new int[n + 1];

		int c[] = new int[k];
		for (int i = 0; i < k; i++) {
			c[i] = 0;

		}
		for (int i = 0; i < n; i++) {
			c[arr[i]] = c[arr[i]] + 1;

		}
		for (int i = 1; i < k; i++) {
			c[i] = c[i] + c[i - 1];

		}
		for (int i = arr.length - 1; i >= 0; --i) {

			b[c[arr[i]] - 1] = arr[i];
			c[arr[i]] = c[arr[i]] - 1;

		}
		System.out.println();
		System.out.println("sorted array");
		for (int i = 0; i < n; i++) {
			System.out.print(b[i] + " ");

		}

	}

}
