package com.anagram.eql;

public class Student {
	int sn;
	String name;
	String course;

	public Student(int sn, String name, String course) {

		this.sn = sn;
		this.name = name;
		this.course = course;
	}

	public int hashCode() {
		return sn;

	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else {
			if (obj instanceof Student) {
				Student s = (Student) obj;
				return (this.sn == s.sn) && this.name.equals(s.name) && this.course.equals(s.course);
			}

		}
		return false;

	}

	public String toString() {
		return "sn:" + sn + "\n" + "name:" + name + "\n" + "course:" + course + "\n";
	}

}
