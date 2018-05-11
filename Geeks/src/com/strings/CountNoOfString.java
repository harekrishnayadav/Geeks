package com.strings;

public class CountNoOfString {

	public static void main(String[] args) {
		String s[] = { "HELLO", "World", "Hello", "WORLD" };
		int count1 = 1;
		int count2 = 1;

		String s1 = "";
		for (int i = 0; i < s.length; i++) {
			s1 = s[i].toLowerCase();
			char[] ch = s1.toCharArray();
			for (int j = i + 1; j < s.length; j++) {
				if (ch[i] == ch[j]) {
					count1++;

				} 

			}

		}
		

	}

}
