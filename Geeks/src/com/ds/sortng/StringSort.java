package com.ds.sortng;

import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
		String str = "hare krishna yadav";
		System.out.println(str);
		String str1 = str.replaceAll("\\s", "");
		char[] c = str1.toCharArray();
		for (char d : c) {
			System.out.print(d);
		}

	}

}
