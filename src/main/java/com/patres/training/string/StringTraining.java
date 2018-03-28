package com.patres.training.string;

public class StringTraining {

	public static String revers(String stringToRevers) {
		char[] charsToRevers = stringToRevers.toCharArray();
		for (int i = 0; i < stringToRevers.length() / 2; i++) {
			charsToRevers[i] ^= charsToRevers[stringToRevers.length() - i - 1];
			charsToRevers[stringToRevers.length() - i - 1] ^= charsToRevers[i];
			charsToRevers[i] ^= charsToRevers[stringToRevers.length() - i - 1];
		}
		return String.valueOf(charsToRevers);
	}



}
