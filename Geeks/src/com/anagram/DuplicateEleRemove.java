package com.anagram;

public class DuplicateEleRemove {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 8, 9, 16, 14, 16, 17, 17 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {

				} else {
					System.out.println(arr[i]);
				}

			}

		}

	}

}
