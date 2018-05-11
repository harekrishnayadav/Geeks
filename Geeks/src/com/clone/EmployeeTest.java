package com.clone;

public class EmployeeTest implements Cloneable {
        Employee e=new Employee(1, "Sujeet", "patna");
	public static void main(String[] args) throws CloneNotSupportedException {
		EmployeeTest t=new EmployeeTest();
		System.out.println(t.e);
		EmployeeTest t1=(EmployeeTest) t.clone();
		System.out.println(t1.e);
		System.out.println(t.e==t1.e);
		

	}

}
