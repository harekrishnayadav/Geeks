package com.anagram;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value:");
		int n = sc.nextInt();

		int k = 1;
		for (int i = 1; i <=n ; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(k++ + " ");

			}
			System.out.println();

		}

	}

}
