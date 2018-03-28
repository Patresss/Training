package com.patres.training.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrentExample {

	private static final int numberOfThreads = 10;

	public static void concurrentTypicalRun() {
		List<Thread> threads = new ArrayList<>();

		for (int i = 0; i < numberOfThreads; i++) {
			Runnable runnable = new SampleRunnableClass();
			threads.add(new Thread(runnable));
		}

		threads.forEach(Thread::start);
	}

	public static void concurrentJava8Run() {
		AtomicInteger counter = new AtomicInteger();
		List<Thread> threads = new ArrayList<>();
		Runnable task = () -> System.out.println("Runnable Java 8 counter:  " + counter.incrementAndGet());

		for (int i = 0; i < numberOfThreads; i++) {
			threads.add(new Thread(task));
		}

		threads.forEach(Thread::start);
	}

}
