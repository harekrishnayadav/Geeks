package com.anagram;

public class TwoSum1 {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 7, 11, 15 };
		int target = 9;
		int i = 0, j = arr.length - 1;
		while (i < j) {
			if (arr[i] + arr[j] == target) {
				System.out.println(arr[i] + " " + arr[j]);
				i++;
			}
			if (arr[i] + arr[j] < target) {
				i++;

			}
			if (arr[i] + arr[j] > target) {
				j--;

			}

		}

	}

}
