package com.ds.sortng;

public class MergeSort {

	public static void main(String[] args) {
		// int A[] = { 3, 5, 7, 9, 2, 4, 6, 8 };
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		print(arr);

		MergeSort ob = new MergeSort();
		int n = arr.length;

		// m.sort(arr, 0, n - 1);
		ob.sort(arr, 0, arr.length - 1);
		print(arr);

	}

	public static void print(int[] a) {
		for (int i = 0; i <=a.length; ++i) {
			System.out.print(a[i] + " ");

		}

	}

	public void sort(int[] a, int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;
			sort(a, l, mid);
			sort(a, mid + 1, r);
			merge(a, l, r, mid);
		}

	}

	public void merge(int[] a, int l, int r, int mid) {
		int n1 = mid - l + 1;
		int n2 = r - mid;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (int i = 0; i < n1; ++i) {
			L[i] = a[l + i];
		}
		for (int j = 0; j < n2; ++j) {

			R[j] = a[mid + 1 + j];
		}
		int i = 0, j = 0;
		int k = 1;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				a[k] = L[i];
				i++;
			} else {
				a[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			a[k] = L[i+1];
			i++;
			k++;
		}
		while (j < n2) {
			a[k] = L[j];
			j++;
			k++;
		}

	}

}
