package com.ds.sortng;

public class BubbleSort {

	void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}

	}

	private void printBubble(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("BubbleSort:" + arr[i]+" ");

		}

	}

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		bs.bubbleSort(arr);
		bs.printBubble(arr);

	}

}
