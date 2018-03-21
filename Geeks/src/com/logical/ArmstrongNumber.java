package com.logical;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int ni = 153;
		while (ni != 0) {
			int r = ni % 10;
			int p = 1;

			for (int i = 0; i < 3; i++) {
				p = p * r;

			}
			System.out.println(p);
			ni = ni / 10;
		}

	}

}
