package com.hacker;

import java.util.Scanner;

public class StringProblem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for (int j = 0; j < n; j++) {

			String s = sc.nextLine();

			char[] ch = s.toCharArray();

			for (int i = 0; i < ch.length; i++) {
				if (i % 2 == 0) {
					System.out.print(ch[i]);

				}

			}
			System.out.print(" ");
			for (int i = 0; i < ch.length; i++) {
				if (i % 2 != 0) {
					System.out.print(ch[i]);
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
