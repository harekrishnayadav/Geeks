package com.inner;

public class OuterClassAccessingInstanceArea {
	class InnerClass {
		public void m1() {
			System.out.println("inner class");
		}
	}

	public void m2() {
		InnerClass i = new InnerClass();
		System.out.println("instance Method");
		i.m1();
	}

	public static void main(String[] args) {
		OuterClassAccessingInstanceArea O = new OuterClassAccessingInstanceArea();
		System.out.println("outer area");
		O.m2();

	}

}
