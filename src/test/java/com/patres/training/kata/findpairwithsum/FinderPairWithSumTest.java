package com.patres.training.kata.findpairwithsum;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FinderPairWithSumTest {

    private static int[] numbers = {3, 8, 11, 12, 13, 14, 18, 20, 22, 26, 27, 29, 31, 36, 38};

    @Test
    public void shouldReturnTrueForSum20WithTwoLoop() {
        boolean expected = true;
        boolean result = FinderPairWithSum.hasPairWithTwoLoop(numbers, 20);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnTrueForSum23WithTwoLoop() {
        boolean expected = true;
        boolean result = FinderPairWithSum.hasPairWithTwoLoop(numbers, 23);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnFalseForSum18WithTwoLoop() {
        boolean expected = false;
        boolean result = FinderPairWithSum.hasPairWithTwoLoop(numbers, 18);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnFalseForSum500WithTwoLoop() {
        boolean expected = false;
        boolean result = FinderPairWithSum.hasPairWithTwoLoop(numbers, 500);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnFalseForSum5WithTwoLoop() {
        boolean expected = false;
        boolean result = FinderPairWithSum.hasPairWithTwoLoop(numbers, 5);
        assertEquals(expected, result);
    }


    
    @Test
    public void shouldReturnTrueForSum20WithLoopAndBinarySearch() {
        boolean expected = true;
        boolean result = FinderPairWithSum.hasPairWithLoopAndBinarySearch(numbers, 20);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnTrueForSum23WithLoopAndBinarySearch() {
        boolean expected = true;
        boolean result = FinderPairWithSum.hasPairWithLoopAndBinarySearch(numbers, 23);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnFalseForSum18WithLoopAndBinarySearch() {
        boolean expected = false;
        boolean result = FinderPairWithSum.hasPairWithLoopAndBinarySearch(numbers, 18);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnFalseForSum500WithLoopAndBinarySearch() {
        boolean expected = false;
        boolean result = FinderPairWithSum.hasPairWithLoopAndBinarySearch(numbers, 500);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnFalseForSum5WithLoopAndBinarySearch() {
        boolean expected = false;
        boolean result = FinderPairWithSum.hasPairWithLoopAndBinarySearch(numbers, 5);
        assertEquals(expected, result);
    }



    @Test
    public void shouldReturnTrueForSum20WithHash() {
        boolean expected = true;
        boolean result = FinderPairWithSum.hasPairWithHash(numbers, 20);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnTrueForSum23WithHash() {
        boolean expected = true;
        boolean result = FinderPairWithSum.hasPairWithHash(numbers, 23);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnFalseForSum18WithHash() {
        boolean expected = false;
        boolean result = FinderPairWithSum.hasPairWithHash(numbers, 18);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnFalseForSum500WithHash() {
        boolean expected = false;
        boolean result = FinderPairWithSum.hasPairWithHash(numbers, 500);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnFalseForSum5WithHash() {
        boolean expected = false;
        boolean result = FinderPairWithSum.hasPairWithHash(numbers, 5);
        assertEquals(expected, result);
    }
}
