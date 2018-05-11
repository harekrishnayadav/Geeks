package com.clone;

public class Employee{
	int id;
	String name;
	String Add;
	public Employee(int id, String name, String add) {
		
		this.id = id;
		this.name = name;
		Add = add;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Add=" + Add + "]";
	}
	
	

}
