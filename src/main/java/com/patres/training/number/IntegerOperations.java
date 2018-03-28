package com.patres.training.number;

public class IntegerOperations {

	public static boolean numberIsBetween(Integer number, Integer min, Integer max) {
		return number.compareTo(min) >= 0 && number.compareTo(max) <= 0;
	}
}
