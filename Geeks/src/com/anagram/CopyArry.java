package com.anagram;

public class CopyArry {

	public static void main(String[] args) {
		int A[] = { 3, 5, 7, 9, 2, 4, 6, 8 };
		int n = A.length;
		divide(A, 0, n - 1);

	}

	public static void divide(int[] a, int l, int r) {
		int m = (l + r) / 2;
		int n1 = m - l + 1;
		int n2 = r - m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (int i = 0; i < n1; ++i) {

			L[i] = a[l+i];
			System.out.println("l:" + L[i]);
		}
		for (int j = 0; j < n2; ++j) {
			R[j] = a[m+1+j];
			System.out.println("r:" + R[j]);
		}

	}

}
