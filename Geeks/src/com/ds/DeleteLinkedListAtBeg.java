package com.ds;

import com.ds.LinkedList1.Node;

public class DeleteLinkedListAtBeg {

	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {

			this.data = data;
			this.next = null;
		}

	}

	private void display(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}

		System.out.println(current);

	}

	Node delete(Node head) {

		if (head == null) {
			return head;
		}
		Node temp = head;
		head = head.next;
		temp.next = null;

		return temp;

	}

	public static void main(String[] args) {
		DeleteLinkedListAtBeg list = new DeleteLinkedListAtBeg();
		Node head = new Node(20);

		Node node1 = new Node(10);
		Node node2 = new Node(14);
		Node node3 = new Node(13);
		Node node4 = new Node(17);
		Node node5 = new Node(12);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		list.display(head);
		list.delete(head);
		Node first = list.delete(head);
		System.out.println(first.data);
	
		//list.display();

	}

}
