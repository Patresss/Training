package com.patres.training.tricky.cache;

class Cache {
    private static int sum;
    private static boolean initialized = false;

    static {
        initializeIfNecessary();
    }

    public static int getSum() {
        initializeIfNecessary();
        return sum;
    }

    private static synchronized void initializeIfNecessary() {
        if (!initialized) {
            for (int i = 0; i < 100; i++)
                sum += i;
            initialized = true;
        }
    }
}