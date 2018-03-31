package com.inner;

public class MethodInnerClass {
	int x = 10;
	static int y = 20;

	public void m1() {
		
		class InnerClass {
			public void m2() {
				System.out.println(x + " " + y);
			}
		}
		InnerClass i = new InnerClass();
		System.out.println("inner Method");
		i.m2();
	}

	public static void main(String[] args) {
		System.out.println("outerClass");
		MethodInnerClass o = new MethodInnerClass();
		o.m1();

	}

}
