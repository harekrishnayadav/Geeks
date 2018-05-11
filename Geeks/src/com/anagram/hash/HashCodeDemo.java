package com.anagram.hash;

public class HashCodeDemo {
	int x = 20;
	int y = 30;

	public int hashCode() {
		return x + y;

	}

	public static void main(String[] args) {
		HashCodeDemo h1 = new HashCodeDemo();
		HashCodeDemo h2 = new HashCodeDemo();
		System.out.println("h1:" + h1.hashCode()  +"     "       +"h2:" + h2.hashCode());

	}

}
