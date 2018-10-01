package com.patres.training.tricky.creationism;

class GlobalLogic {
    private static long numCreated = 0;

    public GlobalLogic() {
        numCreated++;
    }

    public static long numCreated() {
        return numCreated;
    }
}