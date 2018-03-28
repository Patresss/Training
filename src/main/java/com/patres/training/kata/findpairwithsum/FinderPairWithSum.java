package com.patres.training.kata.findpairwithsum;

import java.util.HashSet;
import java.util.Set;

public class FinderPairWithSum {

    public static boolean hasPairWithTwoLoop(int[] numbers, int sumOfPair) {
        for (int x = 0; x < numbers.length; x++) {
            for (int y = 0; y < numbers.length; y++) {
                if (x != y && numbers[x] + numbers[y] == sumOfPair) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasPairWithLoopAndBinarySearch(int[] numbers, int sumOfPair) {
        for (int i = 0; i < numbers.length; i++) {
            int searchedNumber = sumOfPair - numbers[i];
            if (ArrayUtil.hasNumberInArray(numbers, searchedNumber)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasPairWithHash(int[] numbers, int sumOfPair) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            set.add(numbers[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            if (set.contains(sumOfPair - numbers[i])) {
                return true;
            }
        }
        return false;
    }

}
