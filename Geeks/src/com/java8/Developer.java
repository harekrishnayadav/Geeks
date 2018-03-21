package com.java8;

import java.math.BigDecimal;

public class Developer {
	private int devId;
	private String devName;
	private BigDecimal sal;
	private int age;

	public Developer(int devId, String devName, BigDecimal sal, int age) {

		this.devId = devId;
		this.devName = devName;
		this.sal = sal;
		this.age = age;
	}

	public int getDevId() {
		return devId;
	}

	public String getDevName() {
		return devName;
	}

	public BigDecimal getSal() {
		return sal;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Developer [devId=" + devId + ", devName=" + devName + ", sal=" + sal + ", age=" + age + "]";
	}

}
