package com.thread.deadlock;

public class Shared {
	synchronized void MethodOne(Shared s) {
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + " Execoute one thread");
		System.out.println(t.getName() + " Calling MethodTwo");
		s.MethodTwo(this);
		System.out.println(t.getName() + "is finished executing methodOne...");
	}

	synchronized void MethodTwo(Shared s) {
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + " Execoute One thread");
		System.out.println(t.getName() + " Calling MethodOne");
		s.MethodOne(this);
		System.out.println(t.getName() + "is finished executing methodOne...");

	}

}
