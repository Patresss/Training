package com.patres.training.concurrent;

public class SampleRunnableClass implements Runnable {

	private static int counter = 0;

	@Override
	public void run() {
		System.out.println("Runnable counter:  " + ++counter);
	}

}
