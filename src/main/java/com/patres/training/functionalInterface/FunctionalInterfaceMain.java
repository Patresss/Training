package com.patres.training.functionalInterface;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionalInterfaceMain {

    public static void main(String[] args) {
        Consumer<String> printConsumer = System.out::println;
        printConsumer.accept("Paul");
        printConsumer.accept("Richard");


        Supplier<Integer> printRandomValue = FunctionalInterfaceMain::calculateInteger;
        System.out.println(printRandomValue.get());
        System.out.println(printRandomValue.get());
    }

    private static Integer calculateInteger() {
        return new Random().nextInt();
    }

}
