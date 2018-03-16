package com.strings;

public class ReverseString {

	public static void main(String[] args) {
		String str = "SpoorsTechnogies";
		System.out.println("OriginalString:" + str);
		System.out.println("ReverseString:" + ReverseStroing(str));

	}

	static String ReverseStroing(String str) {
		char[] ch = str.toCharArray();
		char Temp = 0;

		for (int i = 0, j = ch.length - 1; i <= (ch.length) / 2; i++, j--) {
			Temp = ch[i];
			ch[i] = ch[j];
			ch[j] = Temp;
		}
		return new String(ch);
	}

}
