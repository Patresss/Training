package com.patres.training.kata.fibonacci;

public class FibonacciRecursion {

	public int getFibonacciSeries(int number) {
		if (number <= 0) {
			throw new IllegalArgumentException("Number must me bigger than 0");
		}
		if (number == 1 || number == 2) {
			return 1;
		}
		return getFibonacciSeries(number - 1) + getFibonacciSeries(number - 2);
	}

}
