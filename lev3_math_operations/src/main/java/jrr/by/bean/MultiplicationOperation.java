package jrr.by.bean;

import jrr.by.interfaces.MathOperation;

public class MultiplicationOperation implements MathOperation {
    @Override
    public double compute(double a, double b) {
        return a * b;
    }

    @Override
    public String getNameClass() {
        return "Multiplication";
    }
}
