package com.java8;

import java.math.BigDecimal;

public class Employee {
	private int empId;
	private String empName;
	private String enpAdd;
	private BigDecimal empSalary;
	private int empAge;

	public Employee(int empId, String empName, String enpAdd, BigDecimal empSalary, int empAge) {

		this.empId = empId;
		this.empName = empName;
		this.enpAdd = enpAdd;
		this.empSalary = empSalary;
		this.empAge = empAge;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEnpAdd() {
		return enpAdd;
	}

	public void setEnpAdd(String enpAdd) {
		this.enpAdd = enpAdd;
	}

	public BigDecimal getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(BigDecimal empSalary) {
		this.empSalary = empSalary;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", enpAdd=" + enpAdd + ", empSalary=" + empSalary
				+ ", empAge=" + empAge + "]";
	}

}
