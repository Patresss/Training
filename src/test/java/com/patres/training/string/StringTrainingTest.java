package com.patres.training.string;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class StringTrainingTest {

	/**
	 * Różnica między "string" a new String("string")
	 * <p>
	 * Dwie pierwsze linijki to dwie zmienne, dwie referencje i dwa różne obiekty (które mają w taką
	 * samą zawartość). Dwie ostatnie linijki to dwie zmienne, dwie referencje i jeden obiekt. Obie
	 * referencje pokazują na obiekt utworzony w 3 linijce. Innymi słowy konstruktor tworzy kopię
	 * przekazanego literału. Literał może czasami ograniczyć ilość zużytego miejsca na stercie.
	 */
	@Test
	public void objectStringTest() {
		String x1 = new String("x");
		String x2 = new String("x");
		String x3 = "x";
		String x4 = "x";

		assertTrue(x1 != x2);
		assertTrue(x1 != x3);
		assertTrue(x1 != x4);
		assertTrue(x2 != x3);
		assertTrue(x2 != x4);
		assertTrue(x3 == x4);
	}

	@Test
	public void stringShouldBeReversed() {
		String stringToRevers = "abcde$12345";
		String expectedString = "54321$edcba";
		String reversedString = StringTraining.revers(stringToRevers);
		assertEquals(expectedString, reversedString);
	}

}
