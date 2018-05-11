package com.anagram;

import java.util.Arrays;

public class StringArrayTest {

	public static void main(String[] args) {
		String exmpl = new String("I Love Java Programming");
		String[] parts = exmpl.split("\\s+");
		Arrays.sort(parts);
		StringBuilder sb = new StringBuilder();
		for (String s : parts) {
			sb.append(s);
			sb.append(" ");
			System.out.println(sb);
		}
		 String sorted = sb.toString.trim();

	}

}
