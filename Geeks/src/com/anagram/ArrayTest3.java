package com.anagram;

public class ArrayTest3 {

	public static void main(String[] args) {
		int a[] = { 2, 3, 6, 1 };
		int[] b = new int[a.length];
		// Copy elements of a[] to b[]
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		for (int i = b.length - 1; i >= 0; --i) {
			System.out.print(b[i]+" ");

		}

	}

}
