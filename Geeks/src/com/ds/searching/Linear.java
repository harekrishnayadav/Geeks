package com.ds.searching;

public class Linear {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 80, 30, 60, 50, 110, 100, 130, 170 };
		int x = 1;
		int n = arr.length;
		Linear ob = new Linear();
		int result = ob.search(arr, n - 1, x);
		if (result == 1) {
			System.out.print("yes");
		} else {
			System.out.print("no");
		}
	}

	private int search(int[] arr, int n, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x)
				return 1;
		}
		return -1;
	}

}
