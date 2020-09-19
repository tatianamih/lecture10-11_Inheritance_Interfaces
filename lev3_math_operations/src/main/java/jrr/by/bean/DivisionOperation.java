package jrr.by.bean;

import jrr.by.interfaces.MathOperation;

public class DivisionOperation implements MathOperation {

    @Override
    public double compute(double a, double b) {
        return a / b;
    }

    @Override
    public String getNameClass() {
        return "Division";
    }
}
