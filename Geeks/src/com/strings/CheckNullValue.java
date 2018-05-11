package com.strings;

public class CheckNullValue {

	public static void main(String[] args) {
		String s = "a";
		String s7 = "a";
		System.out.println(s.equalsIgnoreCase(null));
		System.out.println(s == s7);

		System.out.println(s.equals(s7));
		String s1 = new String("a");
		String s2 = new String("a");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		String s3 = "b";
		String s4 = "b";
		String s5 = new String(s3);
		String s6 = new String(s4);
		CheckNullValue c = new CheckNullValue();
		System.out.println(c.equals(s));

		// System.out.println("s1:" + s1.hashCode() + " " + "s2:" +
		// s2.hashCode());
		// System.out.println("s1:" + System.identityHashCode(s1) + " " + "s2:"
		// + System.identityHashCode(s2));
		System.out.println("s3:" + s5.hashCode() + " " + "s4:" + s6.hashCode());
	}

}
