package com.anagram;

public class Pattern8 {

	public static void main(String[] args) {
		int n = 7;
		for (int i = 0; i < n; i++) {
			for (int j = 7; j >= 7 - i; j--) {
				System.out.print(j+" ");

			}
			System.out.println();

		}

	}

}
