package com.patres.training.kata.fibonacci;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;

public class FibonacciMemoizationTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void shouldReturn55ForFibonacci10() {
		FibonacciMemoization fibonacci = new FibonacciMemoization();
		int result = fibonacci.getFibonacciSeries(10);
		int expected = 55;
		assertEquals(result, expected);
	}

	@Test
	public void shouldReturn1ForFibonacci1() {
		FibonacciMemoization fibonacci = new FibonacciMemoization();
		int result = fibonacci.getFibonacciSeries(1);
		int expected = 1;
		assertEquals(result, expected);
	}

	@Test
	public void shouldReturn1ForFibonacci2() {
		FibonacciMemoization fibonacci = new FibonacciMemoization();
		int result = fibonacci.getFibonacciSeries(1);
		int expected = 1;
		assertEquals(result, expected);
	}

	@Test
	public void shouldThrowExceptionForFibonacciMinus1() {
		FibonacciMemoization fibonacci = new FibonacciMemoization();
		thrown.expect(IllegalArgumentException.class);
		fibonacci.getFibonacciSeries(-1);
	}

}
