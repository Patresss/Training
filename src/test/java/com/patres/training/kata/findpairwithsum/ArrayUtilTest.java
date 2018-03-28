package com.patres.training.kata.findpairwithsum;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ArrayUtilTest {

    private static int[] numbers = {3, 8, 11, 12, 13, 14, 18, 20, 22, 26, 27, 29, 31, 36, 38};

    @Test
    public void shouldReturnTrueFor20() {
        boolean expected = true;
        boolean result = ArrayUtil.hasNumberInArray(numbers, 20);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnTrueFor3() {
        boolean expected = true;
        boolean result = ArrayUtil.hasNumberInArray(numbers, 3);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnTrueFor38() {
        boolean expected = true;
        boolean result = ArrayUtil.hasNumberInArray(numbers, 38);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnFalseFor1() {
        boolean expected = false;
        boolean result = ArrayUtil.hasNumberInArray(numbers, 1);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnFalseForMinus4() {
        boolean expected = false;
        boolean result = ArrayUtil.hasNumberInArray(numbers, 4);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnFalseFor15() {
        boolean expected = false;
        boolean result = ArrayUtil.hasNumberInArray(numbers, 15);
        assertEquals(expected, result);
    }

}
