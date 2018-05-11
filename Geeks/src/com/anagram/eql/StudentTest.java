package com.anagram.eql;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student(2, "Ravi", "MCA");
		Student s1 = new Student(2, "Ravi", "MCA");
		System.out.println(s.getClass());

		if (s.hashCode() == s1.hashCode()) {
			if (s.equals(s1)) {
				System.out.println("both object are equal");
			} else {
				System.out.println("both object are not equal");
			}
		} else {
			System.out.println("both object are not equal");

		}

	}

}
