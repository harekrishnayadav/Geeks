package com.anagram;

public class ArrayTest2 {

	public static void main(String[] args) {
		int a[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		int[] b = new int[a.length - 1];
		b = a;
		b[0]++;
		System.out.println("A:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("B:");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

	}

}
