package com.anagram;

public class Pattern9 {

	public static void main(String[] args) {

		int n = 7;
		for (int i = 0; i < n; i++) {
			for (int j = 7 - i; j > 0; j--) {
				System.out.print(j + " ");

			}
			System.out.println();

		}
	}

}
