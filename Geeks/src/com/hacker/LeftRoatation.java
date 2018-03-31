package com.hacker;

import java.util.Scanner;

public class LeftRoatation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int numRotation = sc.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
			System.out.println("arr:" + array[i]);

		}

	}

}
