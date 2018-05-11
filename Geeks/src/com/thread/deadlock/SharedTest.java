package com.thread.deadlock;

public class SharedTest {

	public static void main(String[] args) {
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		Thread t1 = new Thread() {

			public void run() {

				s1.MethodOne(s2);

			}

		};
		Thread t2 = new Thread() {
			public void run() {

				s2.MethodOne(s1);

			}

		};
		t1.start();

		t2.start();

	}

}
