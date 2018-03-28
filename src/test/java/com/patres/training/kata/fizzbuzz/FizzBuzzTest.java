package com.patres.training.kata.fizzbuzz;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FizzBuzzTest {

	@Test
	public void shouldReturnFizzWhenNumberIsDivisibleBy3() {
		String result = FizzBuzz.createFizzBuzzFromNumber(3);
		String expected = "Fizz";
		assertEquals(result, expected);
	}

	@Test
	public void shouldReturnBuzzWhenNumberIsDivisibleBy5() {
		String result = FizzBuzz.createFizzBuzzFromNumber(5);
		String expected = "Buzz";
		assertEquals(result, expected);
	}

	@Test
	public void shouldReturnFizzBuzzWhenNumberIsDivisibleBy3And5() {
		String result = FizzBuzz.createFizzBuzzFromNumber(15);
		String expected = "FizzBuzz";
		assertEquals(result, expected);
	}

	@Test
	public void shouldReturnNumberWhenNumberIsNotDivisibleBy3And5() {
		String result = FizzBuzz.createFizzBuzzFromNumber(1);
		String expected = "1";
		assertEquals(result, expected);
	}

}
