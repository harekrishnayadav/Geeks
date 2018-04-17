package com.anagram;

public class ArrayTest1 {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		ArrayTest1 t = new ArrayTest1();
		t.print(arr);

	}

	void print(int[] arr) {
		int k = 3;
		int n = arr.length;
		int[] b = new int[n - 1];

		int[] c = new int[k];
		for (int i = 0; i < k; i++) {
			c[i] = 0;

		}
		for (int i = 0; i < k; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println(",");
		for (int i = 0; i < n; i++) {

			System.out.print(arr[i] + " ");
		}

		for (int i = n - 1; i > 0; --i) {
			b[i] = arr[i];

		}

	}

}
