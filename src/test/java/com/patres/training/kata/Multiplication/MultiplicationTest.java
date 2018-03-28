package com.patres.training.kata.Multiplication;

import com.patres.training.kata.multiplication.Multiplication;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MultiplicationTest {

	@Test
	public void shouldReturn6ForLoopMul3Times2() {
		int result = Multiplication.loopMultiplication(3, 2);
		int expected = 6;
		assertEquals(expected, result);
	}

	@Test
	public void shouldReturnMinus6ForLoopMul3TimesMinus2() {
		int result = Multiplication.loopMultiplication(3, -2);
		int expected = -6;
		assertEquals(expected, result);
	}

	@Test
	public void shouldReturnMinus6ForLoopMulMinus3Times2() {
		int result = Multiplication.loopMultiplication(-3, 2);
		int expected = -6;
		assertEquals(expected, result);
	}

	@Test
	public void shouldReturn0ForLoopMul0Times2() {
		int result = Multiplication.loopMultiplication(0, 2);
		int expected = 0;
		assertEquals(expected, result);
	}

	@Test
	public void shouldReturn0ForLoopMul3Times0() {
		int result = Multiplication.loopMultiplication(3, 0);
		int expected = 0;
		assertEquals(expected, result);
	}


	@Test
	public void shouldReturn6ForLogMul3Times2() {
		int result = Multiplication.logMultiplication(3, 2);
		int expected = 6;
		assertEquals(expected, result);
	}

	@Test
	public void shouldReturnMinus6ForLogMul3TimesMinus2() {
		int result = Multiplication.logMultiplication(3, -2);
		int expected = -6;
		assertEquals(expected, result);
	}

	@Test
	public void shouldReturnMinus6ForLogMulMinus3Times2() {
		int result = Multiplication.logMultiplication(-3, 2);
		int expected = -6;
		assertEquals(expected, result);
	}

	@Test
	public void shouldReturn0ForLogMul0Times2() {
		int result = Multiplication.logMultiplication(0, 2);
		int expected = 0;
		assertEquals(expected, result);
	}

	@Test
	public void shouldReturn0ForLogMul3Times0() {
		int result = Multiplication.logMultiplication(3, 0);
		int expected = 0;
		assertEquals(expected, result);
	}


}
