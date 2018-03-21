package com.java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WithoutLambda {

	public static void main(String[] args) {
		List<Developer> listDev = getDeveloper();
		System.out.println("Before sort:");
		for (Developer developer : listDev) {
			System.out.println(developer);

		}

		/*
		 * Collections.sort(listDev, new Comparator<Developer>() { public int
		 * compare(Developer d1, Developer d2) { return d1.getAge() -
		 * d2.getAge(); } });
		 */
		listDev.sort((Developer o1, Developer o2) -> o1.getAge() - o2.getAge());
		listDev.forEach((developer) -> System.out.println(developer));
		System.out.println("After sort:");
		/*
		 * for (Developer developer : listDev) { System.out.println(developer);
		 * 
		 * }
		 */

	}

	private static List<Developer> getDeveloper() {
		List<Developer> result = new ArrayList<Developer>();
		result.add(new Developer(1, "Sujeet", new BigDecimal("7000"), 33));
		result.add(new Developer(2, "Raj", new BigDecimal("7000"), 24));
		result.add(new Developer(3, "Archana", new BigDecimal("7000"), 20));
		result.add(new Developer(4, "Bishekha", new BigDecimal("7000"), 27));
		return result;
	}

}
