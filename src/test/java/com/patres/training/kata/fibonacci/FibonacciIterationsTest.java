package com.patres.training.kata.fibonacci;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;

public class FibonacciIterationsTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void shouldReturn55ForFibonacci10() {
		int result = FibonacciIterations.getFibonacciSeries(10);
		int expected = 55;
		assertEquals(result, expected);
	}


	@Test
	public void shouldReturn1ForFibonacci1() {
		int result = FibonacciIterations.getFibonacciSeries(1);
		int expected = 1;
		assertEquals(result, expected);
	}

	@Test
	public void shouldReturn1ForFibonacci2() {
		int result = FibonacciIterations.getFibonacciSeries(1);
		int expected = 1;
		assertEquals(result, expected);
	}

	@Test
	public void shouldThrowExceptionForFibonacciMinus1() {
		thrown.expect(IllegalArgumentException.class);
		FibonacciIterations.getFibonacciSeries(-1);
	}

}
