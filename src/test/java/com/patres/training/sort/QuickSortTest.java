package com.patres.training.sort;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;

public class QuickSortTest {

	@Test
	public void quickSortTypicalTest() {
		int[] input = { 2, 3, 3, 1, 66, 44, 2, 3, 0, -12, -2 };
		int[] sortedArray = { -12, -2, 0, 1, 2, 2, 3, 3, 3, 44, 66 };
		QuickSort sorter = new QuickSort(input);
		sorter.sort();
		assertTrue(Arrays.equals(input, sortedArray));
	}

	@Test
	public void quickSortSortedTest() {
		int[] input = { -12, -2, 0, 1, 2, 2, 3, 3, 3, 44, 66 };
		int[] sortedArray = { -12, -2, 0, 1, 2, 2, 3, 3, 3, 44, 66 };
		QuickSort sorter = new QuickSort(input);
		sorter.sort();
		assertTrue(Arrays.equals(input, sortedArray));
	}

	@Test
	public void quickSortRevertedTest() {
		int[] input = { 66, 44, 3, 3, 3, 2, 2, 1, 0, -2, -12 };
		int[] sortedArray = { -12, -2, 0, 1, 2, 2, 3, 3, 3, 44, 66 };
		QuickSort sorter = new QuickSort(input);
		sorter.sort();
		assertTrue(Arrays.equals(input, sortedArray));
	}

	@Test
	public void quickSortEmptyArrayTest() {
		int[] input = {};
		int[] sortedArray = {};
		QuickSort sorter = new QuickSort(input);
		sorter.sort();
		assertTrue(Arrays.equals(input, sortedArray));
	}
}
