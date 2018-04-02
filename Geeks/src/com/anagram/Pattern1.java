package com.anagram;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		int n=10;
		int z = 1;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= z; j++) {
				System.out.print(j);
				z++;

			}

		}

	}

}
