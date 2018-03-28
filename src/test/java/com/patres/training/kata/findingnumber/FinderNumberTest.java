package com.patres.training.kata.findingnumber;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FinderNumberTest {

	@Test
	public void shouldReturnNumberForArrayWithout3() {
		int[] numberArray = { 2, 4, 5, 1, 6 };
		int result = new FinderNumber(numberArray).find();
		int expected = 3;
		assertEquals(result, expected);
	}

	@Test
	public void shouldReturnNumberForArrayWithout4() {
		int[] numberArray = { 2, 5, 1, 3 };
		int result = new FinderNumber(numberArray).find();
		int expected = 4;
		assertEquals(result, expected);
	}

}
