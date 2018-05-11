package com.java8;

import java.lang.annotation.Annotation;

public class FuncIntefaceTest {

	public static void main(String[] args) {
		/* MyInterfaces f = new MyInterfaces() { */
		MyInterfaces f = () -> {

			System.out.println("xxx");

		};
		f.myMethod();

	}

}
