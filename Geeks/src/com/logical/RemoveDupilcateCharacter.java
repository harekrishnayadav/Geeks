package com.logical;

public class RemoveDupilcateCharacter {

	public static void main(String[] args) {
		String str = "SpoorTechnogies";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if ((ch[i]== ch[j]) && (i != j)) {
					System.out.print(ch[j] + " ");
				}

			}

		}

	}

}
