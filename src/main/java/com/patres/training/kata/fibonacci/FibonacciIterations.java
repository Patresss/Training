package com.patres.training.kata.fibonacci;

public class FibonacciIterations {

	public static int getFibonacciSeries(int number) {
		int previousNumber = 1;
		int currentNumber = 1;

		if (number <= 0) {
			throw new IllegalArgumentException("Number must me bigger than 0");
		}
		if (number == 1 || number == 2) {
			return 1;
		}

		for (int i = 3; i <= number; i++) {
			int temp = previousNumber + currentNumber;
			previousNumber = currentNumber;
			currentNumber = temp;
		}
		return currentNumber;
	}

}
