package com.strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		String str = "sujeetkumar";
		Set<Character> set = new LinkedHashSet<Character>();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			set.add(c);
			// System.out.println(set);

		}
		// System.out.println(set);
		StringBuilder sb = new StringBuilder();
		for (char s : set) {
			sb.append(s);

		}
		System.out.println(sb.toString());

	}

}
