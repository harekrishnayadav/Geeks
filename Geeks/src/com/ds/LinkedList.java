package com.ds;

public class LinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {

			this.data = data;
			this.next = null;
		}

	}

	private void Display() {
		Node Current = head;
		while (Current != null) {
			System.out.print(Current.data + "--->");
			Current = Current.next;
		}
		System.out.print(Current);

	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node(15);
		Node Second = new Node(20);
		Node Third = new Node(25);
		list.head.next = Second;
		Second.next = Third;
		list.Display();

	}

}
