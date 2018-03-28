package com.patres.training.optymalization;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


/**
 * Benchmark                       Mode  Cnt   Score   Error  Units
 * MapHashMapBenchmark.useHashMap  avgt   10  17,886 ± 2,279  us/op
 * MapHashMapBenchmark.useMap      avgt   10  18,445 ± 1,796  us/op
 */
@State(Scope.Thread)
public class MapHashMapBenchmark {

    private int iterations = 1000;

    public static void main(String[] args) throws Exception {
        long time = 2;
        Options opt = new OptionsBuilder()
                .include(MapHashMapBenchmark.class.getSimpleName())
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
    public void useMap() {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < iterations; i++) {
            map.put(i, "Test");
        }
    }

    @Benchmark
    public void useHashMap() {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < iterations; i++) {
            map.put(i, "Test");
        }
    }

}
