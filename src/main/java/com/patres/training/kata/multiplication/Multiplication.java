package com.patres.training.kata.multiplication;

public class Multiplication {

	public static int loopMultiplication(int number1, int number2) {
		int result = 0;
		for (int i = 0; i < Math.abs(number2); i++) {
			result += number1;
		}
		return number2 >= 0 ? result : -result;
	}

	public static int logMultiplication(int number1, int number2) {
		return (int) Math.round(Math.exp(Math.log10(number1) + Math.log10(number2)));
	}
}
