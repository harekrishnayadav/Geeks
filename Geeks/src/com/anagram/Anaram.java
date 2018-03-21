package com.anagram;

import java.util.Arrays;

public class Anaram {

	public static void main(String[] args) {
		isAnagram("Mother in law", "hitler woman");
		isAnagram("enjoy", "joy");

	}

	static void isAnagram(String str1, String str2) {
		String CopyOfStr1 = str1.replaceAll("\\s", "").toLowerCase();
		String CopyOfStr2 = str2.replaceAll("\\s", "").toLowerCase();

		System.out.println(CopyOfStr1+" "+CopyOfStr2);
		boolean status = true;
		if (CopyOfStr1.length() != CopyOfStr2.length()) {
			status = false;
		} else {
			char[] ch1 = CopyOfStr1.toCharArray();
			char[] ch2 = CopyOfStr2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			status = Arrays.equals(ch1, ch2);
		}
		if (status) {
			System.out.println(str1 + " and " + str2 + " are anagram:");
		} else {
			System.out.println(str1 + " and " + str2 + " are  not anagram:");
		}
	}

}
