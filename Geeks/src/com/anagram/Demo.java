package com.anagram;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 4;
		double d = 4.0;
		String s = "Hello World  ";
		System.out.println("Enter value:");
		int i1 = sc.nextInt();
		double d1 = sc.nextDouble();
		String s1 = sc.next();
		       s1+=sc.nextLine();
		
        //String s2=s+s1;
		System.out.println(i + i1);
		System.out.println(d + d1);
		System.out.println(s.concat(s1));
        // System.out.println(s2);
	}
}
