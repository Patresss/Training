package com.patres.training.optymalization;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.util.concurrent.TimeUnit;


/**
 * Benchmark                                   Mode  Cnt  Score   Error  Units
 * GetterSetterBenchmark.useDirectlyValue      avgt   10  1,446 ± 0,078  us/op
 * GetterSetterBenchmark.useGetterSetterValue  avgt   10  1,411 ± 0,063  us/op
 */
@State(Scope.Thread)
public class GetterSetterBenchmark {

    private SampleClass sampleClass = new SampleClass();
    private int iterations = 1000;

    public static void main(String[] args) throws Exception {
        long time = 2;
        Options opt = new OptionsBuilder()
                .include(GetterSetterBenchmark.class.getSimpleName())
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
    public void useDirectlyValue() {
        for (int i = 0; i < iterations; i++) {
            sampleClass.useDirectlyValue();
        }
    }

    @Benchmark
    public void useGetterSetterValue() {
        for (int i = 0; i < iterations; i++) {
            sampleClass.useGetterSetterValue();
        }
    }

}
