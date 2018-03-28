package com.patres.training.sort;

public class QuickSort {

	private int array[];

	public QuickSort(int[] array) {
		this.array = array;
	}

	public void sort() {
		if (array != null && array.length != 0) {
			quickSort(0, array.length - 1);
		}
	}

	private void quickSort(int leftIndex, int rightIndex) {
		int currentLeftIndex = leftIndex;
		int currentRightIndex = rightIndex;
		int pivot = getPivotAsMiddleIndex(leftIndex, rightIndex);

		while (currentLeftIndex <= currentRightIndex) {
			while (array[currentLeftIndex] < pivot) {
				currentLeftIndex++;
			}
			while (array[currentRightIndex] > pivot) {
				currentRightIndex--;
			}

			if (currentLeftIndex <= currentRightIndex) {
				swap(currentLeftIndex, currentRightIndex);
				currentLeftIndex++;
				currentRightIndex--;
			}
		}

		if (leftIndex < currentRightIndex) {
			quickSort(leftIndex, currentRightIndex);
		}
		if (currentLeftIndex < rightIndex) {
			quickSort(currentLeftIndex, rightIndex);
		}
	}

	private void swap(int a, int b) {
		if (array[a] != array[b]) {
			array[a] ^= array[b];
			array[b] ^= array[a];
			array[a] ^= array[b];
		}
	}

	private int getPivotAsMiddleIndex(int leftIndex, int rightIndex) {
		return array[leftIndex + (rightIndex - leftIndex) / 2];
	}

}
