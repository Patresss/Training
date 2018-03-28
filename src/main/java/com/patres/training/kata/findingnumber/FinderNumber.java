package com.patres.training.kata.findingnumber;

public class FinderNumber {

	private int[] numberArray;
	private int sizeOfAllNumber;

	public FinderNumber(int[] numberArray) {
		this.numberArray = numberArray;
		this.sizeOfAllNumber = numberArray.length + 1;
	}

	public int find() {
		int expectedSum = calculateSumOfNumber();
		int currentSum = sumOfArray();
		return expectedSum - currentSum;
	}

	private int calculateSumOfNumber() {
		return (sizeOfAllNumber + 1) * sizeOfAllNumber / 2;
	}

	private int sumOfArray() {
		int sum = 0;
		for (int number : numberArray) {
			sum += number;
		}
		return sum;
	}
}
