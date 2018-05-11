package com.strings;

public class StringCheck {

	public static void main(String[] args) {
		String s[] = { "Hello", "world", "HELLO", "WORLD" };
		String s1 = "";
		for (int i = 0; i < s.length; i++) {
			s1 = s1 + " " + s[i].toLowerCase();

		}
		System.out.println(s1);
		
	}

}
