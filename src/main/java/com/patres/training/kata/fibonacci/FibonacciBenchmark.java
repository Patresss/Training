package com.patres.training.kata.fibonacci;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
public class FibonacciBenchmark {

	private final static int FIBONACCI_NUMBER = 40;

	public static void main(String[] args) throws Exception {
		long time = 2;
		Options opt = new OptionsBuilder()
				.include(FibonacciBenchmark.class.getSimpleName())
				.warmupIterations(5)
				.forks(2)
				.measurementIterations(5)
				.measurementTime(TimeValue.seconds(time))
				.timeUnit(TimeUnit.MICROSECONDS)
				.mode(Mode.AverageTime)
				.build();

		new Runner(opt).run();
	}


	@Benchmark
	public void fibonacciRecursion() {
		FibonacciRecursion fibonacci = new FibonacciRecursion();
		fibonacci.getFibonacciSeries(FIBONACCI_NUMBER);
	}

	@Benchmark
	public void fibonacciMemoization() {
		FibonacciMemoization fibonacci = new FibonacciMemoization();
		fibonacci.getFibonacciSeries(FIBONACCI_NUMBER);
	}

	@Benchmark
	public void fibonacciIterations() {
		FibonacciIterations fibonacciIterations = new FibonacciIterations();
		fibonacciIterations.getFibonacciSeries(FIBONACCI_NUMBER);
	}


}
