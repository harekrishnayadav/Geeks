package com.thread.sysnch;

public class TestClass {

	public static void main(String[] args) {
		Sender snd = new Sender();
		ThreadSend t1 = new ThreadSend("hi    ", snd);
		ThreadSend t2 = new ThreadSend("bye   ", snd);
		t1.start();
		t2.start();
		try {
			t1.join();
			t1.join();
		} catch (Exception e) {
			System.out.println("interrupted.");
		}

	}

}
