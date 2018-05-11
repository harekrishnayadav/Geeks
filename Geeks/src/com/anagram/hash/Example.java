package com.anagram.hash;

public class Example {
	private int x;

	public Example(int x) {

		this.x = x;

	}

	public int hashCode() {
		return x;

	}

	public int JVMHASHc() {
		return super.hashCode();

	}

	public static void main(String[] args) {
		Example e = new Example(5);
		System.out.println("hashCode:" + e.hashCode());
		System.out.println("identityHashCode:" + System.identityHashCode(e));
		System.out.println("superHashCode:" + e.JVMHASHc());

	}

}
