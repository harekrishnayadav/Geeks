package com.ds.sortng;

public class InsertionSort {

	public static void main(String[] args) {
		InsertionSort is = new InsertionSort();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		is.insertionSort(arr);
		is.print(arr);

	}

	void insertionSort(int[] arr) {
		for (int i =1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {

				arr[j + 1] = arr[j];
				j = j - 1;
			}

			arr[j + 1] = key;

		}

	}

	void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("insertion:" + arr[i]);

		}
	}

}
