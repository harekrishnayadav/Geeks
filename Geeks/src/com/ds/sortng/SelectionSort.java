package com.ds.sortng;

public class SelectionSort {

	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		int arr[] = { 64, 25, 12, 22, 11 };

		ss.sort(arr);
		ss.print(arr);

	}

	public void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) 
				if (arr[j] < arr[min])
					min = j;

			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;

		}

	}

}
