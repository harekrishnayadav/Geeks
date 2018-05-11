package com.ds.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 80, 30, 60, 50, 110, 120, 130, 170 };
		int x = 110;
		int n = arr.length;
		BinarySearch ob = new BinarySearch();
		int result = ob.binarSearch(arr, 0, n - 1, x);
		if (result == -1) {
			System.out.print("Element is not present:");
		} else {
			System.out.print("Element is present at:" + result);
		}
	}

	int binarSearch(int[] arr, int l, int r, int x) {
		while (l <= r) {
			int m = (l + r) / 2;
			if (arr[m] == x)
				return m;
			if (arr[m] < x) {
				l = m + 1;
			} else {
				r = m - 1;
			}
		}
		return -1;
	}

}
