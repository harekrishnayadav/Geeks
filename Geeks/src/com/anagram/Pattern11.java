package com.anagram;

public class Pattern11 {

	public static void main(String[] args) {
		int n = 7;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");

			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j + " ");

			}
			System.out.println();

		}

	}

}
