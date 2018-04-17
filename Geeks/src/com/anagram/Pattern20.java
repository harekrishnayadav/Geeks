package com.anagram;

public class Pattern20 {

	public static void main(String[] args) {
		int n = 5, k = 2 * n - 2;
		int p = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(" ");

			}
			k = k - 2;
			for (int j = 1; j <= i; j++) {
				System.out.print(p++ + " ");

			}

			for (int j = 1; j < i; j++) {
				int z = p - i;
				System.out.print(z-- + " ");
				z = z - 1;

			}
			System.out.println();

		}

	}

}
