package com.thread.sysnch;

public class Sender {
	public void send(String msg) {
		System.out.println("Sending\t" + msg);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Thread Interrupated.");
		}
		System.out.println("\n" + msg + "sent");
	}

}
