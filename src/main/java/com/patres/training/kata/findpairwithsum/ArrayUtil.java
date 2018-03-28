package com.patres.training.kata.findpairwithsum;

import java.util.Arrays;

public class ArrayUtil {

    public static boolean hasNumberInArray(int[] array, int searchedNumber) {
        if (array.length == 1) {
            return array[0] == searchedNumber;
        }

        if (array[array.length / 2] > searchedNumber) {
            return hasNumberInArray(Arrays.copyOfRange(array, 0, array.length / 2), searchedNumber);
        } else {
            return hasNumberInArray(Arrays.copyOfRange(array, array.length / 2, array.length), searchedNumber);
        }
    }

}
