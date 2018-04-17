package com.anagram;

public class Pattern17 {

	public static void main(String[] args) {
		int n = 5;
		int x = 0;

		for (int i = 1; i <= n; i++) {
			int y = i;
			if (y % 2 == 0) {
				x = x + i - 1;
			} else {
				x = x + i;
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				if (y % 2 == 0) {
					if (j % 2 == 0) {
						System.out.print("*");
					} else {
						System.out.print(x);
						x--;
					}
				} else if (j % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(x);
					x++;
				}

			}
			System.out.println();

		}

	}

}
