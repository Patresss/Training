package com.patres.training.number;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IntegerOperationsTest {

	private int min = 0;
	private int max = 100;

	@Test
	public void shouldReturnTrueFor5() {
		Integer value = 5;
		boolean expected = true;
		boolean result = IntegerOperations.numberIsBetween(value, min, max);
		assertEquals(expected, result);
	}

	@Test
	public void shouldReturnTrueFor0() {
		Integer value = 0;
		boolean expected = true;
		boolean result = IntegerOperations.numberIsBetween(value, min, max);
		assertEquals(expected, result);
	}

	@Test
	public void shouldReturnTrueFor100() {
		Integer value = 100;
		boolean expected = true;
		boolean result = IntegerOperations.numberIsBetween(value, min, max);
		assertEquals(expected, result);
	}

	@Test
	public void shouldReturnFalseFor101() {
		Integer value = 101;
		boolean expected = false;
		boolean result = IntegerOperations.numberIsBetween(value, min, max);
		assertEquals(expected, result);
	}

	@Test
	public void shouldReturnFalseForMinus1() {
		Integer value = -1;
		boolean expected = false;
		boolean result = IntegerOperations.numberIsBetween(value, min, max);
		assertEquals(expected, result);
	}

}
