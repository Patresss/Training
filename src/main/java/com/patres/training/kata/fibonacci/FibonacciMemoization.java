package com.patres.training.kata.fibonacci;

public class FibonacciMemoization {

	private int fibonacciArray[];

	public int getFibonacciSeries(int number) {
		fibonacciArray = new int[number + 1];
		if (number <= 0) {
			throw new IllegalArgumentException("Number must me bigger than 0");
		}
		return calculateFibonacciSeries(number);
	}

	private int calculateFibonacciSeries(int number) {
		if (number == 1 || number == 2) {
			return 1;
		} else if (fibonacciArray[number] != 0) {
			return fibonacciArray[number];
		} else {
			int calculatedValue = calculateFibonacciSeries(number - 1) + calculateFibonacciSeries(number - 2);
			fibonacciArray[number] = calculatedValue;
			return calculatedValue;
		}
	}

}
