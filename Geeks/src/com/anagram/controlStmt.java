package com.anagram;

import java.util.Scanner;

public class controlStmt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		String ans = "";
		if (n % 2 == 0) {
			if (n >= 5 && n <= 6) {
				ans = "Not Weird";
			} else if (n >= 6 && n <= 20) {
				ans = "Weird";

			} else {
				ans = "Not Weird";
			}
		} else {
			ans = "Weird";

		}

		System.out.println(ans);

	}

}
