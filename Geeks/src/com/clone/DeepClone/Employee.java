package com.clone.DeepClone;

public class Employee implements Cloneable {
	int empid;
	String name;
	Address s = new Address(1, "abc", "bcc");

	public Employee clone() throws CloneNotSupportedException {
		return (Employee) super.clone();

	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e = new Employee();
		Employee e1 = e.clone();
		System.out.println(e == e1);

	}

}
