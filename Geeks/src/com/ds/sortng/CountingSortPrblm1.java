package com.ds.sortng;

public class CountingSortPrblm1 {
	public static void main(String[] args) {
		int[] a = { 5, 7, 3, 9, 7, 5, 3, 9, 7, 3 };
		System.out.println("input values:\n");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("copy values a[] to b[]\n");
		int[] b = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];

		}
		for (int i : b) {
			System.out.print(b[i]+" ");
			
		}
	}
}
