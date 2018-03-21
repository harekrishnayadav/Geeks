package com.java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WithLambda {

	public static void main(String[] args) {
		List<Developer> listDev = getDevoloper();
		System.out.println("sort by age:");
		listDev.sort((Developer o1, Developer o2) -> o1.getAge() - o2.getAge());
		listDev.forEach((developer) -> System.out.println(developer));
		System.out.println("sort by name:");
		listDev.sort((o1, o2) -> o1.getDevName().compareTo(o2.getDevName()));
		listDev.forEach((developer) -> System.out.println(developer));
		System.out.println("By sal");
		listDev.sort((o1, o2) -> o1.getSal().compareTo(o2.getSal()));
		listDev.forEach((developer) -> System.out.println(developer));
		System.out.println("sal");
		Comparator<Developer> salary = (o1, o2) -> o1.getSal().compareTo(o2.getSal());
		listDev.sort(salary);
		System.out.println("reverse:");
		listDev.sort(salary.reversed());

	}

	private static List<Developer> getDevoloper() {
		List<Developer> result = new ArrayList<Developer>();
		result.add(new Developer(1, "Sujeet", new BigDecimal("7000"), 33));
		result.add(new Developer(2, "Raj", new BigDecimal("7000"), 24));
		result.add(new Developer(3, "Archana", new BigDecimal("7000"), 20));
		result.add(new Developer(4, "Bishekha", new BigDecimal("7000"), 27));
		return result;
	}

}
