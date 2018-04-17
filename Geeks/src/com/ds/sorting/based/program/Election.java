package com.ds.sorting.based.program;

import com.sun.xml.internal.ws.api.Cancelable;

public class Election {

	public static void main(String[] args) {
		Election e = new Election();
		int A[] = { 3, 4, 6, 5, 4, 3, 4, 4, 2 };
		e.election(A);

	}

	private static void election(int[] a) {
		int count, MaxCount = 0, Candidate = 0;
		for (int i =0; i < a.length; i++) {
			count = 0;
			for (int j = i + 1; j <= a.length-1 ; j++) {
				if (a[i] == a[j])
					count++;

			}
			if (count > MaxCount) {
				MaxCount = count;
				Candidate =a[i];
				 System.out.println(Candidate);

			}
			

		}

	}

}
