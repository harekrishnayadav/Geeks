package com.anagram;

public class Non_RepeatedElement {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, 8, 3, 5, 2, };
		int n = arr.length;
		int non = non_repeated(arr, n);
		System.out.println(non);

	}

	static int non_repeated(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			int j;
			for (j = 0; j < arr.length; j++)
				if (arr[i] == arr[j] && i != j)

					break;
			if (j == n)
				return arr[i];

		}
		return -1;
	}

}
