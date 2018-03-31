package com.anagram;

import java.util.HashSet;

public class SubStringWithoutRepeated {
	public static void main(String[] args) {
		String str = "pwwkew";
		System.out.println("SubString:" + lenghtOfLongestSubS(str));

	}

	static HashSet<Character> lenghtOfLongestSubS(String str) {
		int MaxLenth = 0;
		HashSet<Character> set = new HashSet<>();
		int i = 0;
		int j = 0;
		while (j < str.length()) {
			if (!set.contains(str.charAt(j))) {
				set.add(str.charAt(j));
				j++;
				MaxLenth = Math.max(MaxLenth, j - i);
			} else {
				set.remove(str.charAt(i));
				i++;
			}
			
		}
		return set;

	}
}
