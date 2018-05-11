package com.clone;

public class CloneDemo implements Cloneable {
	int x = 10;
	int y = 20;

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneDemo c = new CloneDemo();
		System.out.println("Original:" + c.x + " " + c.y);
		CloneDemo c1 = (CloneDemo) c.clone();
		System.out.println("Clone:" + c1.x + " " + c1.y);
		c.x = 30;
		c.y = 40;
		System.out.println(c.x + " " + c.y);
		CloneDemo c2 = new CloneDemo();

		System.out.println(c.hashCode() == c1.hashCode());

	}

}
