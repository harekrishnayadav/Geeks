package com.strings;

public class CheckArraySame {

	public static void main(String[] args) {
		int[] s1 = { 2, 3, 4, 5, 6 };
		int[] s2 = { 2, 3, 4, 5, 6 };
		boolean TrueOrNo = true;
		if (s1.length == s2.length) {
			for (int i = 0; i < s2.length; i++) {
				if (s1[i] != s2[i]) {
					TrueOrNo = false;
				}

			}
		} else {
			TrueOrNo = false;
		}
		if (TrueOrNo) {
			System.out.println("Array is equal:");
		} else {
			System.out.println("Array is not equal:");
		}
	}

}
