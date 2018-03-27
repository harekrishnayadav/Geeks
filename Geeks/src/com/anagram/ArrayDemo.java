package com.anagram;

public class ArrayDemo {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int i = 0;
		System.out.print("{");
		while (i < arr.length) {

			System.out.print(arr[i]);
			i++;
			if (i < arr.length)
				System.out.print(",");
		}
		System.out.print("}");

	}

}
