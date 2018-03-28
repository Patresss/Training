package com.patres.training.tricky;

import org.junit.jupiter.api.Test;

/**
 * source:
 * www.java67.com
 * stackoverflow.com
 * javastart.pl
 */
public class TrickyQuestions {

	/**
	 * Q: What does the following Java program print
	 * A: 0.0
	 * <p>
	 * This question is tricky because unlike the Integer, where MIN_VALUE is
	 * negative, both the MAX_VALUE and MIN_VALUE of the Double class are
	 * positive numbers. The Double.MIN_VALUE is 2^(-1074), a double constant
	 * whose magnitude is the least among all double values. So unlike the
	 * obvious answer, this program will print 0.0 because Double.MIN_VALUE
	 * is greater than 0.
	 */
	@Test
	public void doubleMinValueQuestion() {
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
	}

	/**
	 * Q: Does finally block Override the values returned by try-catch block?
	 * A: Yes
	 * <p>
	 * Yes. Finally block overrides the value returned by try and catch blocks
	 * function returnIntInTryWithFinally return 3
	 */
	@Test
	public void returnIntInTryWithFinallyQuestion() {
		System.out.println(returnIntInTryWithFinally());
	}

	private int returnIntInTryWithFinally() {
		try {
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}

	/**
	 * Q: When double x != x?
	 * A: For x: = Double.NaN
	 * <p>
	 * NaN is by definition not equal to any number including NaN.
	 * This is part of the IEEE 754 standard and implemented by the CPU/FPU.
	 */
	@Test
	public void equalsButNotEqualsDoubleQuestion() {
		double x = Double.NaN;
		double first = x;
		double second = x;
		System.out.println(first == second);
	}

	/**
	 * Q: What does the following Java program print
	 * A: Result: 1.0
	 * <p>
	 * Otherwise, binary numeric promotion (§5.6.2) is applied to the operand types,
	 * and the type of the conditional expression is the promoted type of the second
	 * and third operands. Note that binary numeric promotion performs unboxing
	 * conversion (§5.1.8) and value set conversion (§5.1.13).
	 */
	@Test
	public void conditionalOperatorQuestion() {
		boolean check = true;
		Number number = check ? new Integer(1) : new Double(2.0);
		System.out.println("Result: " + number);
	}

}
