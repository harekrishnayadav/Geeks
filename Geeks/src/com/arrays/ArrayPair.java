package com.arrays;

import java.util.Scanner;

public class ArrayPair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int x = sc.nextInt();
		int arr[] = { 10, 20, 9, 40 };
		pair(arr, x);
		int Result = pair(arr, x);
		if (Result == 1) {
			System.out.print("Yes");

		} else {
			System.out.print("No");
		}

	}

	static int pair(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			for (int j =i+1; j < arr.length; j++) {
				if(arr[i]*arr[j]==x)
					return 1;
			}
			
		}
		return -1;
		

	}
	

}
