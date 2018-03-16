package com.thread.sysnch;

public class ThreadSend extends Thread {
	private String msg;
	private Thread t;
	Sender sender;

	public ThreadSend(String m, Sender obj) {

		msg = m;

		sender = obj;

	}

	public void run() {
		synchronized (sender) {
			sender.send(msg);
		}
	}

}
