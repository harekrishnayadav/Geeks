package com.strings;

import java.util.LinkedHashSet;

public class RemoveDuplicate {

	
	
	public static void main(String[] args) {
		String str="SpoorsTechnogies";
		RemoveDuplicate r=new RemoveDuplicate();
		r.duplicate( str);

	}

	 void duplicate(String str) {
		LinkedHashSet< Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
			
		}
		for (Character character : set) {
			System.out.print(character);
			
		}
	}
	 

}
