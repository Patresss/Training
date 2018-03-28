package com.patres.training.kata.fizzbuzz;

import java.util.stream.IntStream;

/**
 * Write a program that prints the numbers from 1 to 100. But for multiples of
 * three print “Fizz” instead of the number and for the multiples of five print
 * “Buzz”. For numbers which are multiples of both three and five print
 * “FizzBuzz”."
 */
public class FizzBuzz {

	private final static String FIZZ = "Fizz";
	private final static String BUZZ = "Buzz";

	public static void print(int numberOfFizzBuzz) {
		IntStream.range(1, numberOfFizzBuzz).forEach(counter -> System.out.println(createFizzBuzzFromNumber(counter)));
	}

	public static void print() {
		print(100);
	}

	public static String createFizzBuzzFromNumber(int number) {
		String fizzBuzz = "";
		if (isFizz(number)) {
			fizzBuzz += FIZZ;
		}
		if (isBuzz(number)) {
			fizzBuzz += BUZZ;
		}
		return fizzBuzz.isEmpty() ? Integer.toString(number) : fizzBuzz;
	}

	private static boolean isFizz(int number) {
		return number % 3 == 0;
	}

	private static boolean isBuzz(int number) {
		return number % 5 == 0;
	}
}
