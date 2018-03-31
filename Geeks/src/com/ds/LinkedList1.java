package com.ds;

public class LinkedList1 {
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {

			this.data = data;
			this.next = null;
		}

	}

	public void Display(Node head) {
		if (head == null) {
			return;
		}
		Node current = head;
		int cout = 0;
		while (current != null) {
			System.out.print(current.data + "--->");
			cout++;
			current = current.next;
		}
		System.out.print(current);
		System.out.println();
		System.out.println("Length:" + cout);

	}

	public Node InsertAtBeginning(Node head, int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		return head;

	}

	public Node InsertAtEnd(Node head, int data) {
		Node newNode = new Node(data);
		if (head == null) {
			return newNode;
		}
		Node current = head;
		while (null != current.next) {
			current = current.next;
		}
		current.next = newNode;
		return head;

	}

	public void InsetAfter(Node previous, int data) {
		Node newNode = new Node(data);
		if (previous == null) {
			return;
		}

		newNode.next = previous.next;
		previous.next = newNode;
	}

	public static void main(String[] args) {
		LinkedList1 list = new LinkedList1();
		Node head = new Node(15);
		Node node1 = new Node(20);
		Node node2 = new Node(30);
		Node node3 = new Node(40);
		Node node4 = new Node(50);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		list.Display(head);
		Node newNode = list.InsertAtBeginning(head, 10);
		list.Display(newNode);

		Node newNode1 = list.InsertAtEnd(head, 60);
		list.Display(newNode1);
		list.InsetAfter(node2, 17);
		list.Display(head);
	}

	

}
