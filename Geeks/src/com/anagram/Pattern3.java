package com.anagram;

public class Pattern3 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 5 - i; j > 0; j--) {
			
				System.out.print(" " + j);

			}
			System.out.println(" ");

		}

	}

}
