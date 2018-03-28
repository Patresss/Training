package com.patres.training.optymalization;

public class SampleClass {

    private double value = 1.001;

    public void useDirectlyValue() {
        value = value * value;
    }

    public void useGetterSetterValue() {
        setValue(getValue() * getValue());
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
