package com.patres.training.concurrent.future;

import java.util.concurrent.*;

public class FutureApp {

    public static void main(String[] args) {
        Callable<Integer> task = () -> {
            TimeUnit.SECONDS.sleep(1);
            return 321;
        };

        ExecutorService executor = Executors.newFixedThreadPool(3);
        Future<Integer> future1 = executor.submit(task);
        Future<Integer> future2 = executor.submit(task);
        Future<Integer> future3 = executor.submit(task);

        try {
            checkFuture(future1);
            checkFuture(future2);
            checkFuture(future3);
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void checkFuture(Future<Integer> future) throws ExecutionException, InterruptedException {
        System.out.println("Future: " + future.toString() + " is done: " + future.isDone());
        Integer value = future.get();
        System.out.println("Future: " + future.toString() + " is done: " + future.isDone());
        System.out.println("Future: " + future.toString() + " value: " + value);
    }
}
