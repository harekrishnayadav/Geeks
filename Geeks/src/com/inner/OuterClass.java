package com.inner;

public class OuterClass {
	int x = 10;
	static int y = 20;

	class InnerClass {
		private void m1() {
			System.out.println("inner class:" + x + " " + y);

		}
	}

	public static void main(String[] args) {
		System.out.println("outer inner class");
		OuterClass O = new OuterClass();
		OuterClass.InnerClass i = O.new InnerClass();
		i.m1();

	}

}
